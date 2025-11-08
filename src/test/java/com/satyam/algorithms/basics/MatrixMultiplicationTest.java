package com.satyam.algorithms.basics;

/**
 * Running time complexity = O(xyz), with Matrix(x,y,z)
 * */

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MatrixMultiplicationTest {

	@Test
	void testMultiply1() {
		int[][] a = new int[][] {{1,1},{1,1}};
		int[][] b = new int[][] {{2,2},{2,2}};
		int[][] res = new int[][] {{4,4},{4,4}};
		assertArrayEquals(res,MatrixMultiplication.multiply(a, b));
	}
	
	@Test
	void testMultiply2() {
		int[][] a = new int[][] {{1,1},{1,1}};
		int[][] b = new int[][] {{2,2},{2,2},{3,3}};
		int[][] res = null;
		assertArrayEquals(res,MatrixMultiplication.multiply(a, b));
	}

}
