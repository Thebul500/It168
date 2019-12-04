/*
* File name: StudentListTester.java
*
* Programmer: Sannan iqbal
* ULID:800765660
*
* Date: Nov 12, 2019
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
* the program to test the class
*
* @author Sannan Iqbal 
*
*/
public class StudentListTester
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{	
		Scanner s = new Scanner(System.in);

		StudentList  myStudent = new StudentList();
		myStudent.readList("students.txt");

		System.out.println(
				"Table below shows the number of students at each class grade  ");
		myStudent.printClassCounts();

		boolean flag1=true;
		while(flag1)
		{
			System.out.println("\nDo you wish to add student to the list Y or N: ");
			String choice = s.nextLine();
			if(choice.equals("Y")||choice.equals("y"))
			{
				System.out.print("Enter full name: ");
				String name = s.nextLine();
				System.out.print("Enter major: ");
				String major = s.next();
				s.nextLine();
				System.out.print("Enter gpa: ");
				double gpa = s.nextDouble();
				s.nextLine();
				System.out.print("Enter hours completed: ");
				int hoursCompared = s.nextInt();
				s.nextLine();

				Student student = new Student(name, major, gpa, hoursCompared);
				myStudent.addStudent(student);
				flag1=true;
			}
			else 
			{
				flag1=false;
			}
		}
        boolean flag=true;
		while(flag)
		{
			System.out.print("\n Search for Students in list  Y or N: ");
			String ans = s.nextLine();
			if(ans.equals("Y")||ans.equals("y"))
			{	
				System.out.print("Please enter their full name: ");
				String name = s.nextLine();	
				myStudent.displayStudent(name);
			}
			else 
			{
				flag=false;
			}
				
		}
		
		myStudent.printClassCounts();

	myStudent.writeList("studentout.txt");
	s.close();
	}

}
