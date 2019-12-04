/*
* File name: CarpetDriver.java
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
public class CarpetDriver
{
	
	
	public static void main(String[] args)
	{
		
		Scanner s = new Scanner(System.in);
		System.out.print("Please enter the length ");
		double length = s.nextDouble();
		System.out.print("Please enter the width ");
		double width = s.nextDouble();
		RoomDimension userOne = new RoomDimension(length, width);
		RoomCarpet user= new RoomCarpet(userOne, 8);
		System.out.print(user);
		s.close();
	}

}
