package edu.ilstu;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * A class to maintain an array of students
 */
public class StudentList
{
	// c
	Student student = new Student();
	public final int BLOCK_SIZE = 101;
	private Student[] stuArray = new Student[BLOCK_SIZE];
	int lengthStudent = stuArray.length;;
	int count = 0;
	Scanner s = new Scanner(System.in);

	// provide a default constructor that sets up an empty student array
	public StudentList()
	{
	}

	private int helperName(String name)
	{
		for (int i = 0; i < count; i++)
		{
			if (stuArray[i].getName().equals(name))
			{
				return i;
			}

		}
		return -1;
	}
	// provide a private helper method that accepts a Student's name and
	// returns the index of the student in the array or -1 if the student
	// is not in the array. This method should be called by displayStudent
	// method

	/**
	 * Reads a list of students from a file
	 * 
	 * @param fileName Name of the file to read from
	 */
	public void readList(String fileName)
	{
		Scanner file = new Scanner("students.txt");

		while (file.hasNextInt())
		{
			stuArray[lengthStudent] = new Student();
			stuArray[lengthStudent].read(file);
			count++;
		}

		// fill in code to read a list of students from a file
		// into the array -- this should end with StudentList
		// consisting of exactly those students in the file--so
		// the first student in the file will be the first student
		// in the array, and all operations on the list will only
		// affect the set of students in the file until additional
		// students are added using the addStudent method below.
		// Make sure you don't overfill the array.
		// For each student, create the Student object using the default
		// constructor and then use the read method of Student to get
		// the data from the file
	}

	public StudentList(Student[] stuArray, int lengthStudent)
	{
		super();
		this.stuArray = stuArray;
		this.lengthStudent = lengthStudent;
	}

	/**
	 * Writes a list of students to a file
	 * 
	 * @param fileName Name of the file to write to
	 */
	public void writeList(String fileName)
	{
		PrintWriter outfile = null;
		try
		{
			outfile = new PrintWriter(new FileWriter("output.txt"));
			for (int i = 0; i < lengthStudent; i++)
			{

				outfile.print(stuArray[i]);
			}

			// use a for loop to write all of the Student objects from
			// the array to output.txt by calling the Student's write
			// method and passing it outfile

			outfile.close();
		}
		catch (IOException e)
		{
			System.out.println("An error occurred: " + e);
			System.out.println("The list of students was not written");
		}
	}

	/**
	 * Add a student to the end of the list
	 * 
	 * @param aStudent The student to add
	 */
	public void addStudent(Student aStudent)
	{
		if (count < BLOCK_SIZE)
		{
			stuArray[count] = aStudent;
			count++;
		}

		// write code to add a student to the end of the list of students only
		// if there is room
	}

	/**
	 * 
	 * @param studentName
	 */
	public void displayStudent(String studentName)
	{
		int index;
		index = helperName(studentName);
		if (index != -1)
			System.out.println(this.stuArray[index]);
		else
			System.out.println("Student not found with name " + studentName);

	}

	// fill in missing pieces of the following code and uncomment it
	// add appropriate code to handle an incorrect name
	/*
	 * int index; index = // fill in code here ;
	 * System.out.println(this.stuArray[index]);
	 */

	// Write a method to count the number of freshmen, sophomores, juniors and
	// seniors in the array
	// and print the counts to the screen. The Student class has a getClassLevel
	// method that
	// returns a String with the value "Freshman", "Sophomore", "Junior" or
	// "Senior". Use an array
	// to store your counts.
	// add an appropriate javadoc comment
	public void printClassCounts()
	{
		int[] number = new int[5];
		for (int i = 0; i < count; i++)
		{
			String choice = stuArray[i].getClassLevel();
			switch (choice)
			{
			case "Freshman":
				number[0]++;
				break;
			case "Sophomore":
				number[1]++;
				break;
			case "Junior":
				number[2]++;
				break;
			case "Senior":
				number[3]++;
				break;
			}

		}
		System.out.println("the number of the Freshman: " + number[0]);
		System.out.println("the number of the Sophomore: " + number[1]);
		System.out.println("the number of the Junior: " + number[2]);
		System.out.println("the number of the Senior: " + number[3]);

	}
}
