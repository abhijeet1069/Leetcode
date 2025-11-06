package com.satyam.algorithms.analysis.exercises;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CountingBitsTest {

	@Test
	void testCountBits1() {
		int n = 5;
		int[] arr = new int[] {0,1,1,2,1,2};
		assertArrayEquals(arr,CountingBits.countBits(n));
	}
	
	@Test
	void testCountBits2() {
		int n = 2;
		int[] arr = new int[] {0,1,1};
		assertArrayEquals(arr,CountingBits.countBits(n));
	}
}
