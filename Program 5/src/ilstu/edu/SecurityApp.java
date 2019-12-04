/*
* File name: SecurityApp.java
*
* Programmer: Sannan iqbal
* ULID:800765660
*
* Date: Oct 14, 2019
*
* Class: IT 168
* Lecture Section: 13
* Lecture Instructor:Shukri Abotteen
* Lab Section:13
* Lab Instructor:Rekha Peri
*/
package ilstu.edu;

import java.util.Scanner;

/**
 * <insert class description here>
 *
 * @author Sannan Iqbal
 *
 */
public class SecurityApp
{
	Scanner s = new Scanner(System.in);

	public static void main(String[] args)
	{
		mainMenu();
		passwordSelected();
		encryptionSelected();
		decryptionSelected();
	}

	public static void mainMenu()
	{
		System.out.print("------------------------------------------------");
		System.out.print("Thank you for choosing the IT-168 Security tool!");
		System.out.print("------------------------------------------------");
		System.out.print("Please select a tool from the options below");
		System.out.print("1. Password Generator");
		System.out.print("2. Encryption Tool");
		System.out.print("3. Decryption Tool");

		System.out.print("Your Selection(1,2,3)>");
		Scanner s = new Scanner(System.in);
		String userInput = s.nextLine();
		// look at intrsuctions
		private Security person;
		if (userInput.equals("1"))
		{    

		}
		else if (userInput.equals("2"))
		{

		}
		else if (userInput.equals("3"))
		{

		}
		else
		{
			System.out.print("You did not pick a selection");
		}
	}

	public static void passwordSelected()
	{
		Scanner s = new Scanner(System.in);
		String userInput = s.nextLine();
		System.out.print(
				"Please Enter a phrase that is at least 8 characters long>");
		// change the if to a while
		if (userInput.equals("1"))
		{

		}
		else
		{
			System.out.print("The phrase must be at least 8 characters long!");
		}
	}

	public static void encryptionSelected()
	{

	}

	public static void decryptionSelected()
	{

	}

}
