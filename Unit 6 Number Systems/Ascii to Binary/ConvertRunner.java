//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class ConvertRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("convert.dat"));
		while (file.hasNextLine()) {
			String line = file.nextLine();
			Convert convert = new Convert(line);
			convert.convert();
			out.println(convert);
		}
		//file from the file






	}
}