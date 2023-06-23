package Basicprograms;

import java.util.Scanner;

public class compareLetters {
	

	public static void main(String[] args) {
		// Compare each letters of two strings and print only the letter's that match
		
		/*Take two strings from Scanner class 
		 * Sort the string by CharAt() method and take each character of that string in an array
		 * After we have two arrays of characters, compare both the arrays index by index. 
		 * If the character is a match, then print it in output as similar alphabets.
		 * */
		 
		
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the first word: "); 
		String first = sc.next();
		
		System.out.println("Enter the second word: "); 
		String second = sc.next(); 
		
		char arr1[] = new char [first.length()]; 
		char arr2[] = new char [second.length()]; 
		
		for(int i=0;i<first.length();i++)
				{
					arr1[i] = first.charAt(i); 		
					System.out.print("The first word is:"+arr1[i]);
					for(int j=0;j<second.length();j++)
						{
						arr2[j] = second.charAt(j); 
						System.out.print("The second word is:"+ arr2[j]);
						if(arr1[i] == arr2[j])
							{
								System.out.println("The common letters are: "+ arr1[i]+",");
							}
						}
				}
		
		

	}

}
