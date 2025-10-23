//(c) A+ Computer Science
//www.apluscompsci.com

import java.util.Scanner;
import java.util.Map;
import java.util.TreeMap;

public class Histogram
{
	private Map<String,Integer> histogram;

	public Histogram( String line )
	{
		histogram = new TreeMap<String,Integer>();
		for ( String s : line.split(" ") )
		{
			if ( histogram.containsKey(s) )
				histogram.put(s, histogram.get(s)+1);
			else
				histogram.put(s, 1);
		}
	}
	
	public int getValue( String s )
	{
		return histogram.get(s);
	}

	public String toString()
	{

		String output= "char 1---5----01---5\n";
		for ( String s : histogram.keySet() )
		{
			output += s + "    ";
			for (int i = 0; i < histogram.get(s); i++) {
				output += "*";
			}
			output += "\n";
		}
		return output+"\n\n";
	}
}