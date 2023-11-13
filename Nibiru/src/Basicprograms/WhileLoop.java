package Basicprograms;

public class WhileLoop {

	public static void main(String[] args) {
		
/*While loop [TOP DOWN Approach]
 * What is the syntax
 * 
 * while(condition)
 * {
 * statements;
 * increment/decrement statements are mandatory
 * }
 * 
 * So, how do we think about putting up this condition is
 * we have note down what is it that you want to be repeated.
 * Second thing is you have to understand the starting point
 * and the ending point of the loop. 
 * 
 */
	//Example1: Print 1....10 numbers using while loop
		int i = 1; // initialization
		
		while(i<=10) // condition
		{
			System.out.println(i);
			i++;// incrementation
		}
	
		// Example 2: Print even numbers between 1.....10
		
		int j = 2; 
		
		while(j<=10)
		{
			System.out.println(j);//2
			//j = j+2; OR you can also write it like 
			j+=2;
		}
		
		
		
		
		
		
	}

}
