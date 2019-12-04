/*
 ** File name: ArthmeticExpression.java
*
* Programmer: Sannan iqbal
* ULID:800765660
*

* Date:September 3rd, 2019
*
* Class: IT 168
* Lecture Section: 13
* Lecture Instructor:Shukri Abotteen
* Lab Section:13
* Lab Instructor:Rekha Peri
  
 */

package ilstu.edu;

/**
 * Write and test arithmetic expressions
 *
 * @author 
 *
 */
public class ArithmeticExpressions {

	public static void main(String[] args) {
		// Constant declaration
		
		final int freezing  = 32;
		final int factor = 703;
		
		// Variable declarations and initializations
		double height = 64.5;
		double weight = 125.0;
		int fahrenheit = 78;
	     double expected = 89.0;
	     double observed = 78.0;
		
		
		
		
		// Problem 17
		double bmi = weight/ (height * height) * factor;
		System.out.println("bmi = " +bmi);
		// Problem 18
		double celsius = (5/9.0) * (fahrenheit - freezing);
		System.out.println("celsius = " + celsius);
		// Problem 19
		double percentageOfDifference = ((expected - observed)/expected) * 100 ;
		System.out.println("percentage of difference = " +percentageOfDifference);
	
		
		
	}

}
