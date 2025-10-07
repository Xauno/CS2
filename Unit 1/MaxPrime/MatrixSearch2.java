//(c) A+ Computer Science
//www.apluscompsci.com
//Name - 

import java.util.*;
import java.io.*; 

public class MatrixSearch2
{
    private int[][] mat;
	private ArrayList<Integer> primes;

    public MatrixSearch2( int rows, int cols, int upper )
    {
		mat = new int[rows][cols];
		primes = new ArrayList<>();
		primes = findPrimes(upper);

		for (int row = 0; row < mat.length; row++)
		{
			for (int col = 0; col < mat[row].length; col++)
			{
				mat[row][col] = (int)(Math.random() * upper + 1);
			}
		}
    }

	/*
	 *findMaxPrime() will return the prime that has the largest surrounding sum
	 */
    public int findMaxPrime( )
    {
		//System.out.println("looking for maxprime");
		int maxPrime = 0;
		int surroundingSum = 0;
		for (int row = 0; row < mat.length; row++)
		{
			for (int col = 0; col < mat[row].length; col++)
			{
				//System.out.println("next number");
				if (isPrime(mat[row][col]))
				//System.out.println(mat[row][col] + "isPrime");
				{
					int tempSum = getCountRndCell(row, col);
					//System.out.println("this is tempsum: " + tempSum);
					if (tempSum > surroundingSum)
					{
						surroundingSum = tempSum;
						maxPrime = mat[row][col];
					}
				}
			}
		}
		return maxPrime;
    }

	public int getCountRndCell( int r, int c)
	{
		int total = 0;
		for (int row = r-1; row <= r+1; row++)
			for (int col = c - 1; col <= c+1; col++)
			if (inBounds(row, col))
				if (row != r && col != c)
					total += mat[row][col];
		return total;
	}

	public boolean isPrime(int num)
	{
		if (Collections.binarySearch(primes, num) > -1)
			return true;
		return false;
	}

	private boolean inBounds( int r, int c)
	{
		if ( r >= 0 && r < mat.length && c >= 0 && c < mat[0].length)
			return true;
		return false;
	}

    private ArrayList<Integer> findPrimes( int num )
    {
		boolean[] isPrime = new boolean[num + 1];
		ArrayList<Integer> primes = new ArrayList<>();
        Arrays.fill(isPrime, true);

        isPrime[0] = false;
        isPrime[1] = false;

        for (int p = 2; p * p <= num; p++) 
		{
            if (isPrime[p]) 
			{
				primes.add(p);
                for (int i = p * p; i <= num; i += p) 
				{
                    isPrime[i] = false;
                }
			}
		}
		
		for (int p = primes.get(primes.size()-1) + 1; p < isPrime.length; p++)
			if (isPrime[p])
				primes.add(p);
		return primes;
    }

    public String toString()
    {
		StringBuffer out = new StringBuffer();

		for (int row = 0; row < mat.length; row++)
		{
			out.append("\n");
			for (int col = 0; col < mat[row].length; col++)
				out.append(mat[row][col] + " ");
		}

		//out.append("\n" + primes);
 		
		out.append("\nThe max prime is " + findMaxPrime());

		return out.toString();
 		
    }
}
