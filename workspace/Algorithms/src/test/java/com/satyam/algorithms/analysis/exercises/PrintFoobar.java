package com.satyam.algorithms.analysis.exercises;

public class PrintFoobar {

	public static int print(int n) {
		int ctr = 1;
		for(int i = 1; i <= n; i++) {
			for(int j = i; j <=2*i; j++) {
				System.out.println(ctr+" "+"foobar");
				ctr++;
			}
		}
		return ctr;
	}
	
	public static void main(String[] args) {
		print(100);

	}

}
