//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class RelativesRunner
{
	public static void main( String args[] ) throws IOException
	{
		//add more test cases
		Scanner file = new Scanner(new File("relatives.dat"));
		int size = Integer.parseInt(file.nextLine());
		Relatives test = new Relatives();
		for (int i = 0; i < size; i++) {
			test.setPersonRelative(file.nextLine());
		}
		out.println(test);		
	}
}