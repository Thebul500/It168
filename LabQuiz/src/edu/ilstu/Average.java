/*
* File name: Average.java
*
* Programmer: Sannan iqbal
* ULID:800765660
*
* Date: Nov 12, 2019
*
* Class: IT 168
* Lecture Section: 13
* Lecture Instructor:Shukri Abotteen
* Lab Section:13
* Lab Instructor:Rekha Peri
*/
package edu.ilstu;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * <insert class description here>
 *
 * @author Sannan Iqbal
 *
 */
public class Average
{

	public static void main(String[] args)
	{
		classes();

	}

	public static void classes()
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Please enter the number of classes: ");
		int numClasses = s.nextInt();
		int[] classes = new int[numClasses];

		for (int i = 0; i < classes.length; i++)
		{
			System.out.println("Enter the size of class " + i + ": ");
			int people = s.nextInt();
			classes[i] = people;
		}

		findAvg(classes);

//display num students
		System.out.println(" ");
		System.out.println("Class             Number of Students ");
		for (int i = 0; i < classes.length; i++)
			System.out.println(i + "                 " + classes[i]);

		s.close();
	}

	public static void findAvg(int[] classes)
	{
		int sum = 0;
		double average1;
		DecimalFormat dFormat = new DecimalFormat("##.##");
		for (int i = 0; i < classes.length; i++)
		{
			sum = sum + classes[i];

		}

		average1 = (double) sum / classes.length;
		System.out.println(
				"The average class size is " + dFormat.format(average1));
	}
}
