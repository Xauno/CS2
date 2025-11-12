//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import static java.lang.System.*;
import java.util.Scanner;
import java.io.File;

public class BaseRunner
{
	public static void main ( String[] args ) throws Exception
	{
		//add test cases
		Scanner file = new Scanner(new File("stuff.dat"));
		BaseConversion test;
		while(file.hasNextLine()) {
			test = new BaseConversion(file.next(), file.nextInt());
			out.println(test + " - " + test.getNum(file.nextInt()));
		
		
		
		
		}
	}
}