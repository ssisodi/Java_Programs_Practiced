package batman;

public class MethodSubclass1 extends Methodoverriding1{

	public void demo()
	{
		System.out.println("Replacement"); 
	}
	
	public static void main (String args[])
	{
		MethodSubclass1 proof = new MethodSubclass1();
		proof.demo();				
		
	}

}
