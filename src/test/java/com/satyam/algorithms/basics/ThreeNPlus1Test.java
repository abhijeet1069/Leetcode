package com.satyam.algorithms.basics;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

/**
 * 
Consider the following algorithm:
1. input n
2. print n
3. if n = 1 then STOP
4. if n is odd then n ← 3n + 1
5. else n ← n/2
6. GOTO 2

Given the input 22, the following sequence of numbers will be printed
22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1

 Given an input n, it is possible to determine the number of numbers printed before and including
the 1 is printed. For a given n this is called the cycle-length of n. In the example above, the cycle
length of 22 is 16.

For any two numbers i and j you are to determine the maximum cycle length over all numbers
between and including both i and j.
 * 
 */

class ThreeNPlus1Test {

	@Test
	void testGetCycleLength() {
		Map<Integer,Integer> map = new HashMap<>();
		map.put(1,1);
		map.put(2,2);
		map.put(3,8);
		map.put(4,3);
		map.put(5,6);
		map.put(6,9);
		map.put(7,17);
		map.put(8,4);
		map.put(9,20);
		map.put(10,7);
		map.put(22,16);
		
		for(int n : map.keySet()) {
			int cycleLength = ThreeNPlus1.getCycleLength(n);
			assertEquals(map.get(n), cycleLength);
		}
	}
	
	@Test
	void testMaxCycleLength() {
		assertEquals(20, ThreeNPlus1.getMaxCycleLengthInRange(1,10));
		assertEquals(125, ThreeNPlus1.getMaxCycleLengthInRange(100,200));
		assertEquals(89, ThreeNPlus1.getMaxCycleLengthInRange(201,210));
		assertEquals(174, ThreeNPlus1.getMaxCycleLengthInRange(900,1000));
	}

}
