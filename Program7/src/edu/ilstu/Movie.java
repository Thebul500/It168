/*
* File name: Movie.java
*
* Programmer: Sannan iqbal
* ULID:800765660
*
* Date: Nov 21, 2019
*
* Class: IT 168
* Lecture Section: 13
* Lecture Instructor:Shukri Abotteen
* Lab Section:13
* Lab Instructor:Rekha Peri
*/
package edu.ilstu;

/**
 * <insert class description here>
 *
 * @author Sannan Iqbal
 *
 */
public class Movie
{
	String title;
	String rating;
	int year;
	int score;

	public String getTitle()
	{
		return title;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	public String getRating()
	{
		return rating;
	}

	public void setRating(String rating)
	{
		this.rating = rating;
	}

	public int getYear()
	{
		return year;
	}

	public void setYear(int year)
	{
		this.year = year;
	}

	public int getScore()
	{
		return score;
	}

	public void setScore(int score)
	{
		this.score = score;
	}

	public Movie(String title, String rating, int year, int score)
	{
		this.title = title;
		this.rating = rating;
		this.year = year;
		this.score = score;

	}

	public String toString()
	{
		return "The title of the movie is: " + title + " \n " +  " rating: " + rating
				+ " \n " + "With a score of: " + score + "\n" + " Year of: "
				+ year;

	}

}
