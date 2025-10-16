package com.satyam.algorithms.intro.exercises;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

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
