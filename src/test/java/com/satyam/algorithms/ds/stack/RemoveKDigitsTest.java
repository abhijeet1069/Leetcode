package com.satyam.algorithms.ds.stack;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RemoveKDigitsTest {

	@Test
	void testRemoveKdigits1() {
		String num = "1432219";
		int k = 3;
		assertEquals("1219", new RemoveKDigits().removeKdigits(num, k));
	}
	
	@Test
	void testRemoveKdigits2() {
		String num = "10200";
		int k = 1;
		assertEquals("200", new RemoveKDigits().removeKdigits(num, k));
	}
	
	@Test
	void testRemoveKdigits3() {
		String num = "10";
		int k = 2;
		assertEquals("0", new RemoveKDigits().removeKdigits(num, k));
	}
	
	@Test
	void testRemoveKdigits4() {
		String num = "9";
		int k = 1;
		assertEquals("0", new RemoveKDigits().removeKdigits(num, k));
	}
	
	@Test
	void testRemoveKdigits5() {
		String num = "112";
		int k = 1;
		assertEquals("11", new RemoveKDigits().removeKdigits(num, k));
	}

}
