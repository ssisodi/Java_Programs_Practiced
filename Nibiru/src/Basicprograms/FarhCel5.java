package Basicprograms;

import java.util.Scanner;

public class FarhCel5 {

	public static void main(String[] args) {
	int TempFarh;
	int TempCel; 
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the temperature in Fahrenheit: "); 
	TempFarh = sc.nextInt(); 
	
	TempCel = (TempFarh - 32)*5/9;
	
	System.out.println("The temperature in Celcius is: " + TempCel); 		
	}
}
