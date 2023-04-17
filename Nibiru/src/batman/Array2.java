package batman;

public class Array2 {

	public static void main(String[] args) 
	{
		// Write a program to reverse an array or string
		
	String name = "Siddhanth";
	char a[] = new char[name.length()];
	
		for(int i=0;i<name.length();i++) 
		{
			a[i] = name.charAt(i);
		}
		
		for(int j=name.length()-1;j>=0;j--)
		{
			System.out.print(a[j]);
		}
		
	}
}
