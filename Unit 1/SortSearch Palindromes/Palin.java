//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.ArrayList;


class Palin implements Comparable<Palin>
{
	private String word;

	public Palin(String w)
	{
		word = w;
	}

		public Palin()
	{
		word = "";
	}

	public int getLength()
	{
		return word.length();
	}

	public String getWord()
	{
		return word;
	}

	public boolean isPalin()
	{
		for (int i = 0; i < word.length()/2; i++)
			if (word.charAt(i) != word.charAt(word.length() - 1 - i))
				return false;
		return true;
	}

	public String toString()
	{
		return word;
	}

	public int compareTo(Palin other)
	{
			return this.word.compareTo(other.word);
	}

	

	/*
 */
}

	


	//constructors


	//getLength method - returns an int


	//getWord method - returns a String


	//isPalin method - returns a boolean


	//toString method - returns a String
