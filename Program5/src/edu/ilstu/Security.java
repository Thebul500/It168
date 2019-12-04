/*
* File name: Security.java
*
* Programmer: Sannan iqbal
* ULID:800765660
*
* Date: Oct 14, 2019
*
* Class: IT 168
* Lecture Section: 13
* Lecture Instructor:Shukri Abotteen
* Lab Section:13
* Lab Instructor:Rekha Peri
*/
package edu.ilstu;

/**
 * This class is the body class that the parent class uses. This is where users
 * are getting their encryption or decryption and with a key.
 *
 * @author Sannan Iqbal
 *
 */
public class Security
{

	static String userPassword;
	static int userKey;

	public static int getUserKey()
	{
		return userKey;
	}

	public static void setUserKey(int userKey)
	{
		Security.userKey = userKey;
	}

	public static String getUserPassword()
	{
		return userPassword;
	}

	public void setUserPassword(String userPassword)
	{
		Security.userPassword = userPassword;
	}

	public static String generatePassword(String userPassword)
	{

		for (int letterCount = 0; letterCount < userPassword
				.length(); letterCount++)
		{

			if (userPassword.charAt(letterCount) == 's'
					|| userPassword.charAt(letterCount) == 'S')
			{
				userPassword = userPassword.replace('s', '$');
				userPassword = userPassword.replace('S', '$');
			}
			if (userPassword.charAt(letterCount) == 'A'
					|| userPassword.charAt(letterCount) == 'a')
			{
				userPassword = userPassword.replace('a', '@');
				userPassword = userPassword.replace('A', '@');
			}
			if (userPassword.charAt(letterCount) == 'O'
					|| userPassword.charAt(letterCount) == 'o')
			{
				userPassword = userPassword.replace('o', '0');
				userPassword = userPassword.replace('O', '0');
			}
			if (userPassword.charAt(letterCount) == 'E'
					|| userPassword.charAt(letterCount) == 'e')
			{
				userPassword = userPassword.replace('e', '3');
				userPassword = userPassword.replace('E', '3');
			}
			if (userPassword.charAt(letterCount) == ' ')
			{
				userPassword = userPassword.replace(' ', '_');
			}

		}
		if (!userPassword.contains("@") || !userPassword.contains("#")
				|| !userPassword.contains("$") || !userPassword.contains("%")
				|| !userPassword.contains("^") || !userPassword.contains("&")
				|| !userPassword.contains("*") || !userPassword.contains("!"))
		{
			userPassword = userPassword + '!';
		}

		String passwordChange = "";
		for (int i = 0; i < userPassword.length(); i++)
		{
			if (Character.isUpperCase(userPassword.charAt(i)))
			{

				passwordChange = passwordChange
						+ Character.toLowerCase(userPassword.charAt(i));

			}
			else
			{
				if (Character.isLowerCase(userPassword.charAt(i)))
				{
					passwordChange = passwordChange
							+ Character.toUpperCase(userPassword.charAt(i));

				}
				else
				{
					passwordChange = passwordChange + userPassword.charAt(i);
				}

			}
		}
		return passwordChange;

	}

	public static String caesarEncrypt(String msg, int userKey)
	{
		if (userKey > 26)
		{
			userKey = userKey % 26;
		}
		else if (userKey < 0)
		{
			userKey = (userKey % 26) + 26;
		}
		String cipherText = "";
		int length = msg.length();
		for (int i = 0; i < length; i++)
		{
			if (Character.isUpperCase(msg.charAt(i)))
			{
				char ch = (char) (((int) msg.charAt(i) + userKey - 65) % 26
						+ 65);
				cipherText += ch;
			}
			else
			{
				char ch = (char) (((int) msg.charAt(i) + userKey - 97) % 26
						+ 97);
				cipherText += ch;
			}
		}
		return cipherText;
	}

	public static String vigenerEncrypt(String enMsg, String enKey)
	{
		if (userKey > 26)
		{
			userKey = userKey % 26;
		}
		else if (userKey < 0)
		{
			userKey = (userKey % 26) + 26;
		}

		char msg[] = enMsg.toCharArray();
		char key[] = enKey.toCharArray();
		int msgLen = msg.length, i, j;

		char newKey[] = new char[msgLen];
		char encryptedMsg[] = new char[msgLen];

		for (i = 0, j = 0; i < msgLen; ++i, ++j)
		{
			if (j == key.length)
				j = 0;

			newKey[i] = key[j];
		}

		for (i = 0; i < msgLen; ++i)
			encryptedMsg[i] = (char) (((msg[i] + newKey[i]) % 26) + 'A');

		String orig_text = new String(encryptedMsg);
		return orig_text;

	}

	public static String caeserDecrypt(String deMsg, int key)
	{
		if (userKey > 26)
		{
			userKey = userKey % 26;
		}
		else if (userKey < 0)
		{
			userKey = (userKey % 26) + 26;
		}
		String cipherText = "";
		int length = deMsg.length();
		for (int i = 0; i < length; i++)
		{
			if (Character.isUpperCase(deMsg.charAt(i)))
			{
				char ch = (char) (((int) deMsg.charAt(i) - key - 65) % 26 + 65);
				cipherText += ch;
			}
			else
			{
				char ch = (char) (((int) deMsg.charAt(i) - key - 97) % 26 + 97);
				cipherText += ch;
			}
		}
		return cipherText;
	}

	public static String vigenerDecrypt(String deMsg, String deKey)
	{
		char encryptedMsg[] = deMsg.toCharArray();
		char key[] = deKey.toCharArray();
		int msgLen = encryptedMsg.length, i, j;

		char newKey[] = new char[msgLen];
		char decryptedMsg[] = new char[msgLen];

		for (i = 0, j = 0; i < msgLen; ++i, ++j)
		{
			if (j == key.length)
				j = 0;

			newKey[i] = key[j];
		}

		for (i = 0; i < msgLen; ++i)
			decryptedMsg[i] = (char) ((((encryptedMsg[i] - newKey[i]) + 26)
					% 26) + 'A');

		String cipher_text = new String(decryptedMsg);
		return cipher_text;

	}
}
