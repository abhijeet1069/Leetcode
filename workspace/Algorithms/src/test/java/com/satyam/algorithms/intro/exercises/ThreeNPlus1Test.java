package com.satyam.algorithms.intro.exercises;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

class ThreeNPlus1Test {

	@Test
	void test() {
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
		
		ThreeNPlus1 collatz = new ThreeNPlus1();
		for(int n : map.keySet()) {
			int cycleLength = collatz.getCycleLength(n);
			assertEquals(map.get(n), cycleLength);
		}
		
		
		fail("Not yet implemented");
	}

}
