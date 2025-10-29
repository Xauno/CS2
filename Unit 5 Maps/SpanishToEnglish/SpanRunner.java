//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class SpanRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("spantoeng.dat"));
		SpanishToEnglish test = new SpanishToEnglish();
		int times = file.nextInt();
		file.nextLine();
		for(int i = 0; i < times; i++)
		{
			String line = file.nextLine();
			test.putEntry(line);
		}
		while(file.hasNextLine())
		{
			String line = file.nextLine();
			out.println(test.translate(line));
		}
	}
}