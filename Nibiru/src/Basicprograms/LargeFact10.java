package Basicprograms;

import java.math.BigInteger;

public class LargeFact10 {

	public static void main(String[] args) {
	
		int num = 1000;
		
		BigInteger factorialresult = BigInteger.ONE; 
		
		for(int i=2;i<num;i++)
		{
			factorialresult = factorialresult.multiply(BigInteger.valueOf(i)); 
		}
		System.out.print(factorialresult); 
	}

}
