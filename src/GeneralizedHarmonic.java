/**********************************************************
 * 
 * @author rico
 * Name: GeneralizedHarmonic
 * Usage: GeneralizedHarmonic r n
 * Description:  takes two integer command-line arguments 
 * n and r and uses a for loop to compute the nth generalized 
 * harmonic number of order r, where H = sum (1/n)^r
 *
 **********************************************************/
public class GeneralizedHarmonic {
	public static void main(String[] args){
		int nthGH = Integer.parseInt(args[0]);
		int rthOrder = Integer.parseInt(args[1]);
		double genHarmonic = 0.0;
		
		for( int i =1; i <= nthGH; i++){
			genHarmonic += Math.pow((1.0/(double)i), (double)rthOrder);
		}
		System.out.println(genHarmonic);
	}

}
