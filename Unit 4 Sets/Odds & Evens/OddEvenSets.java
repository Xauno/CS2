//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import static java.lang.System.*;

public class OddEvenSets
{
	private Set<Integer> odds;
	private Set<Integer> evens;

	public OddEvenSets()
	{
		odds = new HashSet<>();
		evens = new HashSet<>();
	}

	public OddEvenSets(String line)
	{
		odds = new HashSet<>();
		evens = new HashSet<>();
		String[] numbers = line.split(" ");
		for (String number: numbers) {
			int actualNumber = Integer.parseInt(number);
			if (actualNumber % 2 == 0)
				evens.add(actualNumber);
			else
				odds.add(actualNumber);
		}

	}

	public String toString()
	{
		return "ODDS : " + odds + "\nEVENS : " + evens + "\n\n";
	}
}