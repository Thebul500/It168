/**
 * 
 */
package edu.ilstu.it168.labs;

import java.text.NumberFormat;

/**
 * @author terryplickebaum
 * This class represents a square that would be used as part 
 * of a larger geometry application  
 */
public class Square {

	private double sideLength;
	private NumberFormat numberFormat;
	
/**
 * 	Constructor for the square.  
 * @param sideLength for the square
 */
	public Square(double r) {
		sideLength = r;
	}
/**
 * 	This method uses the sideLength of the square to compute the area.
 *  Math.PI is used as the value for pi.  
 * @return the area of the square.  
 */
	public double getArea() {
		return (sideLength * sideLength);
	}
		
/**
 * This method uses the sideLength of the square to compute the perimeter. 
 * @return the perimeter of the square.
 */
	public double getPerimeter() {
		return sideLength * 4;
	}
	
	/**
	 * 
	 * @return the NumberFormat instance for the circle.  
	 */
	
	public NumberFormat getNumberFormat() {
		return numberFormat;
	}
	
	/**
	 * @param args - the command line arguments.  This application does not use them.  
	 * main method where execution begins to test the methods of the square test.  
	 */
	public static void main(String[] args) {

		Square s = new Square(14);
		
		NumberFormat nf = null;
		
		printsquareDetails(s);
	}

/**
 * 	This method prints the details of the passed in square object to System.out.
 * The passed in number formatter is used to format the square details.      
 * @param c - the square to print the details of
 * @param nf - the number formatter to use when printing the details.  
 */
	private static void printsquareDetails(Square s) {
		
		NumberFormat nf = s.getNumberFormat();
		
		System.out.println("square characteristics");
		
		System.out.println("the area is " + nf.format(s.getArea()));
		
		System.out.println("the perimeter is " + nf.format(s.getPerimeter()));
		
	}
}
