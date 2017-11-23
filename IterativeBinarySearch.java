package searching;

//the array passed should be a sorted array
public class IterativeBinarySearch {
	
	public static void main(String args[])
	{
		int[] array=new int[]{1,2,3,4,5,6,7,8,9,10};
		int searchFor=7;
		if(search(array,array.length,searchFor)==searchFor)
		{
			System.out.println("Element found");
		}
		else{
			System.out.println("Element not found");
		}
	}
	
	public static int search(int[] arr,int n,int searchFor)
	{
		int left=0;
		int right=n-1;
		while(left<=right)
		{
			int middle=(left+right)/2;
			
			if(arr[middle]==searchFor)
			{
				return arr[middle];
			}
			
			else if(arr[middle]<searchFor)
			{
				left=middle+1;
			}
			else if(arr[middle]>searchFor)
			{
				right=middle-1;
			}
		}
		return -1;
	}


}
