package batman;

public class Methoverride extends NonStaticMethodOverriding {
	
	void sum()
	{
		System.out.println("sub class");
	}

	public static void main(String[] args) {
		
		Methoverride mov = new Methoverride();
		
		mov.sum();
	}

}
