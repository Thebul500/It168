package edu.ilstu;

/**
 * This class is for the song as it has two variables title, and artist 
 *
 * @Sannan Iqbal
 *
 */
public class Song
{
	String title;
	String artist;

	public Song(String title, String artist)
	{
		this.artist = artist;
		this.title = title;

	}

	public String getTitle()
	{
		return title;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	public String getArtist()
	{
		return artist;
	}

	public void setArtist(String artist)
	{
		this.artist = artist;
	}

	public String toString()
	{

		String myString = "Title = "+this.title+ " by " + this.artist + "\n";

		return myString;
	}

}
