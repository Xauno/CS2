//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.Iterator;
import java.util.Stack;
import java.util.Scanner;
import static java.lang.System.*;

import java.util.ArrayList;
import java.util.Arrays;

public class PostFix
{
	private Stack<Double> stack;
	private String expression;

	public PostFix()
	{
		stack = new Stack<Double>();
		expression = "";
	}

	public PostFix(String exp)
	{
		setExpression(exp);
	}

	public void setExpression(String exp)
	{
		expression = exp;
		stack = new Stack<Double>();
	}

	public double calc(double one, double two, char op)
	{
		if (op == '+')
			return one + two;
		else if (op == '-')
			return one - two;
		else if (op == '*')
			return one * two;
		else if (op == '/')
			return one / two;
		return 0;
	}

	public void solve()
	{
		ArrayList<Character> tokens = new ArrayList<Character>();
		for (char c : expression.toCharArray()) {
			if (c != ' ')
				tokens.add(c);
		}
		for (char token : tokens) {
			if (Character.isDigit(token)) {
				stack.push((double)(token - '0'));
			} else {
				double two = stack.pop();
				double one = stack.pop();
				double result = calc(one, two, token);
				stack.push(result);
			}
		}
	}

	public String toString()
	{
		solve();
		return "" + stack.pop();
	}
}