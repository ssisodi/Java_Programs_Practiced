package batman;

public class StaticMethodOverloading {
	
	static void sum()
	{
			System.out.println("Zero argument static method");
	}
	static void sum(int a)
	{
		System.out.println("Integer argument static method");
	}
	static void sum(char c, float f)
	{
		System.out.println("Two argument static method");
	}
	
	public static void main(String[] args) 
	
	{ 
		StaticMethodOverloading.sum(); 
		StaticMethodOverloading.sum(10); 
		StaticMethodOverloading.sum('d',10.5f);
		
		

	}

}
