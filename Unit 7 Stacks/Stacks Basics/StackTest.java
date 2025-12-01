//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.Stack;
import static java.lang.System.*;

public class StackTest
{
	private Stack<String> stack;

	public StackTest()
	{
		setStack("");
	}

	public StackTest(String line)
	{
		setStack(line);
	}
	
	public void setStack(String line)
	{
		stack = new Stack<String>();
		String[] arr = line.split(" ");
		for(String s : arr)
		{
			stack.push(s);
		}
	}

	public void popEmAll()
	{
		System.out.println(" Popping all items from the stack");
		while(!stack.isEmpty())
		{
			out.print(stack.pop() + " ");
		}
		System.out.println();
	}

	//add a toString
	public String toString()
	{
		return "stack = " + stack.toString();
	}
}