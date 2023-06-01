package Python;

import java.util.*;

public class Birthyear {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter your birth year: "); 
		int birth_year = sc.nextInt(); 
		
		int current_age = 2023 - birth_year; // no need to change the data  type of birth year 
		System.out.println(current_age); 

	}

}
