//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.*;
import static java.lang.System.*;

public class WordRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner( new File( "word.dat" ) );
		ArrayList<Word> list = new ArrayList<Word>();
		
		int size = file.nextInt();
		
		for( int i = 0; i < size; i++ )
		{
			list.add(new Word(file.next()));
		}
		Collections.sort(list);
		for( int i = 0; i < size; i++ )
		{
			System.out.println(list.get(i));
		}
		file.close();


	}
}