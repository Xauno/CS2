//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Scanner;
import static java.lang.System.*;

public class Relatives
{
	private Map<String,Set<String>> map;

	public Relatives()
	{
		map = new TreeMap<String,Set<String>>();
	}

	public void setPersonRelative(String line)
	{
		String[] personRelative = line.split(" ");

		map.putIfAbsent(personRelative[0], new TreeSet<String>());
		map.get(personRelative[0]).add(personRelative[1]);

		map.putIfAbsent(personRelative[1], new TreeSet<String>());
		map.get(personRelative[1]).add(personRelative[0]);


	}


	public String getRelatives(String person)
	{
		return map.get(person).toString();
	}


	public String toString()
	{
		String output="";

		for (String person : map.keySet()) {
			output += person + " is related to ";
			for (String relative : map.get(person)) {
				output += relative + " ";
			}
			output += "\n";
		}

		return output;
	}
}