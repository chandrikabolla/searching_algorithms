package searching;

public class LinearSearch {
	
	public static void main(String args[])
	{
		int[] array=new int[]{1,2,3,4,5,6,7,8,9,10};
		int searchFor=1;
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
		for(int i=0;i<n;i++)
		{
			if(arr[i]==searchFor)
			{
				return arr[i];
			}
		}
		return -1;
	}

}
