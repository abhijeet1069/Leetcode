package com.satyam.algorithms.intro.exercises;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

/**
 * A  operation on a circular array shifts each of the array's elements  unit to the left.
 * The elements that fall off the left end reappear at the right end. Given an integer , 
 * rotate the array that many steps to the left and return the result.
 * 
 */

class LeftRotationTest {

	@Test
	void testRotateLeft1() {
		List<Integer> input = Arrays.asList(1,2,3,4,5);
		List<Integer> output = Arrays.asList(3,4,5,1,2);
		assertEquals(output, LeftRotation.rotateLeft(2, input));
	}
}
