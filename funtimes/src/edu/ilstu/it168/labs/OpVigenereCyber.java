/*
* File name: OpVigenereCyber.java
*
* Programmer: Sannan iqbal
* ULID:800765660
*
* Date: Oct 24, 2019
*
* Class: IT 168
* Lecture Section: 13
* Lecture Instructor:Shukri Abotteen
* Lab Section:13
* Lab Instructor:Rekha Peri
*/
package edu.ilstu.it168.labs;

import java.util.Scanner;
/**
* <insert class description here>
*
* @author Sannan Iqbal 
*
*/
public class OpVigenereCyber
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner s = new Scanner (System.in);
		System.out.println("Please enter the message");
		String str = s.nextLine(); 
		
 		Scanner keyS = new Scanner(System.in);
		System.out.println("Please enter the key");
		String keyword = keyS.nextLine(); 

		String key = generateKey(str, keyword); 
		String cipher_text = cipherText(str, key); 

		System.out.println("Ciphertext : "
			+ cipher_text + "\n"); 

		System.out.println("Original/Decrypted Text : "
			+ originalText(cipher_text, key)); 
s.close();
keyS.close();
	}
	static String originalText(String cipher_text, String key) 
	{ 
		String orig_text=""; 

		for (int i = 0 ; i < cipher_text.length() && 
								i < key.length(); i++) 
		{ 
			// converting in range 0-25 
			int x = (cipher_text.charAt(i) - 
						key.charAt(i) + 26) %26; 

			// convert into alphabets(ASCII) 
			x += 'A'; 
			orig_text+=(char)(x); 
		} 
		return orig_text; 
	} 
	static String cipherText(String str, String key) 
	{ 
		String cipher_text=""; 

		for (int i = 0; i < str.length(); i++) 
		{ 
			// converting in range 0-25 
			int x = (str.charAt(i) + key.charAt(i)) %26; 

			// convert into alphabets(ASCII) 
			x += 'A'; 

			cipher_text+=(char)(x); 
		} 
		return cipher_text; 
	} 
	static String generateKey(String str, String key) 
	{ 
		int x = str.length(); 

		for (int i = 0; ; i++) 
		{ 
			if (x == i) 
				i = 0; 
			if (key.length() == str.length()) 
				break; 
			key+=(key.charAt(i)); 
		} 
		return key; 
	} 

}
