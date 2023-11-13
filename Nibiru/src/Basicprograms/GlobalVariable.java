package Basicprograms;

public class GlobalVariable {
	// Global variable is a variable that is declared and initialzed once and it's scope is throughout the program. 
	// But there are two types of global variable - Static global variable and non-static global variable. 
	//let's define both the types 
	static int a = 10; // Static global variable
	int b = 20; // Non-static global variable
	
	void test1() //non-static method
	{
		System.out.println(a);
		System.out.println(b);
	}
	
	static void test2()//static method
	{
		System.out.println(a);
	//	System.out.println(b); 
		/*You can see non-static variable 
		 * cannot be called in static method.*/
		
		GlobalVariable obj1 = new GlobalVariable();
		System.out.println(obj1.b); // 
	}
	
	GlobalVariable() //user-defined constructor
	{
		System.out.println(a); // Global variable is called
		System.out.println(b); // inside the constructor
	}
	
	public static void main(String[] args) 
	{
	//	System.out.println(b);
        /* This line would result in a compilation error because
         * 'b' is non-static and cannot be accessed in a static context.*/
		
		System.out.println(a);
		
		GlobalVariable obj = new GlobalVariable(); 
		System.out.println(obj.b);
		/* You create an instance of the class, and through that instance, 
		 * you can access the non-static global variable 'b'.*/
		
	}

}
