/******************************************************************
 * 
 * Author: Rico
 * Name: PrintMatrix
 * Description: prints a mxn matrix
 * Usage: PrintMatrix m n 
 * 
 * 
 * 
 ******************************************************************/
public class PrintMatrix {
	public static void main(String[]args)
	{
		int m = Integer.parseInt(args[0]);
		int n = Integer.parseInt(args[1]);
		
		boolean[][] matrix = new boolean[m][n];
		
		for( int i = 0; i< m ; i++){
			for(int j = 0; j < n; j++){
				if(Math.random() < 0.5)
				   matrix[i][j] = true;
				}
			}
		//now print matrix
	for( int i = 0; i< m ; i++){
		for(int j = 0; j < n; j++){
			if(matrix[i][j])
				System.out.print("* ");
			else 
				System.out.print("  ");
			}
		System.out.println();
		}
	}
}
