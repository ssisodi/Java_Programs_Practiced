package batman;

public class NonStaticMethodoverloading
{

	void sum(int a, int b)
	{
		System.out.println(a+b);
	}
	
	void sum(int a, int b, int c)
	{
		System.out.println(a+b+c);
	}
	
	void sum(double ab , int cd)
	{
		System.out.println(ab + cd);
	}
	
	void sum(int nv, double fi)
	{
		System.out.println(nv+fi);
	}
// For all the methods above with same name and different arguments, binding occurs due to arguments 
		public static void main(String[] args) 
		{
			NonStaticMethodoverloading M = new NonStaticMethodoverloading();
			M.sum(4, 5);
			M.sum(4, 5, 7);
			M.sum(250.00, 40);
			M.sum(40, 7.6);		
		}

}
