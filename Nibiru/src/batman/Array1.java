package batman;
//Write a Program to Compare Two Array In Java With Example?
public class Array1 {
	
/*************Array comparison without using method*********************** 
 
 * Initializing two arrays 1 & 2 
 * Comparing the index value of one array to index value of another array
 * If all the values are same then two arrays are same 
 * Or Else two arrays are not same. 
 */

	/*
	public static void main(String[] args) 
	{
		
		int arr1[] = {1,2,3};
		int arr2[] = {1,4,3};
		int count = 0;
		
		int arr1length = arr1.length;
		int arr2length = arr2.length; 
		
		
		for(int i=0;i<arr1length;i++)
		{
			if(arr1[i] == arr2[i])
			{
				count++; 
			}	
		}
		
		System.out.println("Number of array elements that are same: " + count); 
		
		if(arr1length != count)
		{
			System.out.println("Array is not same");
		}
		else
		{
			System.out.println("Array is same"); 
		}
	}
}
	*/
	
/*************Array comparison with using method*********************** 
*	Initialize the arrays 
* Using conditional statements if-else and method such as equals method.
*/
	
	public static void main(String[] args) 
	{
		int arr1[] = {1,2,3};
		int arr2[] = {1,4,3};
		int count = 0;
		
		int arr1length = arr1.length;
		int arr2length = arr2.length; 
		
		if(arr1.equals(arr2))
		{
			System.out.println("Arrays are same");
		}
		else 
		{
			System.out.println("Arrays are not same"); 
		}
	}
}
