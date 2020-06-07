/************************************************************************
 * 
 * @author rico
 * Name: PrimeCounter
 * Usage: PrimeCounter <long>
 * Description: PrimeCounter that takes an integer command-line argument 
 * n and finds the number of primes less than or equal to n. Use it to 
 * print out the number of primes less than or equal to 10 million. 
 * Note : If you are not careful, your program may not finish in a reasonable 
 * amount of time!
 *
 ************************************************************************/
public class PrimeCounter {
	public static void main(String[] args) { 

        // command-line argument
        long n = Long.parseLong(args[0]);
        int primes = 0; // counts the number of primes
        boolean hasFactors = false; //If the number has no factors it is prime
        //System.out.print("The prime factorization of " + n + " is: ");

        for(long i = 2; i <= n; i++){
            long num = i;
            //System.out.println("num = " + num);
        	// for each potential factor
        	for (long factor = 2; factor*factor <= num; factor++) {
        	    
        		// if factor is a factor of n, repeatedly divide it out
        		while (num % factor == 0) {
        			//System.out.print(factor + " "); 
        			num = num / factor;
        			hasFactors = true;
        		}
        	}
        	if(!hasFactors){
        		primes++;
        		System.out.printf("%d is prime,  Current prime count = %d\n", i, primes);
        	}
        	hasFactors = false;
        }
	}
}
