//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.Stack;
import static java.lang.System.*;

public class SyntaxChecker
{
	private String exp;
	private Stack<Character> symbols;

	public SyntaxChecker()
	{
		exp = "";
		symbols = new Stack<Character>();
	}

	public SyntaxChecker(String s)
	{
		exp = s;
		symbols = new Stack<Character>();
	}
	
	public void setExpression(String s)
	{
		exp = s;
		symbols = new Stack<Character>();
	}

	public boolean checkExpression()
	{
		String open = "({[<";
		String close = ")}]>";
		for(int i = 0; i < exp.length(); i++) {
			char ch = exp.charAt(i);
			if(open.indexOf(ch) != -1) {
				symbols.push(ch);
			}
			if (close.indexOf(ch) != -1) {
				if(symbols.isEmpty()) {
					return false;
				}
				char lastOpen = symbols.pop();
				if(open.indexOf(lastOpen) != close.indexOf(ch)) {
					return false;
				}
			}
		}
		if(symbols.isEmpty()) 
			return true;
		return false;
	}
	//write a toString
	public String toString()
	{
		return exp + " is " + (checkExpression() ? "correct." : "incorrect.");
	}
}