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
package edu.ilstu;

import java.util.Scanner;

/**
 * Main class where user can choose a password generator, encryption, and
 * decryption
 * 
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

	}

	public static void mainMenu()
	{
		System.out.println("------------------------------------------------");
		System.out.println("Thank you for choosing the IT-168 Security tool!");
		System.out.println("------------------------------------------------");
		System.out.println("Please select a tool from the options below");
		System.out.println("1. Password Generator");
		System.out.println("2. Encryption Tool");
		System.out.println("3. Decryption Tool");

		System.out.println("Your Selection(1,2,3)>");
		Scanner s = new Scanner(System.in);
		String userInput = s.nextLine();
		if (userInput.equals("1"))
		{
			passwordSelected();
		}
		else if (userInput.equals("2"))
		{
			encryptionSelected();
		}
		else if (userInput.equals("3"))
		{
			decryptionSelected();
		}
		else
		{
			System.out.print("You did not pick a selection");
		}
		s.close();
	}

	public static void passwordSelected()
	{
		System.out.print(
				"Please Enter a phrase that is at least 8 characters long>");
		Scanner s = new Scanner(System.in);
		String userPassword = s.nextLine();
		while (userPassword.length() < 8)
		{
			System.out.print("The phrase must be at least 8 characters long!");
		}

		if (userPassword.length() >= 8)
		{

			System.out.print("Your password is "
					+ Security.generatePassword(userPassword));
		}
		s.close();
	}

	public static void encryptionSelected()
	{

		Scanner s = new Scanner(System.in);
		System.out.println(
				"Please select the type of Encryption from the options below:");
		System.out.println(
				"1. Caeser Encryption\r\n" + "2. Vigener Encryption\r\n" + "");
		String userInput = s.nextLine();
		if (userInput.equals("1"))
		{
			System.out.print("Please Enter the phrase you want to encrypt> ");
			String userPassword = s.nextLine();

			System.out.println("Your password is " + userPassword);
			System.out.println(
					"Please Enter the key you want to use for encryption> ");
			int userKey = s.nextInt();

			System.out.println("Your password is "
					+ Security.caesarEncrypt(userPassword, userKey));

		}
		else if (userInput.equals("2"))
		{
			Scanner s5 = new Scanner(System.in);
			System.out.println("Please enter the message");
			String str = s5.nextLine();
			System.out.println("Please enter the key");
			String keyword = s5.nextLine();
			String cipher_text = Security.vigenerEncrypt(str, keyword);

			System.out.println("Ciphertext : " + cipher_text + "\n");

			s5.close();

		}
		s.close();
	}

	public static void decryptionSelected()
	{
		Scanner s = new Scanner(System.in);
		System.out.print(
				"Please select the type of decryption from the options below:");
		System.out.println("\n 1. Caeser decryption\r\n"
				+ "\n2. Vigener decryption\r\n" + "");
		String userInput = s.nextLine();
		if (userInput.equals("1"))
		{
			System.out.print("Please Enter the phrase you want to decrypt>");
			String cMsg = s.nextLine();

			System.out.println("Your password is " + cMsg);

			System.out.println(
					"Please Enter the key you want to use for encryption> ");
			int cUserKey = s.nextInt();
			System.out.println("Your key is " + cUserKey);
			System.out.println("The decryption is "
					+ Security.caeserDecrypt(cMsg, cUserKey));

		}
		else if (userInput.equals("2"))
		{
			System.out.print("Please Enter the phrase you want to encrypt>");
			String vMsg = s.nextLine();
			System.out.println(
					"Please Enter the key you want to use for Decryption> ");
			String vUserKey = s.nextLine();

			System.out.println("The decryption is "
					+ Security.vigenerDecrypt(vMsg, vUserKey));
		}
		s.close();
	}
}
