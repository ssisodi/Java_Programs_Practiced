package Basicprograms;

import java.util.Scanner;

public class TwoNosSwap7 {

	public static void main(String[] args) {
		
		int x, y;
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the two numbers to be swapped: "); 
		x = sc.nextInt(); 
		y = sc.nextInt(); 
		System.out.println("The number 1 you entered is: " +x); 
		System.out.println("The number 2 you entered is: "+y);
		
		x = x + y;
		y = x - y; 
		x = x - y; 
		
		System.out.println("==============================================");
		
		System.out.println("The two number after swapping are as below");
		System.out.println("The new number 1 is: "+x); 
		System.out.println("The new number 2 is: "+y); 
	}

}
