/*
* File name: ChangeMaker.java
*
* Programmer: Sannan iqbal
* ULID:800765660
*
* Date: Oct 8, 2019
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
public class ChangeMaker
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		final int PAYMENT;
		int quators, dimes, nickles, change, cost;
		boolean t = true;
		Scanner s = new Scanner(System.in);
		System.out.print("Item price must be 25 cents to a dollar, in 5-cent increments.\r\n"+ "Enter item price: ");
		int userInput = s.nextInt();
		if (userInput % 5 != 0.0)
		{
			System.out.print("Cost is invaild - it must be evenly divisible by 5");
			t = false;
		}
		else if (userInput <= 25)
		{
			System.out.print("Cost is invaild - it must be at least 25  cents");
			t = false;
		}
		else if (userInput >= 100)
		{
			System.out.print("Cost is invaild - it must be no more than 100");
			t = false;

		}
		if (t == false)
		{
			return;

		}
		
		System.out.print("You bought an item for " + userInput
				+ " cents and gave me a dollar.\n");
		userInput=100-userInput;
        quators = (userInput) / 25;
		userInput %= 25;
		dimes = userInput / 10;
		userInput %= 10;
		nickles = userInput / 5;
		if (quators >= 2)
		{
			System.out.print(quators+" quators\n");
		}
		else if (quators == 1)
		{
			System.out.print(quators+" quator\n");
		}
		if (dimes >= 2)
		{
			System.out.print(dimes+" dimes\n");
		}
		else if (dimes == 1)
		{
			System.out.print(dimes+" dime\n");
		}
		if (nickles >= 2)
		{
			System.out.print(nickles+" nickles\n");
		}
		else if (dimes == 1)
		{
			System.out.print(nickles+" nickle\n");
		}
	}}
