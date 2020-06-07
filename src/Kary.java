
/***********************************************************************
 * 
 * @author rico
 * Description : Kary takes two integer command 
 * line arguments i and k and converts i to base k. Assume that i is an 
 * integer in Java’s long data type and that k is an integer between 2 and 16. 
 * For bases greater than 10, use the letters A through F to represent the 11th 
 * through 16th digits, respectively.
 */
public class Kary {
	public static void main(String[] args)
	{ 
		// read in two command-line arguments
		int  k = Integer.parseInt(args[0]); //base
		long i = Long.parseLong(args[1]);   //decimal number to be converted to base k number
		//System.out.printf("Input parameters:  k = %d, i = %d\n", k, i);
        // set power to the largest power of k that is <= i
        int power = 1;
        while (power <= i/k) {
            power *= k;
        }
        //System.out.printf("Greatest power of %d is %d\n", k, power);
        
        // check for presence of powers of k in i, from largest to smallest
        while (power > 0) {
            // power is not present in i 
            if (i < power) {
                System.out.print(0);
            }
            // power is present in i, so subtract power from i until i is less than power, indicating a shift to the
            // column to right, while counting the multiples of power. e.g 255 base 10, in base 16 notation (FF), has 15 
            // multiples in the 16^1 column and 15 multiples in the 16^0 columns 
            else {
            	int multiple = 0;
            	do{
            		i -= power;
            		multiple++;
            		//System.out.printf("do while: multiple = %d, power = %d, value: %d\n", multiple, power, i);
            	}
            	while( i >= power );
                //Use a, b, c, d, e, f for bases greater than base 10 to represent numbers 11 - 15.
            	switch(multiple){
            	case 10:  System.out.print("a");     break;
            	case 11:  System.out.print("b");     break;
            	case 12:  System.out.print("c");     break;
            	case 13:  System.out.print("d");     break;
            	case 14:  System.out.print("e");     break;
            	case 15:  System.out.print("f");     break;
            	default: System.out.print(multiple); break;
            	}
            }
            // next smallest power of k
            power /= k;
        }
        System.out.println();
	}
}


