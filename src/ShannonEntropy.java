
public class ShannonEntropy {
	public static void main(String [] args){
		int m = Integer.parseInt(args[0]);
		System.out.println("m = " + m);
		int [] p_i = new int [m + 1];
		int num = 0;
		int count = 0;
		double H = 0.0;
		while( !StdIn.isEmpty() ){
			num = StdIn.readInt();
			System.out.print(num + " ");
			p_i[num] += 1;
			count += 1;
		}
		System.out.println("\nout of while loop");
		for( int i = 1; i <= m; i++ ){
			if(p_i[i] == 0)
				;
			else H +=  -1.0 *( ( (double)p_i[i]/count ) * ( Math.log( ( (double)p_i[i]/count ) ) / Math.log(2.0) ) );
			System.out.printf("i = %d, H = %f\n", i, H);
			
		}
		StdOut.printf("%.4f\n", H);
	}

}
