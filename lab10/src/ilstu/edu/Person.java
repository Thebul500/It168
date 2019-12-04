/*
* File name: Person.java
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

/**
 * <insert class description here>
 *
 * @author Sannan Iqbal
 *
 */
public final class Person
{

	String fName = "";
	String lName = "";
	int age = 0;



	public Person(String fName, String lName, int age)
	{
		this.fName = fName;
		this.lName = lName;
		this.age = age;
	}

	public String getfName()
	{
		return fName;
	}

	public void setfName(String fName)
	{
		this.fName = fName;
	}

	public String getlName()
	{
		return lName;
	}

	public void setlName(String lName)
	{
		this.lName = lName;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public String toString()
	{
		return fName + " " + lName + ", " + age + " years old";

	}

	public static boolean equals(Person A, Person B)
	{
		if (A.getfName().equals(B.getfName()))
		{
			if (A.getlName().equals(B.getlName()))
			{
				return true;

			}

		}
		return false;

	}

}
