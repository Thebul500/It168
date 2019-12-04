/*
* File name: RoomDimension.java
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
public class RoomDimension
{
double length = 0;
double width =0;

public RoomDimension( double length, double width) {
this.length = length;
this.width = width;
}
public double calculateArea() {
		 double area = length * width;
			return area;
}
public String toString(){
	String answer = "The total area is " + calculateArea();
	return answer;
} 
}

