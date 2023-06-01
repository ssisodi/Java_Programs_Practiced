package Basicprograms;
import java.util.Scanner;

public class NestedIf9 {
	
	public static void main(String[] args) 
	{
	 int marksObtained,passingMarks;
	 char grade;
	 passingMarks = 40;
	 
	 Scanner input = new Scanner(System.in); //Step 1: Initializing scanner input using Scanner class
	 
	 System.out.println("Input marks scored by you: "); // Step 2: This is the text we want to display to get input.
	 marksObtained = input.nextInt(); // Step 3: Using Scanner class object reference chaining it to 'nextInt()' method 
	 								  //and storing it in Integer variable marksObtained. 
	 /*Conditional If-Else loop*/
	 if (marksObtained >= passingMarks) //Condition 1 is checked.
	 {
	 if (marksObtained > 90)//Condition 2 is checked when condition 1 is True
	 {
		 grade = 'A';
	 }
	 else if (marksObtained > 75)// Condition 3 is checked when condition 2 is False & condition 1 is true
	 {
		 grade = 'B';
	 }
	 else if (marksObtained > 60)// Condition 4 is checked when condition 3 is False & condition 1 is true
	 {
		 grade = 'C';
	 }
	 else
	 {
		 grade = 'D'; // Condition 5 is last option when condition 4 is False & condition 1 is true
	 }
	 System.out.println("You passed the exam and your grade is " + grade); // This statement will execute when all the conditions are false
	 }
	 else { //When condition 1 is False then grade F is executed. 
	 {
		 grade = 'F';
	 }
	 System.out.println("You failed and your grade is " + grade);// This statement will execute when all the conditions are false. 
	 }
	}
  }
