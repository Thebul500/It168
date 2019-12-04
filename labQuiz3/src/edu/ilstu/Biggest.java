/*
* File name: Biggest.java
*
* Programmer: Sannan iqbal
* ULID:800765660
*
* Date: Oct 29, 2019
*
* Class: IT 168
* Lecture Section: 13
* Lecture Instructor:Shukri Abotteen
* Lab Section:13
* Lab Instructor:Rekha Peri
*/
package edu.ilstu;

import java.util.Scanner;

/**
 * <insert class description here>
 *
 * @author Sannan Iqbal
 *
 */
public class Biggest
{

	public static void main(String[] args)
	{
		biggest();
	}

	public static int biggest()
	{
		Scanner s = new Scanner(System.in);
		int maxValue = s.nextInt();
		System.out.println("Please enter a number (999 to quit): ");
		int biggestNumber = 0;
		int x;
		
		x = s.nextInt();
		while (x != 999)
		{
			maxValue = x;
			System.out.println("Please enter a number (999 to quit): ");
			x = s.nextInt();

		}
		
		System.out.println("Your largest of your numbers was " + maxValue);
		return maxValue;

	}
}
