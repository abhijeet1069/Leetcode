package com.satyam.algorithms.intro.exercises;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FinalPricesTest {

	@Test
	void testFinalPrices1() {
		int[] prices = new int[] {8,4,6,2,3};
		int[] result = new int[] {4,2,4,2,3};
		FinalPrices fp = new FinalPrices();
		assertArrayEquals(result,fp.finalPrices(prices));
	}
	
	@Test
	void testFinalPrices2() {
		int[] prices = new int[] {10,1,1,6};
		int[] result = new int[] {9,0,1,6};
		FinalPrices fp = new FinalPrices();
		assertArrayEquals(result,fp.finalPrices(prices));
	}

}
