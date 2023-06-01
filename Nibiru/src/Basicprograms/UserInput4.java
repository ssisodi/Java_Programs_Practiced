package Basicprograms;

import java.util.Scanner;

public class UserInput4 {
	static int a; 
	static float b = 1f; 
	static String que; 
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter a integer number: ");
		a = sc.nextInt();
		System.out.println("Your entered value is "+a);
		
		System.out.println("Enter a float number: "); 
		b = sc.nextFloat(); 
		System.out.println("Your entered float value is "+b);
		
		System.out.println("Enter a String value"); 
		que = sc.next(); 
		System.out.println("Your entered String value is "+que); 
		
	}

}
