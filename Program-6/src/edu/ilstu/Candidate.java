/*
* File name: Candidate.java
*
* Programmer: Sannan iqbal
* ULID:800765660
*
* Date: Nov 6, 2019
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
public class Candidate
{
	String fName, lName, office, party;
	int votes;
	boolean wonVote = true;

	public String getfName()
	{
		return fName;
	}

	public String getlName()
	{
		return lName;
	}

	public String getOffice()
	{
		return office;
	}

	public String getParty()
	{
		return party;
	}

	public int getVotes()
	{
		return votes;
	}

	public void setVotes(int votes)
	{
		this.votes = votes;
	}

	public boolean isWonVote()
	{
		return wonVote;
	}

	public void setWonVote(boolean wonVote)
	{
		this.wonVote = wonVote;
	}

	public Candidate(String fName, String lName, String office, String party,
			int vote, boolean wonVote)
	{
		this.fName = fName;
		this.lName = lName;
		this.office = office;
		this.party = party;
		this.votes = vote;
		this.wonVote = wonVote;

	}

	public Candidate(Candidate nextC)
	{
		this(nextC.fName, nextC.lName, nextC.office, nextC.party, nextC.votes,
				nextC.wonVote);

	}

	// might have to automate
	public String toString()
	{
		return "Candidate: "+fName + " " + lName + " \n "+"Office: " + office + "\n"+" Candidate Party: "
				+ party + "\n  "+" Total votes " + votes;

	}

	public boolean equals(Candidate A)
	{
		if (this.getfName().equals(A.getfName())
				&& this.getlName().equals(A.getlName())
				&& this.getParty().equals(A.getParty()))
		{
			return true;

		}

		return false;

	}

}
