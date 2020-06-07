/******************************************************************
 * 
 * @author rico
 * Name:
 * Usage:
 * Description: that takes two integer command-line arguments n and 
 * trials and performs the following experiment, trials times:
 * - Choose a birthday for the next person, uniformly at random between 
 *   0 and n − 1.
 * - Have that person enter the room.
 * - If that person shares a birthday with someone else in the room, 
 *   stop; otherwise repeat. 
 * In each experiment, count the number of people that enter the room. 
 * Print a table that summarizes the results (the count i, the number 
 * of times that exactly i people enter the room, and the fraction of 
 * times that i or fewer people enter the room) for each possible value
 * of i from 1 until the fraction reaches (or exceeds) 50%. 
 *
 ******************************************************************/
public class Birthday {
	public static void main( String [] args) {
		int n = Integer.parseInt(args[0]); //Birthday of person 1
		int trials = Integer.parseInt(args[1]);
		int MAX = n + 1; //365;
		int hits[] = new int[MAX]; // counts the number times that birthday matched
		int entered[] = new int[MAX]; // counts the number of times i entered the room
		int [] birthdays = new int[MAX]; // start counting index at 1
		//run trials number of experiments
		boolean match = false;
		for( int i = 0; i < trials; i++) {
			
			//run an experiment
			match = false;
			int j = 1;
			//jth person enters the room
			
			while( j <= n && !match) {
					birthdays[j] = (int)(Math.random()*n );
					entered[j] += 1;
					//does the jth person have the same birthday as someone already in the room?
					for( int k = 1; k < j; k++) {
						if( birthdays[k] == birthdays[j]){
							hits[j] += 1;
							match = true;
							break;
						}
					}
					j++;
			}

		}
		//print test results
		int totalHits = 0;
		for( int i = 1; i <= n; i++) {
			totalHits += hits[i];
			System.out.println(i + "\t" + hits[i] + "\t" + ((double)totalHits/(double)trials));
			if( (double)totalHits/(double)trials >= 0.5 ) break; 

		}
	}

}
