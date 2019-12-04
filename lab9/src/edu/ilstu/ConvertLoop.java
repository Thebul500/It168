/*
 *  Filename:  ConvertLoop.java
 *  
 *  Programmer: 
 *  ULID:  
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

/**
 * Converts given nested for loops to nested while loops
 *
 * @author Cathy Holbrook
 *
 */
public class ConvertLoop
{
	public static void main(String[] args)
	{
		System.out.println("Original code with for loop");
		int s = 0;
		int t = 1;

		for (int i = 0; i < 5; i++)
		{
			s = s + i;
			for (int j = i; j > 0; j--)
			{
				t = t + (j - 1);

			}
			s = s + t;
			System.out.println("T is " + t);
		}
		System.out.println("S is " + s);

		System.out.println("\n\nNew code with while loop");

		int s1 = 0;
		int t1 = 1;
		int i1 = 0;

		while (i1 < 5)
		{
			s1 = s1 + i1;
			i1++;
			for (int j1 = i1; j1 > 0; j1--)
			{
				t1 = t1 + (j1 - 1);

			}
			s1 = s1 + t1;
			System.out.println("T1 is " + t1);
		}
		System.out.println("S1 is " + s1);

	}

}
