//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import static java.lang.System.*;

public class Number implements Comparable<Number>
{
	//add in instance variables
	String OGNum;
	int base;
	int base10Num;
	String binaryString;
	//add in a constructor or two
	public Number(String num, int base)
	{
		OGNum = num;
		this.base = base;

		base10Num = Integer.parseInt(OGNum, base);
		binaryString = Integer.toBinaryString(base10Num);
	}

	public int compareTo(Number param)
	{
		int firstCount = 0;
		int secondCount = 0;
		for (int i = 0; i < OGNum.length(); i++) {
			if (OGNum.charAt(i) == 1)
				firstCount++;
		}
		for (int i = 0; i < OGNum.length(); i++) {
			if (OGNum.charAt(i) == 1)
				secondCount++;
		}
		if (firstCount - secondCount != 0)
			return firstCount - secondCount;
		if (base10Num - param.base10Num != 0)
			return base10Num - param.base10Num;
		return OGNum.compareTo(param.OGNum);
	}
	
	public String toString( )
	{
	  return OGNum + " " + base10Num + " " + binaryString;
	}
}