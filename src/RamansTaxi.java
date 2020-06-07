/*************************************************************************
 * 
 * @author rico
 * Description: a program that takes an integer command-line argument n and 
 * prints all integers less than or equal to n that can be expressed as the 
 * sum of two cubes in two different ways. In other words, find distinct 
 * positive integers a, b, c, and d such that a^3 + b^3 = c^3 + d^3. Use four 
 * nested for loops.
 *
 *************************************************************************/
public class RamansTaxi {
	public static void main(String[] args)
	{
		long n = Integer.parseInt(args[0]);
		
		long cbrtn = (long)Math.cbrt(n);
		
		for(long a=1; a < cbrtn/2; a++)
			for(long b=a+1; b < cbrtn; b++)
				for(long c= b+1; c < cbrtn; c++)
					for(long d= a+1; d <=cbrtn; d++)
						//System.out.println("a=" + a + " b=" + b + " c=" + c + " d=" + d);
						if( ( (a*a*a + d*d*d ) == (c*c*c + b*b*b) ) && ( (c*c*c + b*b*b) < n) ){
							System.out.printf("a^3 + d^3 is %d + %d = %d = %d + %d \n", a*a*a, d*d*d, 
									(a*a*a + d*d*d), b*b*b, c*c*c);
					}
		System.out.println("done.");
	}

}
