package Basicprograms;

/*Single dimensional arrays
	1) Create an array
	2) Insert values into array
	3) Find size of an array
	4) Read single value from an array
	5) Read multiple values from an array
 * */



public class SingleDimensionalArray {

	public static void main(String[] args) {
		
		int a[] = new int[5];
		/*approach 1: You cannot go beyond 5 elements and if you do then
		 * you'll get 'IndexOutOfBound Exception*/
		
		a[0] = 100; 
		a[1] = 200;
		a[2] = 300;
		a[3] = 400;
		a[4] = 500;
//		a[5] = 600;
		
		//Find size of an array
		
		System.out.println(a.length);
		
		//Get single value from array
		System.out.println(a[3]);
//===============================================================================		
		/*approach 2: In this you can store any number of elements
		 * you do not have to set a size in this.*/
		
		int b[] = {100,200,300,400,500,600}; 
		
		//Find size of an array
		System.out.println("The size of the array "+b.length);
		
		//Get all values from array using loop
		/*for(int i = 0;i<b.length;i++)
		{
			System.out.println("Value of index"+"("+i+")is:"+b[i]);
		}
		*/
		
		//Reading data from array using enhanced for loop
	/*	
		for(int x:b)
		{
			System.out.println(x);
		}
		*/
	}

}
