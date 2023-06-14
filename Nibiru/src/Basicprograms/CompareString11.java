package Basicprograms;

import java.util.Scanner;

public class CompareString11 {
	public static void main(String args[])
	{
		String s1,s2; 
		
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the first line: ");
		s1 = sc.nextLine(); 
		
		System.out.println("Enter the second line: "); 
		s2 = sc.nextLine(); 
		
		if(s1.equals(s2))
		{
			System.out.println("Comparison successfull"); 
		}
		
		
		
	}
	
	
}
