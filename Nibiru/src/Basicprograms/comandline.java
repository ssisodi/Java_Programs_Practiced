package Basicprograms;

public class comandline {

	public static void main (String[] args)
	{
		
		if(args.length > 0)
		{
			System.out.println("The command line" + "arguments are");
			
			for (String val: args)
				{
					System.out.println(val); 
				}
		}
	}	
}
	
