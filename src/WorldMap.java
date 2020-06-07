/************************************************************************************
 * 
 * @author rico
 * Name: WorldMap.java
 * Compile:
 * Usage:
 * Description: WorldMap.java reads boundary information of a country (or other 
 * geographic entity) from standard input and plots the results to standard drawing. 
 * A country consists of a set of regions (e.g., states, provinces, or other 
 * administrative divisions), each of which is described by a polygon.
 * Input format: The first line contains two integers: width and height. 
 *               The remaining part of the input is divided into regions.
 *               The first entry in each region is the name of the region. 
 *               For simplicity, names will not contain spaces.
 *               The next entry is an integer specifying the number of vertices 
 *               in the polygon describing the region.
 *               Finally, the region contains the x- and y-coordinates of the 
 *               vertices of the polygon. 
 */

public class WorldMap {
	public static void main(String[] args) {
	
		//set up the drawing region
		int width = StdIn.readInt();
		int height = StdIn.readInt();
		//System.out.println("height = " + height + ", width = " + width);
		StdDraw.setCanvasSize(width,height);
		StdDraw.setXscale(0.0, width);
		StdDraw.setYscale(0.0, height);
		
		//draw each region contained in the input
		while(!StdIn.isEmpty()) {
			String regionName = StdIn.readString();
			//System.out.println("Region Name = " + regionName);
			int verticies = StdIn.readInt();
			double x[] = new double[verticies];
			double y[] = new double[verticies];
			for (int i = 0; i < verticies; i++) {
				x[i] = StdIn.readDouble();
				y[i] = StdIn.readDouble();
			}
			StdDraw.polygon(x, y);
			
		}
	}
}
