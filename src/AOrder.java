
public class AOrder {
	public static void main(String[] args){
		int n1, n2, n3;
		n1 = Integer.parseInt(args[0]);
		n2 = Integer.parseInt(args[1]);
		n3 = Integer.parseInt(args[2]);
		
		System.out.println( "Min = " + Math.min(n1, Math.min(n2,n3)));
		System.out.println( "Mid = " + Math.max( Math.min(n1, n2), Math.max( Math.min(n2,n3), Math.min(n1, n3))));
		System.out.println( "Max = " + Math.max(n1, Math.max(n2, n3)));
	}

}
