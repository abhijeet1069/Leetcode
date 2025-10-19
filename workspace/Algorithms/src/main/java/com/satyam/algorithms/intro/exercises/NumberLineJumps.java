package com.satyam.algorithms.intro.exercises;

public class NumberLineJumps {
	public static String kangaroo(int x1, int v1, int x2, int v2) {
		int x = x1 - x2;
		int v = v2 - v1;
		if(x/v > 0 && x%v == 0)
			return "YES";
		else
			return "NO";
	}
}
