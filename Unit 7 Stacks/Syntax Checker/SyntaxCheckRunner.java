//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
import java.io.File;
import java.util.Scanner;
import java.util.Stack;
import static java.lang.System.*;

public class SyntaxCheckRunner
{
	public static void main ( String[] args ) throws Exception
	{
		//add test cases
		Scanner file = new Scanner(new File("stuff.dat"));
		SyntaxChecker sc = new SyntaxChecker();
		while(file.hasNextLine()) {
			sc.setExpression(file.nextLine());
			out.println(sc.toString());
		}
		
	}
}