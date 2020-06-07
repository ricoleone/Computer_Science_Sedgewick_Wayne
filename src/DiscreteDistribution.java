/***************************************************************
 * 
 * @author rico
 * Name:
 * Usage:
 * Description:  takes an integer command-line argument m, 
 * followed by a sequence of positive integer command-line 
 * arguments a1,a2,,an, and prints m random indices (separated 
 * by whitespace), choosing each index i with probability 
 * proportional to ai. 
 * 
 */
public class DiscreteDistribution {
	public static void main(String[] args){
		int m = Integer.parseInt(args[0]);
		int [] indices;
		int [] S_n = new int [args.length];
		S_n[0] = 0;
		//read input and compute S_n 
		for (int i =1 ; i < args.length; i++){
			S_n[i] = S_n[i-1] + Integer.parseInt(args[i]);
			//System.out.println("S_n["+ i + "] = " + S_n[i]);
		}
			
		//construct and load the indices array
		indices = new int [S_n[args.length - 1]];
		int index = 1;
		for(int i = 0; i < S_n[args.length -1]; i++ ){
			if(i < S_n[index] && i >= S_n[index - 1])
			   indices[i] = index;
			else
			   indices[i] = ++index;
			   
		}
		//calculate a random number r and print index for Sn-1< r <Sn
		for (int j = 1; j <= m; j++){
			int r = (int)(Math.random()*S_n[args.length -1]);
			System.out.print(indices[r] + " ");
			if( j> 0 && j % 25 == 0) System.out.println("");
		}
		
	}

}
