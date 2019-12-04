/*
 ** File name: RestaurantBillCalculator.java
*
* Programmer: Sannan iqbal
* ULID:800765660
*
* Date:September 3rd, 2019
*
* Class: IT 168
* Lecture Section: 13
* Lecture Instructor:Shukri Abotteen
* Lab Section:13
* Lab Instructor:Rekha Peri
  
 */
package ilstu.edu;

public class RestaurantBillCalculator
{
	public static void main(String[] args) {
final double tip = .15;
final double taxRate =.075;
double mealCost= 45.75;
double tax = 0; 
double tipAmount = 0;
double totalAmount = 0;

tax = mealCost * taxRate;
tipAmount= mealCost * tip;
totalAmount= mealCost + tax + tipAmount;

System.out.println ("Meal Cost: $" + mealCost);
System.out.println ("Tax: $" + tax);
System.out.println ("Tip: $" + tipAmount);
System.out.println ("Total amount: " + totalAmount);
}
}