/*
* File name: ElectionApp.java
*
* Programmer: Sannan iqbal
* ULID:800765660
*
* Date: Nov 6, 2019
*
* Class: IT 168
* Lecture Section: 13
* Lecture Instructor:Shukri Abotteen
* Lab Section:13
* Lab Instructor:Rekha Peri
*/
package edu.ilstu;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * main class that is displaying everything.
 *
 * @author Sannan Iqbal
 *
 */
public class ElectionApp
{
	private static Results r;

	public static void main(String[] args)
	{
		r = new Results();
		outputMenu();

	}

	public static void outputMenu()
	{
		boolean flag = true;
		while (flag)
		{
			try
			{
				System.out.println("Choose from the following options: \n"
						+ "1- Add a candidate \n" + "2- Add votes \n"
						+ "3- Determine winner \n"
						+ "4- Display a list of candidates \n"
						+ "5- Display winners \n" + "6- Exit\n");
				System.out.print("Your choice? ");
				Scanner input = new Scanner(System.in);
				int choice = input.nextInt();
				switch (choice)
				{
				case 1:
					r.addCandidate();
					break;
				case 2:

					r.addVotes();
					break;
				case 3:
					r.determineWinner();
					break;
				case 4:

					// r.createCandidateListByOffice(choice);
					System.out.println(r.toString());
					System.out.println(" ");
					break;

				case 5:
					System.out.println(r.displayWinners());
					System.out.println("  ");
					break;
				case 6:

					flag = false;
					System.out.println("Goodbye");
					System.exit(0);
					break;
				default:
					System.out.println("You did not enter a vaild number");
					System.out.println("              ");

				}
			}
			catch (InputMismatchException ex)
			{
				System.out.println(" Please enter a number not a letter ");
				System.out.println("                                    ");
			}
		}

	}
}
