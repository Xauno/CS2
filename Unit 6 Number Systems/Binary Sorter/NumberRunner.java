//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
 
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
import static java.lang.System.*;

public class NumberRunner
{
	public static void main ( String[] args ) throws IOException
	{
		Scanner file = new Scanner(new File("number.dat"));
		ArrayList<Number> numbers = new ArrayList<Number>();
		int times = file.nextInt();
		for (int i = 0; i < times; i++) {
			String num = file.next();
			int base = file.nextInt();
			numbers.add(new Number(num, base));
		}
		numbers.sort(null);
		for (Number n : numbers) {
			out.println(n);
		} 
		//add test cases
	}
}