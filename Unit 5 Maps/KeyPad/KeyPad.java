//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Map;
import java.util.HashMap;

public class KeyPad
{
	public static double average( String s )
	{
		HashMap<String, Integer> m = new HashMap<String, Integer>();
		String info = "#@% ABC DEF GHI JKL MNO PQRS TUV WXYZ";
		int i = 0;
		for (String letters: info.split(" "))
		{
			m.put(letters, i + 1);
			i++;
		}
		double average = 0;
		for (char c: s.toUpperCase().toCharArray())
		{
			for (String letters: m.keySet())
			{
				if (letters.indexOf(c) != -1)
				{
					average += m.get(letters);
					break;
				}
			}
		}
		return average / s.length();	
	}
	
	public static void main( String[] args )
	{
		System.out.printf( "%.2f\n",KeyPad.average("dog") );
		System.out.printf( "%.2f\n",KeyPad.average("apluscompsci") );
		System.out.printf( "%.2f\n",KeyPad.average("alligator") );
		System.out.printf( "%.2f\n",KeyPad.average("A") );
		System.out.printf( "%.2f\n",KeyPad.average("#fun") );
		System.out.printf( "%.2f\n",KeyPad.average("123") );
		System.out.printf( "%.2f\n",KeyPad.average("sambenwil") );
		System.out.printf( "%.2f\n",KeyPad.average("louisfleming") );
		System.out.printf( "%.2f\n",KeyPad.average("michaeljordanisthegoat!") );														
	}
}


/* EXPECTED OUTPUT
4.33
5.25
4.78
2.00
4.50
0.00
4.89
5.08
4.39
*/