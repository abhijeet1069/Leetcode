package com.satyam.algorithms.intro;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class InsertionSort {
	
	private static final Logger logger = LoggerFactory.getLogger(InsertionSort.class);
	
	public int[] sort(int[] arr) {
		int[] res = arr.clone();
		for(int i = 1; i < arr.length; i++) {
			int j = i;
			while((j>0) && (res[j] < res[j-1])) {
				int temp = res[j];
				res[j] = res[j-1];
				res[j-1] = temp;
				j--;
			}
		}
		logger.atDebug().log("Unsorted array = {} Sorted array = {}",
				Arrays.toString(arr),Arrays.toString(res));
		return res;
	}
	
}
