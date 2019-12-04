/*
 * File name: ${file name}
 *
 * Programmer: Sannan Iqbal 
 * ULID: 8007656660
 *
 * Date:${date}
 *
 * Class: IT168
 * Lecture Section: 13
 * Lecture Instructor: Shukri Abotteen
 * Lab Section: 14 & 15
 * Lab Instructor:Rekha Peri
 */

package edu.ilstu;

import java.util.Scanner;



/**
* Adds two numbers read from the keyboard
*
* @author Sannan Iqbal 
*
*/
public class AddTwoNumbers 
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        int num1 = 0;
        int num2 = 0;
        
        System.out.println("Hello");
        System.out.println("I will add two numbers for you.");
        System.out.print("Enter first number: ");        
        num1 = keyboard.nextInt();

	System.out.print("Enter second number: ");
        num2 = keyboard.nextInt();
        
        System.out.print("The sum of those two numbers is ");
        System.out.println(num1 + num2);
        
    }
}
