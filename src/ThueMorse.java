/*******************************************************************
 * 
 * @author rico
 * Name:  ThueMorse
 * Usage: ThueMorse n
 * Description: Write a program ThueMorse.java that an integer 
 * command-line argument n and prints an n-by-n pattern like the ones 
 * below. Include two space characters between each + and - character. 
 * The Thue-Morse sequence is an infinite sequence of 0s and 1s that is 
 * constructed by starting with 0 and successively appending the bitwise 
 * negation (interchange 0s and 1s) of the existing sequence. Here are 
 * the first few steps of this construction: 
 ********************************************************************/
public class ThueMorse {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int [] TMSequence = new int [n + 1];
		TMSequence[1] = 0;
		int powerOf2 = 0;
		int offset = (int) Math.pow(2, powerOf2);
        boolean DEBUG = false;
        
		// set up a row matrix following Thue-Morse algorithm
		for(int i = 2; i <= n; i ++) {
			if(TMSequence[i - offset] == 0) TMSequence[i] = 1;
			else TMSequence[i] = 0;
			if(DEBUG) System.out.println("offset = " + offset);
			if(DEBUG)System.out.print(TMSequence[i] + " ");
			if( i == (int)Math.pow(2, powerOf2 + 1)){
				powerOf2++;
				offset = (int) Math.pow(2, powerOf2);
				//System.out.println("New offset = " + offset);
			}
			
		}
		//print the matrix pattern
		for(int i = 1; i <= n; i++) {
			for( int j = 1; j <= n; j++) {
				if( TMSequence[i] == TMSequence[j])System.out.print("+  ");
				else System.out.print("-  ");
			}
			System.out.println();
		}
	}
}

