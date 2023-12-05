package Basicprograms;
import java.util.Scanner;

/* Online Java Compiler and Editor */
/*
    1. Take input from the user in the form of String
    2. Then break the string by each character
    3. Collect each of the character of the string in a single dimensional array
    4. Before all that, declare a Character array as 'Vowels' 
    5. Now using conditional if-else compare each character of the input string and compare it with the character array. */

public class HelloWorld{
	

     public static void main(String []args)
     
     {
    Scanner sc = new Scanner(System.in); 
    System.out.println("Enter your String:");
    String input = sc.nextLine();
    
    char arr1[] = input.toCharArray(); 
    
    for(int i =0; i<input.length();i++)
    {
    System.out.println("The input string chopped in characters are:"+ arr1[i]);
    }
    
    //Fixed character array for vowels 
    char arr2[] = {'a','e','i','o','u'};
    
    for(int j=0;j<input.length();j++)
    {
        for(int k=0;k<=4;k++)
        {
            if(arr1[j]==arr2[k])
            {
                System.out.println("The vowel is:"+ arr1[j]); 
                
                break;               
            }  
            else 
            {
            	System.out.println("Consonant left is:"+arr1[j]);
            	break;
            }
        }
        
    }
  }
}



