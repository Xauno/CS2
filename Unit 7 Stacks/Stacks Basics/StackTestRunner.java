//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import static java.lang.System.*;

public class StackTestRunner
{
	public static void main ( String[] args )
	{
		//add test cases	
		StackTest test1 = new StackTest("a b c d e f g h i");
		test1.popEmAll();	
		StackTest test2 = new StackTest("1 2 3 4 5 6 7 8 9 10");
		test2.popEmAll();
		StackTest test3 = new StackTest("# $ % ^ * ( ) ) _");
		test3.popEmAll();
	}
}
