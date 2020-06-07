
public class PowersOfTwo {
	public static void main(String[] args){
		int n = Integer.parseInt( args[0] );
		int power = 1;
		int i = 0;
		while( i <= n ){
			System.out.printf( "%4d  %d\n", i, power);
			power *= 2;
			i++;
		}
	}
}
