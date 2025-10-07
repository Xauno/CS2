//� A+ Computer Science  -  www.apluscompsci.com
//Name - 
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.ArrayList;
import java.util.Collections;

public class LongPalindrome
{
	/*
	 *method getAllPalins will return an array list that contains
	 *all of the palindromes contained within word
	 *palindromes must have a minimum length of 2
	*/
	public static ArrayList<Palin> getAllPalins(String word)
	{
		int size = word.length();
		ArrayList<Palin> Palins = new ArrayList<>();

		while (size > 1)
		{
			for (int i = 0; i < word.length() - size + 1 ; i++) // have no idea why i need the + 1 in second argument
			{
				Palin tempWord = new Palin(word.substring(i, i + size));
				if (tempWord.isPalin())
					Palins.add(tempWord);
			}
			size--;
		}
		Collections.sort(Palins);
		return Palins;
	}

	/*
	*method insertLocation will look at the list and determine where to
	*put the new Palin so that the sorted order is maintained
	*/
	private static int insertLocation( ArrayList<Palin> list, Palin pal )
	{
		int location = Collections.binarySearch(list, pal);
		return location;
	}

	/*
	 *method getLongestPalin will return the longest
	 *palindrome contained within word
	 *a palindrome must a minimum length of 2
	*/
	public static Palin getLongestPalin(String word)
	{
		ArrayList<Palin> palins = getAllPalins(word);
		int longestLetters = palins.get(0).getLength();
		int longestIndex = 0;

		for (int i = 1; i < palins.size(); i++)
		{
			if (longestLetters < palins.get(i).getLength())
			{
				longestIndex = i;
				longestLetters = palins.get(i).getLength();
			}
		}

		return palins.get(longestIndex);
	}
}