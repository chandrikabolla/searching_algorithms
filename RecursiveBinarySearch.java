package searching;
//the array passed should be a sorted array
public class RecursiveBinarySearch {
	public static void main(String args[]){
	int[] array=new int[]{1,2,3,4,5,6,7,8,9,10};
	int searchFor=7;
	int found=search(array,0,array.length-1,searchFor);
	if(found==searchFor)
	{
		System.out.println("Element found");
	}
	else if(found==-1){
		System.out.println("Element not found");
	}
	
	}
	public static int search(int[] arr,int left,int right,int searchFor)
	{
		
		if(left<=right)
		{
			int middle=(left+right)/2;
			
			if(arr[middle]==searchFor)
			{
				return arr[middle];
			}
			
			else if(arr[middle]<searchFor)
			{
				return search(arr,middle+1, right, searchFor);
			}
			else if(arr[middle]>searchFor)
			{
				return search(arr,left,middle-1,searchFor);
			}
		}
			
				return -1;
			
	}
}
