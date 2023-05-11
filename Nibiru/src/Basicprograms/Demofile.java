package Basicprograms;
import java.util.*;

public class Demofile {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter any random value of your choice: ");
		int val = sc.nextInt(); 
		

		//Even or odd comparison
		

		if(val%2 == 0) 
		{
			System.out.println("Even number");
		}
		else 
		{
			System.out.println("Odd number"); 
		}
	}

}
