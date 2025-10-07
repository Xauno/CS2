//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.HashSet;
import java.util.ArrayList;
import static java.lang.System.*;

public class UniquesDupes
{
	public static Set<String> getUniques(String input)
	{
		Set<String> uniques = new TreeSet<String>();

		//add code
		String[] inputList = input.split(" ");
		for (String word: inputList)
			uniques.add(word);

		return uniques;
	}

	public static Set<String> getDupes(String input)
	{
		//add code
		String[] checkList = input.split(" ");
		HashSet<String> stuff = new HashSet<>();
		HashSet<String> dupes = new HashSet<>();
		for (String word: checkList) {
			if (stuff.contains(word))
				dupes.add(word);
			else
				stuff.add(word);
		}

		return dupes;
	}
}