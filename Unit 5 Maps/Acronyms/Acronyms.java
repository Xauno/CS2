//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;
import static java.lang.System.*;

public class Acronyms
{
	private Map<String,String> acronymTable;

	public Acronyms()
	{
		acronymTable = new TreeMap<String,String>();
	}

	public void putEntry(String entry)
	{
		Scanner chop = new Scanner(entry);
		String acronym = chop.next();
		chop.next();
		String value = chop.nextLine().trim();
		acronymTable.put(acronym, value);
		chop.close();
	}

	public String convert(String sent)
	{
		Scanner chop = new Scanner(sent);
		String output = "";
		while (chop.hasNext())
		{
			String word = chop.next();
			boolean hasPeriod = word.endsWith(".");
			if (hasPeriod)
			{
				word = word.substring(0, word.length() - 1);
			}
			if (acronymTable.containsKey(word))
			{
				word = acronymTable.get(word);
			}
			output += word + " ";
			if (hasPeriod)
			{
				output = output.trim() + ". ";
			}
		}
		chop.close();
		return output.trim();
	}

	public String toString()
	{
		return "";
	}
}