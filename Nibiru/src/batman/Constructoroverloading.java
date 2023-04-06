package batman;

public class Constructoroverloading 
	{

	Constructoroverloading(int a, int b)
	{
		System.out.println(a+b);
	}
	
	Constructoroverloading(int a, int b, int c)
	{
		System.out.println(a+b+c);
	}
	
	Constructoroverloading(double ab, double yg)
	{
		System.out.println(ab+yg);
	}
	
	Constructoroverloading(int r, double tr)
	{
		System.out.println(r + tr);
	}
	
	public static void main(String[] args) 
	{
	 new Constructoroverloading(3,4);
	 
	 new Constructoroverloading(5,6,7);
	 
	 new Constructoroverloading(3.50000,6.58948);
	 
	 new Constructoroverloading(6,6.977974);
	 
	}
}
