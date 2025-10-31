//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class AcroRunner
{
	public static void main( String args[] ) throws IOException
	{
		Acronyms test = new Acronyms();
		try{
			Scanner file = new Scanner(new File("acro.dat"));
			int times = file.nextInt();
			file.nextLine();
			for (int i = 0; i < times; i++)
			{
				String line = file.nextLine();
				test.putEntry(line);
			}
			while(file.hasNextLine())
			{
				String line = file.nextLine();
				out.println(test.convert(line));
			}
			file.close();
		} catch (IOException e) {
			out.println("File not found");
		}
		//add test cases
	}
}