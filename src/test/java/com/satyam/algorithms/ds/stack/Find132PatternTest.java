package com.satyam.algorithms.ds.stack;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Find132PatternTest {

	@Test
	void testFind132pattern1() {
		int[] nums = {1,2,3,4};
		assertFalse(new Find132Pattern().find132pattern(nums));
	}
	
	@Test
	void testFind132pattern2() {
		int[] nums = {3,1,4,2};
		assertTrue(new Find132Pattern().find132pattern(nums));
	}

	@Test
	void testFind132pattern3() {
		int[] nums = {-1,3,2,0};
		assertTrue(new Find132Pattern().find132pattern(nums));
	}
}
