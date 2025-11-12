//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import static java.lang.System.*;

public class BaseConversion
{
	private String number;
	private int base;

	public BaseConversion(String num, int b)
	{
		number = num;
		base = b;
	}

	public void setNumBase(String num, int b)
	{
		number = num;
		base = b;
	}

	private int convertToTen( )
	{
		//int q=number.length();
		int base10=0;
		base10 = Integer.parseInt(number, base);


		return base10;
	}

	public String getNum(int newBase)
	{
	   int base10 = convertToTen();
		String newNum="";
		newNum = Integer.toString(base10, newBase);







		return newNum+"-"+newBase;
	}

	public String toString()
	{
		return number+"-"+base;
	}
}