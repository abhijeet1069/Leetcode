package com.satyam.algorithms.intro.exercises;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class LeftRotationTest {

	@Test
	void testRotateLeft1() {
		List<Integer> input = Arrays.asList(1,2,3,4,5);
		List<Integer> output = Arrays.asList(3,4,5,1,2);
		assertEquals(output, LeftRotation.rotateLeft(2, input));
	}
}
