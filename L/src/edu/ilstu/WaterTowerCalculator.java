package edu.ilstu;
/*
* File name: WaterTowerCalculator.java
*
* Programmer: Sannan iqbal
* ULID:800765660
*
* Date: September 1st, 2019
*
* Class: IT 168
* Lecture Section: 13
* Lecture Instructor:Shukri Abotteen
* Lab Section:13
* Lab Instructor:Rekha Peri
*/

/**
* Calculating miles per gallon
*
* @author Sannan Iqbal 
*
*/
import java.text.DecimalFormat;
import java.util.Scanner;

public class WaterTowerCalculator
{
	public static void main(String[] args)
	{
		 final double PI = 3.14;
		 final double gallons = 7.48;
		
		 DecimalFormat numberPattern = new DecimalFormat ("0,000.00");
		
		 
		 Scanner scan = new Scanner (System.in);
		 System.out.println("Please enter the width of the sphere:" );
		 double widthInput = scan.nextDouble();
		 
		 double width= widthInput;
		 double radius = width/2;
	
	 
		double areaOfSphereInInches = PI * radius * radius * 4;
		double areaOfSpehereInFeet= areaOfSphereInInches /144;
		double volumeOfSphereInInches = PI * radius * radius * radius * 4/3;  
		double volumeOfSphereInFeet = volumeOfSphereInInches / 1728; 
		double gallonsOfWater= volumeOfSphereInFeet * gallons; 
		
		System.out.println("Area in inches:" + numberPattern.format(areaOfSphereInInches));
		System.out.println("Area in feet:" + numberPattern.format (areaOfSpehereInFeet));
		System.out.println("Volume in inches: " + numberPattern.format (volumeOfSphereInInches));
		System.out.println("Volume in feet:" + numberPattern.format (volumeOfSphereInFeet));
		System.out.println("Gallons of water: " + numberPattern.format (gallonsOfWater));
}
}
