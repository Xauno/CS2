//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;

public class RomansII
{
	private Map<String, Integer> m;
	
	public RomansII()
	{
		m = new TreeMap<String, Integer>();
		
		/*
			Symbol	I	V	X		L		C		D		M
			Value		1	5	10		50		100	500	1000
		*/
		
		m.put( "I", 1 );
		m.put( "V", 5 );
		m.put( "X", 10 );
		m.put( "L", 50 );
		m.put( "C", 100 );
		m.put( "D", 500 );
		m.put( "M", 1000 );					
	}
	
	public int getNumber( String s )
	{
		String[] letters = s.split(" ");
		int total = 0;
		for (String letter : letters) {
		    total += m.get( letter );
		    }
		return total;
	}

}