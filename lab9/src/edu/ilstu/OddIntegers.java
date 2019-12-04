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
 * Code for part 3
 *
 * @author Sannan Iqbal
 *
 */
public class OddIntegers
{

	public static void main(String[] args)
	{
		System.out.println("Enter value n");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int sum = 0;

		for (int i = 0; i < n; i++)
		{
			sum += i * 2 + 1;
		}
		System.out.println("Sum is " + sum);
		s.close();
	}

}
