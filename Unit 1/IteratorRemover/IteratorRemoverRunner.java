//(c) A+ Computer Science
//www.apluscompsci.com

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import static java.lang.System.*;

public class IteratorRemoverRunner
{
	public static void main ( String[] args )
	{
		IteratorRemover test = new IteratorRemover("a b c a b c a", "a");
		test.remove();
		System.out.println(test);
	}
}