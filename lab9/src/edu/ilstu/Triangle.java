/*
 *  Filename:  Problem7.java
 *  
 *  Programmer: Cathy Holbrook
 *  ULID:  cjholbr
 *
 *  Date:  
 *
 *  Class: IT 168
 *
 *  Lecture Section:
 *  Lecture Instructor:
 *  Lab Section: 
 *  Lab Instructor: 
 */
package edu.ilstu;

import java.util.Scanner;

/**
 * Code for part 4
 *
 * @author Sannan Iqbal
 *
 */
public class Triangle
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter an integer that is 1-50");
		int number = 0;
		while (!(number >= 1 && number <= 50))
		{
			System.out.println("Enter an integer that is 1-50");
			while (s.hasNextInt() != true)
			{
				String x = s.next();
				System.out.print("Enter a vaild number, try again");
			}
			number = s.nextInt();
		}
		for (int c = 0; c < number; c++)
		{
			System.out.print("");
			for (int r = 0; r <= c; r++)
			{
				System.out.print("*");
			}
			}
			for (int c = number; c > 0; c--)
			{
				System.out.print("");
				for (int r = (c-1); r>0;r--) {
					System.out.print("*");
				}
			}
		s.close();
		
	}
}