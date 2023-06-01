package Basicprograms;

import java.math.BigInteger;
import java.util.Scanner;

public class AddTwoLarge8 {

	public static void main(String[] args) {
		String num1, num2; 
		
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the first largest number"); 
		num1 = sc.next(); 
		
		System.out.println("Enter the second largest number"); 
		num2 = sc.next(); 
		
	   /*sum = num1 + num2; 
		System.out.println(sum);*//* This is the wrong way of adding two large numbers
									as you can see the result is concatenated*/
		
		//For Integers available as strings you can initialize them as follows:
		BigInteger first = new BigInteger(num1); 
		BigInteger second = new BigInteger(num2); 
		BigInteger sum; 
		
		sum = first.add(second);
		
		System.out.println(sum);

/* Can you explain big integer in Java in laymen terms?
 * 
 * In layman's terms, a big integer in Java is a special data type that allows you to work with really large whole numbers. In regular Java programming, 
 *the built-in "int" data type has a limit to the size of numbers it can represent. However, sometimes we need to work with numbers that are larger than what the 
 *"int" type can handle.

That's where big integers come in. They allow you to perform operations on numbers that have hundreds, thousands, or even millions of digits. Big integers can be
used to perform calculations accurately without losing any precision.

Imagine you have a number like 1000000000000000000000000000000000000000000000000000. It's a gigantic number that cannot fit into a regular "int" or even a "long"
 data type. With big integers, you can store and manipulate such enormous numbers without any issues.

In addition to basic arithmetic operations like addition, subtraction, multiplication, and division, big integers also provide more advanced functionality, such 
as finding remainders, calculating powers, and checking for primality.

So, to summarize, a big integer in Java is a special data type that allows you to work with extremely large whole numbers accurately and perform various mathematical 
operations on them. It's like having a calculator that can handle numbers with hundreds or thousands of digits!*/		
		
		
		
		
		
		
		
		
		
		

	}

}
