/*
* File name: RoomCarpet.java
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
public class RoomCarpet
{
	RoomDimension dimensions; 
	double carpetPricePerSqFoot = 8;
	 
public RoomCarpet(RoomDimension dimensions, double carpetPricePerSqFoot) {
	this.dimensions = dimensions;
	this.carpetPricePerSqFoot = carpetPricePerSqFoot;
}
public double calculateTotalCost() {
	double answer = dimensions.calculateArea() * carpetPricePerSqFoot ;
	return answer;
}
public String toString()
{
	String answer = "Total price is " +calculateTotalCost();
	return answer;
}

}
