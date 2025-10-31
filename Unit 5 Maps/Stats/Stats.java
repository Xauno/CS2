import java.util.*;

class Stats
{
	private Map<String, String> m;
	private int line;
	
	public Stats()
	{
		m = new TreeMap<String, String>();
		line = 0;
		//instantiate your instance variables
	}
	
	public void add( String s )
	{
		line++;
		String[] words = s.split(" ");
		for ( String w : words )
		{
			if (m.containsKey(w))
				m.put(w, m.get(w) + line + " ");
			else
				m.put(w, line + " ");
		}
		//add code here to build the map
	}
	
	public String toString()
	{
		String s = "";

		for (String word : m.keySet()) {
			s += word + " " + m.get(word) + "\n";
			}
		return s;
	}	
}