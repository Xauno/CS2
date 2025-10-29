//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Scanner;
import java.util.Arrays;


public class StudentsAndGrades
{
	private Map<Integer,Set<String>> map;

	public StudentsAndGrades()
	{
		//make a new map
		map = new TreeMap<Integer,Set<String>>();
	}

	public void setStudent(String line)
	{
		//add each student to the amp
		String[] parts = line.split(" ");
		int grade = Integer.parseInt(parts[1]);
		map.putIfAbsent(grade, new TreeSet<String>());
		map.get(grade).add(parts[0]);
	}


	public String getNames( Integer grade )
	{
		return map.get(grade).toString();
	}

	public String toString()
	{
		String output="";
		for (Integer grade : map.keySet()) {
			output += grade + " " + map.get(grade) + "\n";
		}
		//add the map information to output
		return output;
	}
}