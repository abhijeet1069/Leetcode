package com.satyam.algorithms.analysis.theory.recursion;

/**
 * The recursion call happens before other computations in the function.
 * So you defer operations until the recursion unwinds.
 * */

public class HeadRecursion {

	public static void printDescending(int n) {
		if(n == 0)
			return;
		printDescending(n-1);
		System.out.println(n);
	}
	
	public static void main(String[] args) {
		printDescending(5);
	}
}
