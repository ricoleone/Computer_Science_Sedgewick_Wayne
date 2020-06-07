/************************************************************
 * 
 * @author rico
 * Name: RandomWalker
 * Usage:
 * Description: takes an integer command-line argument r and 
 * simulates the motion of a random walk until the random 
 * walker is at Manhattan distance r from the starting point. 
 * Print the coordinates at each step of the walk (including 
 * the starting and ending points), treating the starting 
 * point as (0, 0). Also, print the total number of steps taken. 
 *
 */
public class RandomWalker {
	public static void main(String[] args){
		int r = Integer.parseInt(args[0]);

		int north =  1;
		int south = -1;
		int east  =  1;
		int west  = -1;

		int x_coor = 0;
		int y_coor = 0;

		System.out.println("(" + x_coor + ", " + y_coor + ")");

		double result;
		int steps = 0;
		while((Math.abs(x_coor)+ Math.abs(y_coor)) < r){

			result = Math.random();
			if( result < 0.25 ) x_coor += east;
			else if( result < 0.50 ) x_coor += west;
			else if( result < 0.75 ) y_coor += north;
			else y_coor +=south;
			System.out.println( "(" + x_coor + ", " + y_coor + ")" );
			steps++;
		}
		System.out.println( "Steps = " + steps);
	}
}
