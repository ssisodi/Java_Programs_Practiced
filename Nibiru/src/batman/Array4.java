package batman;

import java.util.Scanner;

public class Array4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("How many values:");
		int a = sc.nextInt();

		char arr[] = new char[a]; 

		System.out.println("Enter those values");
		String ben = sc.next();

		for(int i=0;i<a;i++)
		{
			arr[i] = ben.charAt(i);
		}
		for(int j=a;j>0;j--)
		{
			System.out.println(arr[j]);
		}
	}
}


