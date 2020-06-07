/****************************************************************************************
 * 
 * @author rico
 * Name: Checkerboard.java
 * Compile:
 * Usage:
 * Description: Take a command-line integer n and plots an n-by-n checkerboard pattern to 
 * standard drawing. Color the squares blue and light gray, with the bottom-left square blue. 
 * To draw, Call StdDraw.setScale(0, n) so that x- and y-coordinates of the canvas range from 
 * 0 and n. Call either StdDraw.filledSquare() or StdDraw.filledPolygon() to draw each of the 
 * n2 squares. Make sure that the squares fit snugly in the standard drawing window. Do not 
 * change the canvas size. 
 *
 */

public class Checkerboard {
	 public static void main(String[] args) { 
	        int n = Integer.parseInt(args[0]);
	        StdDraw.setScale(0, n);
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                if ((i + j) % 2 != 0) StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
	                else                  StdDraw.setPenColor(StdDraw.BLUE);
	                StdDraw.filledSquare(i + 0.5, j + 0.5, 0.5);
	            }
	        }
	    }

}
