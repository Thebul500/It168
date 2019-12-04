/*
* File name: Results.java
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

import java.util.Scanner;

/**
 * body class for candidate to do the election and checks if candidate is
 * already their.
 *
 * @author Sannan Iqbal
 *
 */

/**
 * <insert class description here>
 *
 * @author Sannan Iqbal
 *
 */
public class Results
{
	Scanner s = new Scanner(System.in);
	public final int BLOCK_SIZE = 3;
	private Candidate[] candidate;
	private int candidateSize;
	private String[] office;
	private int officeSize;

	public Results()
	{
		candidate = new Candidate[BLOCK_SIZE];
		office = new String[BLOCK_SIZE];
		candidateSize = 0;
		officeSize = 0;
	}

	/**
	 * return the array Candidates
	 *
	 * @author Sannan Iqbal
	 *
	 */
	public Candidate[] getCandidates()
	{
		return candidate;
	}

	/**
	 * Returns the candidates size of the array
	 * 
	 * @author Sannan Iqbal
	 *
	 */

	public int getCandidateSizes()
	{
		return candidateSize;
	}

	public int getOfficeSize()
	{
		return officeSize;
	}

	public String toString()
	{
		String console = "";
		for (int i = 0; i < getCandidateSizes(); i++)
		{
			console += candidate[i].toString() + "\n***************\n";
		}
		return console;
	}

	public boolean hasCandidate(Candidate choice)
	{
		for (int i = 0; i < getCandidateSizes(); i++)
		{
			if (getCandidates()[i].equals(choice))
			{
				return true;
			}

		}
		return false;
	}

	public boolean isCandidatesFull()
	{
		// Inciting the candidates and see if length match.
		if (candidateSize == candidate.length)
		{
			return true;
		}
		return false;
	}

	public boolean isOfficeFull()
	{
		if (officeSize == office.length)
		{
			return true;
		}
		return false;

	}

	public void addCandidate()
	{
		System.out.println("Enter the first name: ");
		String fName = s.nextLine();
		System.out.println("Enter the last name: ");
		String lName = s.nextLine();
		System.out.println("Enter the candidate's office: ");
		String cOffice = s.nextLine();
		System.out.println("Enter the candidates party: ");
		String cParty = s.nextLine();

		int votes = 0;
		boolean won = false;
		Candidate add = new Candidate(fName, lName, cOffice, cParty, votes,
				won);

		while (this.hasCandidate(add) == true)
		{
			System.out.println("Candidate already on ballot");
			System.out.println("                             ");
			System.out.println("Enter the first name: ");
			fName = s.nextLine();
			System.out.println("Enter the last name: ");
			lName = s.nextLine();
			System.out.println("Enter the candidate's office: ");
			cOffice = s.nextLine();
			System.out.println("Enter the candidates party: ");
			cParty = s.nextLine();
			add = new Candidate(fName, lName, cOffice, cParty, votes, won);

		}
		this.addCandidate(add);

	}

	private void addCandidate(Candidate add)
	{
		// check if it is full
		if (isCandidatesFull())
		{
			resizeCandidate();
			candidate[this.getCandidateSizes()] = add;
			candidateSize++;
		}
		else
		{
			candidate[this.getCandidateSizes()] = add;
			candidateSize++;
		}

		// checks the office representatives and how many spaces
		boolean hasOffice = false;
		for (int i = 0; i < getOfficeSize(); i++)
		{
			if (office[i].equals(add.getOffice()))
			{
				hasOffice = true;
			}
		}

		if (hasOffice == false)
		{

			if (isOfficeFull() == false)
			{
				office[this.getOfficeSize()] = add.getOffice();
				officeSize++;
			}
			else
			{
				resizeOffice();
				office[this.getOfficeSize()] = add.getOffice();
				officeSize++;

			}
		}
	}

	public void resizeCandidate()
	{
		Candidate[] candidateBackup = new Candidate[this.getCandidateSizes()
				+ BLOCK_SIZE];

		for (int i = 0; i < candidate.length; i++)
		{
			candidateBackup[i] = candidate[i];
		}
		candidate = candidateBackup;
	}

	public void resizeOffice()
	{
		String[] officeBackup = new String[this.getOfficeSize() + BLOCK_SIZE];

		for (int i = 0; i < candidate.length; i++)
		{
			officeBackup[i] = office[i];
		}
		office = officeBackup;

	}

	public void addVotes()
	{

		for (int i = 0; i < candidateSize; i++)
		{
			System.out.print("Enter new votes for " + candidate[i].getfName()
					+ " " + candidate[i].getlName() + " ");
			int cVote = s.nextInt();
			candidate[i].votes += cVote;
		}

	}

	public void determineWinner()
	{
		int counter = 1;
		for (int i = 0; i < getOfficeSize(); i++)
		{
			System.out.println(counter + "    " + office[i]);
			counter++;
		}

		// user will choose which office they want to determine winner for
		System.out.println(" Please choose an office ");
		int officeChoice = s.nextInt();
		// How to display 3 after choosing the office
		createCandidateListByOffice(officeChoice);

	}

	public void createCandidateListByOffice(int officeChoice)
	{
		Candidate[] temp = new Candidate[getCandidateSizes()];
		for (int i = 0; i < temp.length; i++)
		{
			if (candidate[i].getOffice().equals(office[officeChoice - 1]))
				;
			{
				temp[i] = candidate[i];
			}

		}
		findHighestVotes(temp);
	}
	//Finds the winner.
	// finds the highest vote and displays the candidate, if it is equal then there is no winner.
	// if they have 0 votes then no winner
	//if two candidates have the same vote value then they have a tie and there is no winner. 
	private void findHighestVotes(Candidate temp[])
	{
		if (temp.length == 1 && temp[0].getVotes() > 1)
		{
			candidate[0].setWonVote(true);
			System.out.println(candidate[0].toString());
			System.out.println("\n******************");
			System.out.println("The winner is: "+candidate[0].getfName()+" " + candidate[0].getlName());
			
		}
		else if (temp.length > 1)
		{
			int largest = 0;
			for (int i = 0; i < temp.length; i++)
			{
				if (temp[i].getVotes() >= largest)
				{
					largest = temp[i].getVotes();
				}
			}
				int loop =0;
			for (int i = 0; i < temp.length; i++)
			{
				if (temp[i].getVotes() == largest)
				{
					loop++;
					if (loop< 2){
						System.out.println(temp[i].toString());
						System.out.println("\n**************");
						System.out.println("Winner is:" + temp[i].getfName()+" "+temp[i].getlName() );
					}
					
					for (int x = 0; x < getCandidateSizes(); x++)
					{
						if (temp[i].equals(candidate[i]))
						{
							candidate[i].setWonVote(true);
						}
					}
				}
				if (loop >=2) {
					System.out.println(temp[i].toString());
					System.out.println("It is a tie, there are no winners.");
				}
			}
		}

	}

	// outputs all candidates who have won their race.
	// loop through every single candidate and check if its true then print
	public String displayWinners()
	{
		String output = " ";
		for (int i = 0; i < candidateSize; i++)
		{
			if (getCandidates()[i].isWonVote() == true)
			{
				output += getCandidates()[i].toString()
						+ "\n****************************\n";
			}
		}
		return output;
	}

}
