//(c) A+ Computer Science
//www.apluscompsci.com

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class HistogramRunner
{
	public static void main( String args[] ) throws IOException
	{
		
		Scanner keyboard = new Scanner(new File("histogram.dat"));
		while (keyboard.hasNextLine()) {
			String line = keyboard.nextLine();
			Histogram test = new Histogram(line);
			System.out.println(test);
		}
		//add test cases		
	}
}