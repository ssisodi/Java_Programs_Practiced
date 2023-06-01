package Basicprograms;

import java.util.Scanner;
/* 1.Take two inputs from the user 
 * 2.Initialize the third variable 
 * 3.Swap any one number with the third variable. 
 * 4. swap the empty variable with the one to be swapped 
 * */

public class TwoNosSwap6 {

	public static void main(String[] args) {
		int num1, num2, third;
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the two numbers to be swapped: "); 
		num1 = sc.nextInt(); 
		num2 = sc.nextInt(); 
		System.out.println("The number 1 you entered is: " +num1); 
		System.out.println("The number 2 you entered is: "+num2);
		
		third = num1; 
		num1 = num2; 
		num2 = third; 
		
		System.out.println("==============================================");
		
		System.out.println("The two number after swapping are as below");
		System.out.println("The new number 1 is: "+num1); 
		System.out.println("The new number 2 is: "+num2); 
	}
}
