//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -

import java.util.ArrayList;
import static java.lang.System.*;

public class LongPalindromeRunner
{
	public static void main(String args[])
	{
		System.out.println(LongPalindrome.getAllPalins("bobcat"));
		System.out.println(LongPalindrome.getAllPalins("bobracecarcat"));
		System.out.println(LongPalindrome.getAllPalins("alligatorslikegroovycatslikemadamandrooroo"));
		System.out.println(LongPalindrome.getAllPalins("idrovetothelibraryinmyracecartolearnaboutpanama"));
		System.out.println(LongPalindrome.getLongestPalin("idrovetothelibraryinmyracecartolearnaboutpanama"));
	}
}