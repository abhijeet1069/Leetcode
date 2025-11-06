package com.satyam.algorithms.analysis.theory;

/**
 * n = floor(n/2)+ceil(n/2)
 * Computes a^n
 * */

public class FastExponentiation {
	public static int power(int a, int n) {
		if(n == 0)
			return 1;
		int x = power(a,n/2);
		if(isEven(n))
			return x*x;
		else
			return a*x*x;
	}
	
	public static boolean isEven(int n)
    {
        if ((n & 1) == 0)
            return true;
        else
            return false;
    }
}
