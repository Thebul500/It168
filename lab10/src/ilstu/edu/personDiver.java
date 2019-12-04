/*
* File name: personDiver.java
*
* Programmer: Sannan iqbal
* ULID:800765660
*
* Date: Oct 22, 2019
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
public class personDiver
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);

		System.out.print("Please enter your first name ");
		String victimFName = s.nextLine();
		System.out.print("Please enter your last name ");
		String victimLName = s.nextLine();
		System.out.print("Please enter your age ");
		int victimAge = s.nextInt();
		Person victimOne = new Person(victimFName, victimLName, victimAge);
		s.nextLine();
		System.out.print("Please enter your 2nd first name ");
		String victimTwoFName = s.nextLine();
		System.out.print("Please enter your 2nd last name ");
		String victimTwoLName = s.nextLine();
		System.out.print("Please enter your age ");
		int victimTwoAge = s.nextInt();
		Person victimTwo = new Person(victimTwoFName, victimTwoLName,
				victimTwoAge);
		boolean answer = Person.equals(victimOne, victimTwo);
		
		if (answer)
		{
			System.out.print(
					victimOne + " And " + victimTwo + " \n are the same name \n ");
			if (victimOne.getAge() == victimTwo.getAge())
			{
				System.out.print(
						victimOne + " And " + victimTwo + " \n  are the same age \n ");
			}
			else if (victimOne.getAge() > victimTwo.getAge())
			{
				System.out.print(victimOne +  " \n is older than " + victimTwo);
			}
			else if (victimOne.getAge() < victimTwo.getAge())
			{
				System.out.print(victimOne + "\n is younger than " + victimTwo);
			}
				

		}
		if (answer == false)
		{
			System.out.print(
					victimOne + "\nAnd " + victimTwo + "\n are the different name \n ");
			if (victimOne.getAge() == victimTwo.getAge())
			{
				System.out.print(
						victimOne + "\n And " + victimTwo + "\n are the same age \n");
			}
			else if (victimOne.getAge() > victimTwo.getAge())
			{
				System.out.print(victimOne + " \n is older than " + victimTwo);
			}
			else if (victimOne.getAge() < victimTwo.getAge())
			{
				System.out.print(victimOne + "\n is younger than " + victimTwo);
			}
		}
		
		
		s.close();

	}

}
