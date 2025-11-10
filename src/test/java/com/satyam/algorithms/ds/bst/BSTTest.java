package com.satyam.algorithms.ds.bst;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BSTTest {

	@Test
	void testSum() {
		int[] arr = new int[] { 10, 13, 12, 3, 2, 12, 4 };
		BST<Integer> bst = new BST<>();
		for (int x : arr)
			bst.insert(x);
		
		assertEquals(56,bst.sum());
	}

}
