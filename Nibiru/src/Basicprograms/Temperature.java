package Basicprograms;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		
		// Write a Java program to convert from Fahrenheit to Celsius? 
		//Temperature in degrees Celsius (°C) = (Temperature in degrees Fahrenheit (°F) - 32) * 5/9.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the temperature in Fahrenhait:"); 
		int Fahr = sc.nextInt(); 
		
		int Celc = (Fahr - 32) * 5/9;
		
		System.out.println(Celc); 
		
	}

}
