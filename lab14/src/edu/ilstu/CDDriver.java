/*
 * File name: CDDriver.java
 * 
 * Programmer: 
 * ULID:
 *
 * Date:  
 *
 * Class: 
 * Lecture Section:
 * Lecture Instructor:
 * Lab Section:
 * Lab Instructor:  
 */
package edu.ilstu;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Driver class that is making a new file for adding a new song 
 * asks users for 3 choices to make, either add, display or exit.
 *
 * @Sannan Iqbal
 *
 */
public class CDDriver
{

	public static void main(String[] args) throws IOException
	{
		final int MAX_ARRAY_SIZE = 50;
		final String FILENAME = "Collection.txt";

		int count = 0;
		int choice = 0;
		FileWriter fw = null;

		Song songArray[] = new Song[MAX_ARRAY_SIZE];
		String[] menu = { "Add Song", "Print Song Collection", "Quit" };
		TextMenu tm = new TextMenu(menu);

		Scanner s = new Scanner(new File(FILENAME));

		while (s.hasNext())
		{
			String title = s.nextLine();
			String artist = s.nextLine();
			Song temp = new Song(title, artist);
			songArray[count] = temp;
			count++;

		}
		s.close();

		Scanner s1 = new Scanner(System.in);
		choice = tm.getChoice(s1);
		while (choice != 3)

		{

			switch (choice)
			{
			case 1:
				s1.nextLine();
				System.out.print("Enter Song Title :");
				String title = s1.nextLine();
				System.out.print("Enter Artist:");
				String artist = s1.nextLine();
				Song son = new Song(title, artist);
				songArray[count] = son;
				count++;
				File f = new File(FILENAME);
				fw = new FileWriter(f, true);
				fw.write("\n" + title);
				fw.write("\n" + artist);

				break;
			case 2:

				for (int i = 0; i < count; i++)
				{
					System.out.println(songArray[i]);
				}

				break;
			default:
				System.out.println("Invalid menu choice.  Please try again.");
			}

			choice = tm.getChoice(s1);

		}

	}

}
