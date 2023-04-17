package batman;

public class Array3 {

	public static void main(String[] args) {
		//program to sort an array in ascending order
		
		int arr[]= {0, 23, 14, 12, 9};
		
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]<=arr[i+1])
			{
				int b = arr[i+1];
				arr[i+1] = arr[i];
				arr[i]= b;
			}
			else
			{
				int a = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = a; 
			}
		}
		
		for(int j=arr.length - 1;j>=0;j--)
		{
		System.out.print(arr[j]);
		}
	}
}