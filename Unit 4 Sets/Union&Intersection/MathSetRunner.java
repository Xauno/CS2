//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class MathSetRunner
{
	public static void main(String args[]) throws IOException
	{
		Scanner file = new Scanner(new File("mathsetdata.dat"));
		while (file.hasNextLine()) {
			MathSet test = new MathSet(file.nextLine(), file.nextLine());
			System.out.println(test);
			System.out.println("union - " + test.union());
			System.out.println("intersection - " + test.intersection());
			System.out.println("differenceAMinusB - " + test.differenceAMinusB());
			System.out.println("differenceBMinusA - " + test.differenceBMinusA());
			System.out.println("symmetricDifference - " + test.symmetricDifference());
		}
		file.close();
	}
}
