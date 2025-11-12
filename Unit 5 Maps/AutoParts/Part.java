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
		String[] list = line.split("(?<=\\S)\\s+(?=\\d)|(?<=\\d)\\s+(?=\\S)");
		rest = list[1];
		make = list[2];
		mode = list[0];
		year = Integer.parseInt(list[3]);



	}

	//have to have compareTo if implements Comparable
	public int compareTo( Part rhs )
	{
		int makeDiff = this.make.compareTo(rhs.make);
		if (makeDiff != 0) {
			return makeDiff;
		} else {
			int modeDiff = this.mode.compareTo(rhs.mode);
			if (modeDiff != 0) {
				return modeDiff;
			} else {
				return this.year - rhs.year;
			}
		}
	}

	@Override
	public boolean equals(Object obj) {
		return this.toString().equals(obj.toString());
	}

	public String toString()
	{
		return make + " " + year  + "  " + mode + " " + rest;
	}
}