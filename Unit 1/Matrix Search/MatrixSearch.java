//(c) A+ Computer Science
//www.apluscompsci.com
//Name - 

import java.util.*;
import java.io.*; 

public class MatrixSearch
{
    private int[][] mat;
	private int upper;

		/*
		 *pre - mat is null
		 *post - mat will be rows X cols
		 *post - mat will contain integers that are <= upper and >= 1
		 */
    public MatrixSearch( int rows, int cols, int up )
    {
		mat = new int[rows][cols];
		upper = up;

		for (int row = 0; row < rows; row++)
		{
			for (int col = 0; col < cols; col++)
				mat[row][col] = (int)(Math.random() * upper);
		}
    }


		/*
		 *pre - mat is not null
		 *post - count of odd numbers will be returned
		 *post - no values in mat will have been changed
		 */
    public int countOdds( )
    {
		int count = 0;
		for (int row = 0; row < mat.length; row++)
		{
			for (int col = 0; col < mat[row].length; col++)
				if (mat[row][col] % 2 == 1)
					count++;
		}
		return count;
    }


		/*
		 *pre - mat is not null
		 *post - count of even numbers will be returned
		 *post - no values in mat will have been changed
		 */
    public int countEvens( )
    {
		int count = 0;
		for (int row = 0; row < mat.length; row++)
		{
			for (int col = 0; col < mat[row].length; col++)
				if (mat[row][col] % 2 == 0)
					count++;
		}
		return count;
    }


		/*
		 *pre - mat is not null
		 *post - count of prime numbers will be returned
		 *post - no values in mat will have been changed
		 */
    public int countPrimes( )
    {
		boolean[] isPrime = new boolean[upper + 1];
		ArrayList<Integer> primes = new ArrayList<>();
        Arrays.fill(isPrime, true);

        isPrime[0] = false;
        isPrime[1] = false;

        for (int p = 2; p * p <= upper; p++) 
		{
            if (isPrime[p]) 
			{
				primes.add(p);
                for (int i = p * p; i <= upper; i += p) 
				{
                    isPrime[i] = false;
                }
			}
		}
		
		for (int p = primes.get(primes.size()-1) + 1; p < isPrime.length; p++)
			if (isPrime[p])
				primes.add(p);
		
		int count = 0;
		for (int row = 0; row < mat.length; row++)
		{
			for (int col = 0; col < mat[row].length; col++)
				if (isPrime(primes, mat[row][col]))
					count++;
		}
		
		return count;
    }

		/*
		 *pre - num has a value
		 *post - false is returned if num is divisble by any number between 2 and itself
		 *post - true is returned if num is not divisble by any number between 2 and itself
		 */
    private boolean isPrime( ArrayList<Integer> primeList, int num )
    {
    	return (Collections.binarySearch(primeList, num) > -1);
    }

		/*
		 *pre - mat is not null
		 *post - all values from mat are concatenated to a string and returned
		 */
    public String toString()
    {
 		return "";
    }
}
