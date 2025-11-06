package com.satyam.algorithms.analysis.exercises;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PangramsTest {

	@Test
	void testPangrams1() {
		String s = "The quick brown fox jumps over the lazy dog";
		assertEquals("pangram",Pangrams.pangrams(s));
	}
	
	@Test
	void testPangrams2() {
		String s = "Fe Fi Fo Fum";
		assertEquals("not pangram",Pangrams.pangrams(s));
	}

}
