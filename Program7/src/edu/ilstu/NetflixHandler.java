/*
* File name: NextflixHandler.java
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

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * <insert class description here>
 *
 * @author Sannan Iqbal
 *
 */
public class NetflixHandler
{
	Scanner s = new Scanner(System.in);
	private Movie[] data;
	private int actualSize;
	final int SIZE = 500;

	public NetflixHandler()
	{
		data = new Movie[SIZE];
		actualSize = 0;

	}

	public void read(String fileName)
	{
		Scanner fileReader = null;
		try
		{
			int count = 0;
			int i = 0;
			fileReader = new Scanner(new File("netflix.csv"))
					.useDelimiter("[,\r\n]");

			while (fileReader.hasNext())
			{
				fileReader.nextLine();
				String title = fileReader.next();

				String rating = fileReader.next();

				int year = Integer.parseInt(fileReader.next());

				int score = Integer.parseInt(fileReader.next());
				Movie m = new Movie(title, rating, year, score);
				data[i] = m;
				i++;
				count++;
			}
			fileReader.close();
			for (int j = 0; j < count; j++)
			{
				System.out.println(data[j].toString());
			}
		}
		catch (FileNotFoundException e)
		{
			System.out.println("File is not found");

		}

	}

	public void displayAllMovies()
	{
		for (int i = 0; i < actualSize; i++)
		{
			System.out.println(data[i].toString());
		}
	}

	public void searchTitle()
	{
		Scanner s = new Scanner(System.in);
		int indx = -1;
		System.out.print("Please provide a title :");
		String searchTitle = s.nextLine();

		for (int i = 0; i < actualSize; i++)
		{

			if (searchTitle.equalsIgnoreCase(data[i].getTitle()))
			{

				indx = i;
				System.out.println(data[i]);
			}
		}
//		if (indx == -1)
//		{
//			System.out.println("The title does not match any of the movies.");
//		}
//		else
//		{
//			System.out.println(indx);
//		}

	}

	public void searchYear()
	{
		Scanner s = new Scanner(System.in);
		int indx = -1;
		System.out.print("Enter Year to search :");
		int year = s.nextInt();
		for (int i = 0; i < actualSize; i++)
		{
			if (data[i].getYear() == year)
			{
				System.out.println(data[i].toString());
				indx = 1;
			}
		}

		if (indx == -1)
		{
			System.out.println("The year does not match any of the movies.");
		}

	}

	public void sort(Movie movies[], int size)
	{
		int temp;
		for (int i = 0; i < size; i++)
		{
			for (int j = i + 1; j < size; j++)
			{
				if (movies[i].getScore() < movies[j].getScore())
				{
					temp = movies[i].getScore();
					movies[i].setScore(movies[j].getScore());
					movies[j].setScore(temp);
				}
			}
		}
	}

	public void makeRecommendations() throws FileNotFoundException
	{
		sort(data, actualSize);

		int option, cnt = 0, flag = 0;
		String rating;
		PrintWriter pw = null;
		System.out.println(
				"Do you want the recommendations based on ratings or scores? ");
		System.out.println("1.Ratings");
		System.out.println("2.Scores");
		System.out.print("Please choose 1 or 2 :");
		option = s.nextInt();
		if (option == 1)
		{
			System.out.print("Please Provide a rating :");
			rating = s.next();

			pw = new PrintWriter(new File("top_5_movies.txt"));
			for (int i = 0; i < actualSize; i++)
			{
				if (cnt != 5)
				{
					if (data[i].getRating().equalsIgnoreCase(rating))
					{
						pw.write(data[i].toString() + "\n");
						cnt++;
						flag = 1;
					}
				}
			}
			pw.close();

			if (flag == 1)
			{
				System.out.println(
						"Recomendations made successfully! Top 5 movies found!");
			}
			else
			{
				System.out.println(
						"The Ratings does not match any of the movies!");
			}
		}
		else if (option == 2)
		{

			pw = new PrintWriter(new File("top_20_movies.txt"));
			for (int i = 0; i < actualSize; i++)
			{
				pw.write(data[i].toString() + "\n");
			}
			pw.close();

			System.out.println(
					"Recomendations made successfully! Top 20 movies found!");
		}
		else
			System.out.println("You did not pick an option");
		// makeRecommendations();
	}

}
