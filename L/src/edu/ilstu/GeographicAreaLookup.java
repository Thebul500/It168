/*
* File name: GeographicAreaLookup.java
*
* Programmer: Jinzhu Luo
* ULID:JLUO12
*
* Date: Oct 8, 2019
*
* Class: IT 168
* Lecture Section: 14
* Lecture Instructor: REKHA PERI
* Lab Section:
* Lab Instructor:Dr. Abotteen
*/
package edu.ilstu;

/**
* <first class>
*
* @author Jinzhu Luo
*
*/
public class GeographicAreaLookup
{
      static public String determineAreaByZip(String zipcode)
      {
    	  String chara=zipcode.substring(0,1);
    	  int num = Integer.parseInt(chara);
    	  String ans="";
    	  if(num>=0&&num<=3)
    		 ans="East Coast";
    	  else if(num>=4&&num<=6)
     		 ans="Central Plains";
    	  else if(num==7)
     		 ans="South";
    	  else if(num>=8&&num<=9)
     		 ans="West";
    	   else     ans="invalid zip code"; 
    	  return ans;
      }
}
