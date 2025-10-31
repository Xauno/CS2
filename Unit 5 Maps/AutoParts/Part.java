//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
import java.util.Arrays;

public class Part implements Comparable<Part>
{
	private String make, mode, rest;
	private int year;

	public Part(String line) 
	{
		String[] list = line.split("\\d+");
		System.out.println(Arrays.toString(list));
		// rest = list[0];
		// make = list[1];
		// mode = list[2];
		// year = Integer.parseInt(list[3]);



	}

	//have to have compareTo if implements Comparable
	public int compareTo( Part rhs )
	{





		return 0;
	}

	public String toString()
	{
		return "";
	}
}