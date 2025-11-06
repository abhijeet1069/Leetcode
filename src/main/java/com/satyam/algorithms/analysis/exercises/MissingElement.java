package com.satyam.algorithms.analysis.exercises;


public class MissingElement {
	
	public static int getMissingElement(int[] arr) {
		int n = arr.length; 
		int xor = 0;
		
		for(int i = 1; i <= n+1; i++)
			xor ^= i;
		
		for(int num : arr) //xor out the duplicate elements
			xor ^= num;
		
		return xor;
	}

}
