package searching;
//array should be a sorted array
public class IterativeJumpSearch {
	
	public static void main(String args[])
	{
		int[] array=new int[]{1,2,3,4,5,6,7,8,9,10};
		int searchFor=10;
		int fountAtIndex=search(array,array.length,searchFor);
		if(fountAtIndex!=-1)
		{
			System.out.println("Element found at "+fountAtIndex);
		}
		else{
			System.out.println("Element not found");
		}
	}
	public static int search(int[] arr,int n,int searchFor)
	{
		int jumpFrom=0;
		int jumpTo=(int)Math.floor(Math.sqrt(n));
		while(arr[Math.min(jumpTo,n)-1]<searchFor)
		{
			jumpFrom=jumpTo;
			jumpTo+=(int)Math.floor(Math.sqrt(n));
			if(jumpFrom>=n)
			{
				return -1;
			}
		}
		while(arr[jumpFrom]<searchFor)
		{
			jumpFrom++;
			if(jumpFrom==Math.min(jumpTo, n))
			{
				return -1;
			}
		}
		if(arr[jumpFrom]==searchFor)
		{
			return jumpFrom;
		}
		
		return -1;
	}
}
