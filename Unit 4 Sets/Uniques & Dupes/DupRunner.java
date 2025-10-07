//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import static java.lang.System.*;
import java.util.*;

public class DupRunner
{
	public static void main( String args[] )
	{
		System.out.println("Original List: a b c d e f g h a b c d e f g h i j k");
		System.out.println("Uniques: " + UniquesDupes.getUniques("a b c d e f g h a b c d e f g h i j k"));
		System.out.println("Dupes: " + UniquesDupes.getDupes("a b c d e f g h a b c d e f g h i j k"));
	}
}