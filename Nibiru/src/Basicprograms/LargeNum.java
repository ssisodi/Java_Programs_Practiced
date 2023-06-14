package Basicprograms;

import java.util.Scanner;

public class LargeNum {

	public static void main(String[] args) {
		
		// Find the largest number from a an array
		/*
		 * Take input values in the form of integer value
		 * Now, the moment user enters each integer value, it should assign it to each location of a fixed array. 
		 * For once print all the values of the array. 
		 * Consider the arr[0] as first value entered in the array. 
		 * compare first value with each value in the array, until you see the current max value is lesser than current array value.   
		 * */
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values: "); 
		int a = sc.nextInt(); 
		
		int arr[] =  new int[5]; 
		
		for(int i=0;i<=4;i++)
		{
			arr[i] = a; 
		}
		
		
	}

}
