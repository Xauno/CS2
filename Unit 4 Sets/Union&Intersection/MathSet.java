//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.HashSet;

import static java.lang.System.*;

public class MathSet
{
	private Set<Integer> one;
	private Set<Integer> two;

	public MathSet()
	{
		one = new TreeSet<Integer>();
		two = new TreeSet<Integer>();
	}

	public MathSet(String o, String t)
	{
		one = new TreeSet<Integer>();
		two = new TreeSet<Integer>();
		String[] oneStrings = o.split(" ");
		for (String s : oneStrings) {
			one.add(Integer.parseInt(s));
		}
		String[] twoStrings = t.split(" ");
		for (String s : twoStrings) {
			two.add(Integer.parseInt(s));
		}
	}

	public Set<Integer> union()
	{
		TreeSet<Integer> unionSet = new TreeSet<Integer>(one);
		unionSet.addAll(two);
		return unionSet;
	}

	public Set<Integer> intersection()
	{
		TreeSet<Integer> intersectionSet = new TreeSet<Integer>(one);
		intersectionSet.retainAll(two);
		return intersectionSet;
	}

	public Set<Integer> differenceAMinusB()
	{
		TreeSet<Integer> differenceSet = new TreeSet<Integer>(one);
		differenceSet.removeAll(two);
		return differenceSet;
	}

	public Set<Integer> differenceBMinusA()
	{
		TreeSet<Integer> differenceSet = new TreeSet<Integer>(two);
		differenceSet.removeAll(one);
		return differenceSet;
	}
	
	public Set<Integer> symmetricDifference()
	{	
		TreeSet<Integer> symDiffSet = new TreeSet<Integer>(union());
		symDiffSet.removeAll(intersection());
		return symDiffSet;
	}	
	
	public String toString()
	{
		return "Set one " + one + "\n" +	"Set two " + two +  "\n";
	}
}