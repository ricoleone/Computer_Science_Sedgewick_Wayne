/*****************************************************************
 * 
 * @author rico
 * Name:
 * Usage:
 * Description: Minesweeper.java takes three integer command-line 
 * arguments m, n, and k and prints an m-by-n grid of cells with 
 * k mines, using asterisks for mines and integers for the 
 * neighboring mine counts (with two space characters between each cell). 
 * To do so,
 * - Generate an m-by-n grid of cells, with exactly k of the mn cells 
 *   containing mines, uniformly at random.
 * - For each cell not containing a mine, count the number of 
 *   neighboring mines (above, below, left, right, or diagonal). 
 */
public class Minesweeper {
	public static void main( String [] args) {
		int m = Integer.parseInt(args[0]);
		int n = Integer.parseInt(args[1]);
		int k = Integer.parseInt(args[2]);

		//Construct an m x n playing field with k mines
		int [][] field = new int [m][n];
		int aMine = '\052';
		//Generate mines  in k locations
		int h = 0;
		while ( h < k ) {
			int row = (int)(Math.random()*m);
			int col = (int)(Math.random()*n);
            //prevent duplicates, only one mine per location
			if( field[row][col] != aMine){
				field[row][col] = aMine;
				h++;
			}
		}

		//Determine number of mines adjacent to each cell
		for( int i = 0; i < m; i++ ) {
			for( int j = 0; j < n; j++ ) {
				if ( field[i][j] == aMine); //do nothing to a mine
				else{
					//count above
					if( i > 0){
						if( field[i - 1][j] == aMine ) field[i][j] += 1; //directly above
						if( j < n - 1 && field[i -1][j + 1] == aMine ) field[i][j] += 1; //diagonal to the upper right
						if( j > 0 && field[i -1][j - 1] == aMine ) field[i][j] += 1; //diagonal to the upper left
					}
					//count below
					if( i < m - 1) {
						if( field[i + 1][j] == aMine ) field[i][j] += 1; //directly below
						if( j < n - 1 && field[i + 1][j + 1] == aMine ) field[i][j] += 1; //diagonal to the lower right
						if( j > 0 && field[i + 1][j - 1] == aMine ) field[i][j] += 1; //diagonal to the lower left
					}
					//count to the left
					if( j > 0 ) {
						if( field[i][j - 1] == aMine ) field[i][j] += 1; //directly to left
					}
					//count to the right
					if ( j < n - 1 ) {
						if( field[i][j + 1] == aMine ) field[i][j] += 1; //directly to right
					}
				}
			}
		}	
		//Print playing filed
		for( int i = 0; i < m; i++ ) {
			for( int j = 0; j < n; j++ ) {
				if( field[i][j] == aMine)System.out.print( "*  " );
				else System.out.print( field[i][j] + "  ");

			}
			System.out.println();
		}
	}
}

