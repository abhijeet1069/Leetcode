package com.satyam.algorithms.analysis.exercises;

public class Pangrams {
	public static String pangrams(String s) {
	    s = s.toLowerCase();
	    int n = s.length();
	    int[] arr = new int[26];
	    for(int i = 0; i < n; i++) {
	    	if(Character.isAlphabetic(s.charAt(i))) {
	    		arr[s.charAt(i)-'a']++;
	    	}
	    }
	    
	    for(int i = 0; i < 26; i++) {
	    	if(arr[i] == 0)
	    		return "not pangram";
	    }
	    return "pangram";
	}
}
