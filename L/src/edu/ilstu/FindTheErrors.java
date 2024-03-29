/*
 *  Filename:  FindTheErrors.java
 *  
 *  Programmer: 
 *  ULID:  
 *
 *  Date:  
 *
 *  Class:
 *
 *  Lecture Section:
 *  Lecture Instructor:
 *  Lab Section: 
 *  Lab Instructor: 
 */
package edu.ilstu;

import java.util.Scanner;

/**
 * The following class has four independent debugging
 * problems.  Solve one at a time, uncommenting the next 
 * one only after the previous problem is working correctly.
 *
 * @author 
 *
 */
public class FindTheErrors
{

	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		/*
		 * Problem 1 Debugging
		 * 
		 * This problem is to read in your first name,
		 * last name, and current year and display them in 
		 * a sentence to the console.
		 */
		 String	firstName = "";
		 String	lastName = "";
		 String school = "";
		 int	year = 0;
		 
		 System.out.print("Enter your first name:  ");
		 firstName = keyboard.nextLine();
		 
		 System.out.print("Enter the current year:  ");
		 year = keyboard.nextInt();
		 keyboard.nextLine();
		 
		 System.out.print("Enter your last name:  ");
		 lastName = keyboard.nextLine();
		 
		 System.out.print("You are " + firstName + " "
				 	+ lastName + " and it is the year " + year);
		
		
		 System.out.println("\n");
		 
			/*
			 * Problem 2 Debugging
			 * 
			 * This problem is to assign a value to num2 based on
			 * the input value of num1.  It should then print both
			 * numbers.
			 */
		   int num1 = 0;
		   int num2 = 0;
			
			System.out.print("Enter a number - 1, 2, or 3: ");
			num1 = keyboard.nextInt();
			keyboard.nextLine();
			
			if (num1 == 1)
				num2 = 2;
			else if (num1 == 2)
				num2 = 3;
			else if (num1 == 3)
				num2 = 4;
			
			System.out.println("num1 = " + num1 
					    + " and num2 = " + num2);
			
		 	System.out.println("\n");
		 
			/*
			 * Problem 3
			 * 
			 * This problem is to read the name of the course
			 * you are taking and display a statement showing the
			 * answer.
			 */		
			String courseName = "";
			
			System.out.print("Enter your course name (IT168 or IT177): ");
			courseName = keyboard.nextLine();
			
			if (courseName.equals("IT168"))
				System.out.println("You are taking IT168.");
			else if (courseName.equals("IT177"))
				System.out.println("You are taking IT177.");
			else
				System.out.println("Invalid input.");
	
		 	System.out.println("\n");
		 
			/*
			 * Problem 4
			 * 
			 * This problem is to read a test grade from the
			 * keyboard and assign the appropriate letter grade.
			 */
			int 	score = 0;
			char	grade = 'Z';
			
			System.out.println("Enter your test grade (1-100): ");
			score = keyboard.nextInt();
			
			int num=0;
			if (score>60&&score<=70)
					num=1;
			 if(score>70&&score<=80)
				 num=2;
			if(score>80&&score<=90)
				num=3;
			if(score>90)
				num=4;
			switch(num)
			{
			case 1:
				grade = 'A';
				break;
			case 2:
				grade = 'b';
				break;
			case 3:
				grade = 'C';
				break;
			case 4:
				grade = 'D';
				break;
			default:
				grade = 'F';
			}
			
			System.out.println("The score " + score 
						+ " will have a grade of " + grade + ".");
		}
	}

