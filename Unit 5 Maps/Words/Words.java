//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;

public class Words
{
	private Map<String, Integer> m;
	
	public Words()
	{
		m = new HashMap<String, Integer>();
		String[] words = {"zero","one","two","three","four","five","six","seven","eight","nine"};
		for(int i = 0; i < words.length; i++) {
			m.put(words[i], i);
		}
		//create a new map
		//load in values						
	}
	
	public int getNumber( String s )
	{
		return m.get(s);   //change this
	}

}