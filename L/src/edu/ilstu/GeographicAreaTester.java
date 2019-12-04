/*
* File name: GeographicAreaTester.java
*
* Programmer: Jinzhu Luo
* ULID:JLUO12
*
* Date: Oct 8, 2019
*
* Class: IT 168
* Lecture Section: 14
* Lecture Instructor: REKHA PERI
* Lab Section:
* Lab Instructor:Dr. Abotteen
*/
package edu.ilstu;

import java.util.Scanner;

/**
 * <first class>
 *
 * @author Jinzhu Luo
 *
 */
public class GeographicAreaTester
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		String zipcode = "";
		System.out.print("Please enter the zipcode:");
		Scanner s = new Scanner(System.in);
		zipcode = s.nextLine();
		System.out.print(zipcode + " is in the ");
		System.out.println(
				GeographicAreaLookup.determineAreaByZip(zipcode) + " area");
	}

}
