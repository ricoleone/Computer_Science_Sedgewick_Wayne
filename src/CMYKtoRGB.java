
public class CMYKtoRGB {
	public static void main(String[] args){
		double Cyan, Magenta, Yellow, Kblack, White;
		int Red, Green, Blue;
		
		Cyan    = Double.parseDouble(args[0]);
		Magenta = Double.parseDouble(args[1]);
		Yellow  = Double.parseDouble(args[2]);
		Kblack  = Double.parseDouble(args[3]);
		
		White   = 1.0 - Kblack;
		Red     = (int) Math.round((255.0 * (White * (1.0 - Cyan))));
		Green   = (int) Math.round((255.0 * (White * (1.0 - Magenta))));
		Blue    = (int) Math.round((255.0 * (White * (1.0 - Yellow))));
		
		System.out.println("Red = " + Red);
		System.out.println("Green = " + Green);
		System.out.println("Blue = " + Blue);
		
	}

}
