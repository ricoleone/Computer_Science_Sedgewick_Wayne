/************************************************************
 * 
 * @author rico
 * Name:
 * Usage:
 * Description: BandMatrix.java that takes two integer 
 * command-line arguments n and width and prints an 
 * n-by-n pattern like the ones below, with a zero (0) for 
 * each element whose distance from the main diagonal is 
 * strictly more than width, and an asterisk (*) for each 
 * entry that is not, and two spaces between each 0 or *. 
 *
 */
public class BandMatrix {
	public static void main(String[] args){
		int n = Integer.parseInt(args[0]);
		int width = Integer.parseInt(args[1]);
		
		for( int i = 0; i < n; i++){
			for( int j = 0; j < n; j++){
				if( Math.abs(j - i) > width)
					System.out.print("0");
				else
					System.out.print("*");
				if( j < (n - 1))
					System.out.print("  ");
				else
					System.out.println();
			}
		}
	}

}
