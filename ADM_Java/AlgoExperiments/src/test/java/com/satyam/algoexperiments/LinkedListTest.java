package com.satyam.algoexperiments;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class LinkedListTest {

	@Test
	void testAdd1() {
		LinkedList list = new LinkedList();
		list.add(12);
		list.add(15);
		list.add(17);
		list.add(20);
		assertEquals("12->15->17->20->null",list.toString());
	}
}
