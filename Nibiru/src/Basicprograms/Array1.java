package Basicprograms;
import java.util.*;


public class Array1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string of your choice: ");
		String sen = sc.next(); 
		int s = sen.length();
		char a[] = new char[s];
		
		for(int i=0; i< s;i++)
		{
			a[i] = sen.charAt(i); 
			System.out.print(a[i]);
		}
		
		

	}

}
