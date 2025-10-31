//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;

public class Phone
{
	private Map<String, Integer> m;
	
	public Phone()
	{
		m = new HashMap<String, Integer>();
		String info = "ABC DEF GHI JKL MNO PQRS TUV WXYZ";
		int i = 0;
		for (String letters: info.split(" "))
		{
			m.put(letters, i + 2);
			i++;
		}
		System.out.println(m);		
	}
	
	public String getNumber( String s )
	{
		String conv = "";
		for (int i = 0; i < s.length(); i++)
		{
			char c = s.charAt(i);
			if (Character.isDigit(c) || c == '-')
			{
				conv += c;
			}
			else
			{
				for (String letters: m.keySet())
				{
					if (letters.indexOf(c) != -1)
					{
						conv += m.get(letters);
						break;
					}
				}
			}
		}
		//add in the code to convert
		//the phone number
		return conv;
	}

}