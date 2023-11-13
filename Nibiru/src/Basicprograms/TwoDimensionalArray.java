package Basicprograms;
/*1) Declare an array
 * 2) Insert values into array
 * 3) Find size of an array
 * 4) Read single value from an array
 * 5) Read multiple values from an array
 * */
public class TwoDimensionalArray {

	public static void main(String[] args) {
		
		// Approach 1: Adding the data when the size is fixed
		
		// Declaration
		// integer array[][] = new integer[row][column];
		int a[][] = new int [3][2];
		a[0][0] = 100; 
		a[0][1] = 200;
		
		a[1][0] = 300;
		a[1][1] = 400; 
		
		a[2][0] = 500; 
		a[2][1] = 600; 
		
		// Approach 2: Adding the data when size is not fixed
		
		int b[][] = {{100,200},{300,400},{500,600}};
		
		// length of two dimensional array
		System.out.println(b[0].length);
		
		//read specific value
		System.out.println(b[2][0]); //500
		
		// reading data from array using classic FOR loop 
		
		for(int i=0; i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				System.out.print(b[i][j]);
			}
			System.out.println();
		}	
	}

}
