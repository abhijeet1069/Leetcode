package com.satyam.algorithms.ds.myBST;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyBSTTest {

	@Test
	void testMutipleAssignments() {
		int a,b,c;
		a = b = c = 20;
		assertEquals(20,a);
		assertEquals(20,b);
		assertEquals(20,c);
	}
	
	@Test
	void testNodeCreate() {
		MyBST bst = new MyBST();
		
	}

}
