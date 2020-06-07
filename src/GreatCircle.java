
public class GreatCircle {
	public static void main (String[] args){
		double x1, y1, x2, y2, distance, hav1, hav2;
		final double radius = 6371.0;
		x1 = Math.toRadians( Double.parseDouble(args[0]));
		y1 = Math.toRadians( Double.parseDouble(args[1]));
		x2 = Math.toRadians( Double.parseDouble(args[2]));
		y2 = Math.toRadians( Double.parseDouble(args[3]));
		
		hav1 = (x2 - x1)/2.0;
		hav2 = (y2 - y1)/2.0;
		
		distance = 2*radius*Math.asin( 
				                       Math.sqrt( 
				                                  Math.sin(hav1)*Math.sin(hav1) +
				                                  Math.cos(x1)*Math.cos(x2)*Math.sin(hav2)*Math.sin(hav2)
				                                 ) 
				                      );
		
		System.out.println(distance + " kilometers");
		
		
		
		
	}

}
