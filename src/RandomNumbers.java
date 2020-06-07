
public class RandomNumbers {
	public static void main(String[] args){
		double n1, n2, n3, n4, n5, min, max, ave;
		n1 = Math.random();
		n2 = Math.random();
		n3 = Math.random();
		n4 = Math.random();
		n5 = Math.random();
		System.out.println( "Five random numbers: " + n1 + ", " + n2 + ", " + n3 + ", " + n4 + ", " + n5 );
		System.out.println( " Min = " + Math.min(n1, Math.min(n2, Math.min(n3, Math.min(n4, n5 )))));
		System.out.println( " Max = " + Math.max(n1, Math.max(n2, Math.max(n3, Math.max(n4, n5 )))));
	}

}
