
public class RightTriangle {
	public static void main (String[] args){
		int a, b, c; //the sides of a right triangle
		boolean isRightTriangle;
		a = Integer.parseInt(args[0]);
		b = Integer.parseInt(args[1]);
		c = Integer.parseInt(args[2]);
		
		isRightTriangle = ((a > 0) && (b > 0) && (c > 0));
		isRightTriangle = isRightTriangle && ( ( a*a + b*b == c*c)|| ( a*a + c*c == b*b)|| ( c*c + b*b == a*a) );
		
		System.out.println(isRightTriangle);
	}
}
