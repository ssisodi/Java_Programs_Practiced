package Basicprograms;

public class LocalVariable {
	
	static int a = 10; // Global Variable
	int b = 20; // Global Variable 
	
	static void test1() // static method
	{
		int x = 30; //Local Variable 
		int y = 40; //Local Variable
	}
	
	void test2() // non-static method
	{
		int e = 50; // Local Variable
		int f = 60; // Local Variable
	}
	
	public static void main(String[] args)
	{
//		System.out.println(x);// Local Variable not getting called in static method
//		System.err.println(y);// Local Variable not getting called in static method
//		
//		System.out.println("======================================================");
//		
//		System.out.println(e);//Local Variable is not accessible from non-static method
//		System.out.println(f);//Local Variable is not accessible from non-static method
	}
}
