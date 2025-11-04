package com.satyam.algorithms.intro.exercises;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
You are choreographing a circus show with various animals. For one act, 
you are given two kangaroos on a number line ready to jump in the positive 
direction (i.e, toward positive infinity).

The first kangaroo starts at location  and moves at a rate of  meters per jump.
The second kangaroo starts at location  and moves at a rate of  meters per jump.
You have to figure out a way to get both kangaroos at the same location at the same 
time as part of the show. If it is possible, return YES, otherwise return NO.

x1 = 2, v1 = 1
x2 = 1, v2 = 2
After 1 jump, they are both at x = 3, (x1+v1 = 2+1, x2+v2 = 1+2), so asnwer is YES
*/

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
