//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class OddRunner
{
	public static void main( String args[] ) throws IOException
	{
		//more test cases
		Scanner file = new Scanner(new File("oddevent.dat"));
		while (file.hasNextLine()) {
			OddEvenSets test = new OddEvenSets(file.nextLine());
			System.out.println(test);
		}
		file.close();
				
	}
}