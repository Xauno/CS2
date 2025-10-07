//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;
import java.io.*; 

public class WordSearch
{
    private char[][] m;

    public WordSearch( int size, String str )
    {
		m = new char[size][size];
		int count = 0;
		for (int row = 0; row < size; row++)
			for (int col = 0; col < size; col++)
			{
				m[row][col] = str.charAt(count);
				count++;
			}
    }

    public boolean isFound( String word )
    {
		for (int col = 0; col < m.length; col++)
			for (int row = 0; row < m.length; row++)
			{
				if (word.charAt(0) == m[row][col])
					if (checkUp(word, row, col) || checkDown(word, row, col) || checkLeft(word, row, col) || checkRight(word, row, col))
						return true;
					if (checkDiagUpRight(word, row, col) || checkDiagUpLeft(word, row, col) || checkDiagDownLeft(word, row, col) || checkDiagDownRight(word, row, col))
						return true;
			}
    	return false;
    }

	public boolean checkRight(String w, int r, int c)
   {
		if (w.length() == 0)
			return true;
		try
		{
			if (w.charAt(0) == m[r][c])
				return checkRight(w.substring(1), r, c + 1);
			return false;
		}
		catch(Exception e)
		{
			return false;
		}
	}

	public boolean checkLeft(String w, int r, int c)
	{
		if (w.length() == 0)
			return true;
		try
		{
			if (w.charAt(0) == m[r][c])
				return checkLeft(w.substring(1), r, c - 1);
			return false;
		}
		catch(Exception e)
		{
			return false;
		}
	}

	public boolean checkUp(String w, int r, int c)
	{
		if (w.length() == 0)
			return true;
		try
		{
			if (w.charAt(0) == m[r][c])
				return checkUp(w.substring(1), r + 1, c);
			return false;
		}
		catch(Exception e)
		{
			return false;
		}
	}

	public boolean checkDown(String w, int r, int c)
   {
	   if (w.length() == 0)
			return true;
		try
		{
			if (w.charAt(0) == m[r][c])
				return checkDown(w.substring(1), r - 1, c);
			return false;
		}
		catch(Exception e)
		{
			return false;
		}
	}

	public boolean checkDiagUpRight(String w, int r, int c)
	{
		if (w.length() == 0)
			return true;
		try
		{
			if (w.charAt(0) == m[r][c])
				return checkDiagUpRight(w.substring(1), r + 1, c + 1);
			return false;
		}
		catch(Exception e)
		{
			return false;
		}
	}

	public boolean checkDiagUpLeft(String w, int r, int c)
	{
		if (w.length() == 0)
			return true;
		try
		{
			if (w.charAt(0) == m[r][c])
				return checkDiagUpLeft(w.substring(1), r + 1, c - 1);
			return false;
		}
		catch(Exception e)
		{
			return false;
		}
	}

	public boolean checkDiagDownLeft(String w, int r, int c)
   {
		if (w.length() == 0)
			return true;
		try
		{
			if (w.charAt(0) == m[r][c])
				return checkDiagDownLeft(w.substring(1), r - 1, c - 1);
			return false;
		}
		catch(Exception e)
		{
			return false;
		}
	}

	public boolean checkDiagDownRight(String w, int r, int c)
	{
		if (w.length() == 0)
			return true;
		try
		{
			if (w.charAt(0) == m[r][c])
				return checkDiagDownRight(w.substring(1), r - 1, c + 1);
			return false;
		}
		catch(Exception e)
		{
			return false;
		}
	}

    public String toString()
    {
		StringBuffer returnString = new StringBuffer();
		for (int row = 0; row < m.length; row++)
		{
			returnString.append("\n");
			for (int col = 0; col < m[0].length; col++)
				returnString.append(m[row][col] + " ");
		}
 		return returnString.toString();
    }
}
