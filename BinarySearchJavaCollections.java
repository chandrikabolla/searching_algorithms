package searching;

import java.util.Arrays;

public class BinarySearchJavaCollections {
	
	public static void main(String args[]){
		int[] array=new int[]{1,2,3,4,5,6,7,8,9,10};
		int searchFor=7;
		int found = 0;
		try{
		found=Arrays.binarySearch(array, searchFor);
		if(array[found]==searchFor)
		{
			System.out.println("Element found");
		}
		else{
			System.out.println("Element not found");
		}
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println(ae+"  The element not found");
		}
		
		
		}

}
