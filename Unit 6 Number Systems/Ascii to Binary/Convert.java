//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class Convert
{
	private String sentence;
	private String binary;

	public Convert()
	{
		sentence = "";
		binary = "";
	}

	public Convert(String sentence)
	{
		this.sentence = sentence;
		binary = "";


	}

	public void convert()
	{
		for(int i = 0; i < sentence.length(); i++) {
			char ch = sentence.charAt(i);
			String binString = Integer.toBinaryString((int) ch);
			while(binString.length() < 8) {
				binString = "0" + binString;
			}
			binary += binString + " ";
		}










	}

	public String toString()
	{
		return binary;
	}
}