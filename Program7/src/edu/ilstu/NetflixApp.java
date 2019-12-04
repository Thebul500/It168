/*
* File name: NetflixApp.java
*
* Programmer: Sannan iqbal
* ULID:800765660
*
* Date: Nov 21, 2019
*
* Class: IT 168
* Lecture Section: 13
* Lecture Instructor:Shukri Abotteen
* Lab Section:13
* Lab Instructor:Rekha Peri
*/
package edu.ilstu;

import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * <insert class description here>
 *
 * @author Sannan Iqbal
 *
 */
public class NetflixApp
{

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args)
	{
		menu();
	}

	private static void menu()
	{
		System.out.println("\n\tWelcome to the Netflix database");
		System.out
				.println("===================================================");
		System.out.println("\t1. Browse all movies");
		System.out.println("\t2. Search a movie based on title");
		System.out.println("\t3. Search movies based on year");
		System.out.println("\t4. Top Movies recomendation");
		System.out.println("\t5. Exit");
		System.out
				.println("===================================================");
		NetflixHandler nfh = new NetflixHandler();
		int choice;
		while (true)
		{
			System.out.print("Please make your choice :");
			while (true)
			{

				choice = sc.nextInt();
				if (choice < 1 || choice > 5)
				{
					System.out.print("Please Provide a valid input:");
				}
				else
					break;
			}

			switch (choice)
			{
			case 1:
			{

				nfh.read("netflix.csv");
				nfh.displayAllMovies();
				menu();

			}
			case 2:
			{
				String title;
				nfh.searchTitle();
				menu();

			}
			case 3:
			{
				nfh.searchYear();
				menu();

			}
			case 4:
			{
				try
				{
					nfh.makeRecommendations();
					menu();
				}
				catch (FileNotFoundException e)
				{
					System.out.println("File not found!");
					e.printStackTrace();
				}

			}
			case 5:
			{
				System.out.println(
						"Thank you for using the database. Please come back next time.");
				System.exit(0);
			}
			default:
			{
				System.out.println(" Invalid Choice. Must be between 1-5 ");
				break;
			}
			}

			break;
		}

	}
}