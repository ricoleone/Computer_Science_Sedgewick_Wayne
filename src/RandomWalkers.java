/***************************************************************
 * 
 *@author rico
 *
 **************************************************************/
public class RandomWalkers {

    /**
    * @param args
    */
	public static void main(String[] args){
		int r = Integer.parseInt(args[0]);
		int trials = Integer.parseInt(args[1]);
		int north =  1;
		int south = -1;
		int east  =  1;
		int west  = -1;
		int x_coor = 0;
		int y_coor = 0;
		double result;
		int steps = 0;
		int totalSteps = 0;

        for( int k = 0; k < trials; k++ ){
        	
			while((Math.abs(x_coor)+ Math.abs(y_coor)) < r){
				result = Math.random();
				//System.out.println("Result = " + result);
				if( result < 0.25 ) {
					x_coor += east;
				} else if( result < 0.50 ) {
					x_coor += west;
				} else if( result < 0.75 ) {
					y_coor += north;
				} else {
					y_coor +=south;
				}
				steps++;
			}
			//System.out.printf("Trial = %d, steps = %d\n", k, steps);
			totalSteps += steps;
			x_coor = 0;
			y_coor = 0;
			steps = 0;
		}
        System.out.printf( "average number of steps = %f\n", (double)totalSteps/(double)trials );
	}
}
