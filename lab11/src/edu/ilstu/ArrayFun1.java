/*
* File name: ArrayFun.java
*
* Programmer: Sannan iqbal
* ULID:800765660
*
* Date: Oct 29, 2019
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
 * <insert class description here>
 *
 * @author Sannan Iqbal
 *
 */
public class ArrayFun1
{
	public static void main(String[] args)
	{System.out.println("Please enter an integer");
		Scanner s = new Scanner(System.in);
		int[] intArray = new int[100];
		int counter = 0;
		int factor =s.nextInt();
		int isVaild=fillArray(intArray, s);
		computeProduct(intArray, isVaild);
		int counter2 =countMultiple(intArray, isVaild, factor);
		System.out.println(counter2);
		printArray(intArray, isVaild);
	}

	public static int fillArray(int array[], Scanner s)
	{System.out
		.println("Plase enter a value to be added to the array: ");
		int userchoice = s.nextInt();
		int i = 0;
		while (userchoice != -999)
		{
			System.out
					.println("Plase enter a value to be added to the array: ");
			array[i] = userchoice;
			userchoice = s.nextInt();
			i++;
		}
		return i;

	}

	public static int computeProduct(int array[], int counter)
	{
		int result = 1;
		boolean y = true;
		for (int x = 0; x < array.length; x++)
		{
			if (array[x] > 0)
			{
				result *= array[x];
				y = false;
			}

		}
		if (y)
			return 0;
		else
			return result;

	}

	public static int countMultiple(int array[], int isVaild, int factor)
	{
		int multipleCount =0;
		for (int i = 0; i < array.length; i++)
		{
			if (array[i] % factor== 0) {
				multipleCount ++;
			}
			else {
				multipleCount = 0;
			} 
				
		}
		return multipleCount;
	}

	public static void printArray(int array[], int isVaild)
	{
		for (int i = 0; i < isVaild; i++) {
			
				System.out.println(array[i]);	
		
		}

	}
}
