package com.satyam.algorithms.intro.exercises;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

//Similar monotonic stack question

/**
You are given an integer array prices where prices[i] is the price of the ith item in a shop.

There is a special discount for items in the shop. If you buy the ith item, then you will receive a 
discount equivalent to prices[j] where j is the minimum index such that j > i and prices[j] <= prices[i]. 
Otherwise, you will not receive any discount at all.

Return an integer array answer where answer[i] is the final price you will pay for the ith item of the shop, 
considering the special discount.
 * 
 */
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
