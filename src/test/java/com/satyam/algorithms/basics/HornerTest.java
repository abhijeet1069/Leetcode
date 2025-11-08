package com.satyam.algorithms.basics;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HornerTest {

	@Test
	void testPolyVal1() {
		// x^4 + 2x^3 -x^2 + 11x + 1
		int[] coeff = new int[] {1,2,-1,11,1};
		assertEquals(51,Horner.polyVal(coeff, 2));
	}
	
	@Test
	void testPolyVal2() {
		// x^3 - 1
		int[] coeff = new int[] {1,0,0,-1};
		assertEquals(7,Horner.polyVal(coeff, 2));
	}

}
