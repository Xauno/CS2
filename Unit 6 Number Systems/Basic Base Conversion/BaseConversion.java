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
		int q =number.length();
		int base10=0;
		for (int i = q; i > 0; i--) {
			char ch = number.charAt(i-1);
			int digit = ch - '0';
			base10 += digit * Math.pow(base, q - i);
		}


		return base10;
	}

	public String getNum(int newBase)
	{
	   	int base10 = convertToTen();
		String newNum="";
		while (base10 > 0) {
			int rem = base10 % newBase;
			newNum = rem + newNum;
			base10 = base10 / newBase;
		}







		return newNum+"-"+newBase;
	}

	public String toString()
	{
		return number+"-"+base;
	}
}