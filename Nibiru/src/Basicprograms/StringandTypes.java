package Basicprograms;

public class StringandTypes {

	public static void main(String[] args) {
		
		String s = new String("Welcome");
		
		System.out.println(s.length());
		
		//concat() - joining strings
		
		String s1 = "welcome";
		String s2 = "to java";
		System.out.println(s1.concat(s2));
		
		//concat() - 3 strings 
		String s3 = "language";
		System.out.println(s1.concat(s2).concat(s3));
		
		// trim() - right and left side spaces.
		s = "    automation    ";
		System.out.println(s.length());		
		String result = s.trim();
		System.out.println(result);
		// length of string after removing string 
		System.out.println(s.trim().length());
		
		//CharAt() - returns a single char based on index we passed.
		String s4 = "udemycourses";
		System.out.println(s4.charAt(0));
		System.out.println(s4.charAt(3));
		
		//contains - returns boolean values as output
		System.out.println(s4.contains("udem"));
		System.out.println(s4.contains("UDEM"));
		
		//equals() , equalsIgnoreCase() -  compare 2 strings returning boolean values
		
		String s5 = "Welcome"; 
		String s6 = "welcome"; 
		System.out.println(s5.equals(s6));
		
		
		
		
		
		
		
		
		
		
		
	}
}
