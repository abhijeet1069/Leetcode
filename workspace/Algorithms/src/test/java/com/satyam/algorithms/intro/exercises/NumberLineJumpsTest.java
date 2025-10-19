package com.satyam.algorithms.intro.exercises;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NumberLineJumpsTest {

	@Test
	void testKangaroo1() {
		int x1 = 0;
		int v1 = 3;
		int x2 = 4;
		int v2 = 2;
		assertEquals("YES",NumberLineJumps.kangaroo(x1, v1, x2, v2));
	}
	
	@Test
	void testKangaroo2() {
		int x1 = 0;
		int v1 = 2;
		int x2 = 5;
		int v2 = 3;
		assertEquals("NO",NumberLineJumps.kangaroo(x1, v1, x2, v2));
	}

}
