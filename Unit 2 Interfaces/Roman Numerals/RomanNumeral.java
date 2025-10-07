//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

public class RomanNumeral implements Comparable<RomanNumeral>
{
	private Integer number;
	private String roman;

	private final static int[] NUMBERS= {1000,900,500,400,100,90,
													50,40,10,9,5,4,1};

	private final static String[] LETTERS = {"M","CM","D","CD","C","XC",
												  "L","XL","X","IX","V","IV","I"};

	public RomanNumeral(String str)
	{
		setRoman(str);
	}

	public RomanNumeral(Integer orig)
	{
		setNumber(orig);
	}

	//write a set number method
	public void setNumber(Integer num)
	{
		number = num;
		roman = calculateRoman();
	}
	
	
	//write a set roman method
	public void setRoman(String str)
	{
		roman = str;
		number = calculateNum();
	}

	//write get methods for number and roman
	
	public int getNumber() {
		return number;
	}

	public String getRoman() {
		return roman;
	}

	private int calculateNum() {

		int i = 0;
		int num = 0;
		while (i < roman.length())
		{
			for (int numeral = 0; numeral < LETTERS.length; numeral++)
				if (LETTERS[numeral] == roman.substring(i, i + LETTERS[numeral].length))
				{
					num += NUMBERS[numeral];
					i += LETTERS[numeral].length;
				}
		}
		return num;
	}

	private int calculateRoman() {
		int temp = number;
		int index = 0;
		String returnString = "";
		while (temp != 0) {
			for (int i = index; i < NUMBERS.length; i++)
			{
				if (Integer.signum(number - NUMBERS[index]) == 1) {
					number -= NUMBERS[index];
					returnString += LETTERS[index];
				} else {
					index++;
				}
			}
		}
		return returnString;
	}

	public int compareTo(RomanNumeral r)
	{
		return this.getNumber() - r.getNumber();
	}

	//write  toString() method

	public String toString()
	{
		return getNumber() + " " + getRoman();
	}
	
	
	
}