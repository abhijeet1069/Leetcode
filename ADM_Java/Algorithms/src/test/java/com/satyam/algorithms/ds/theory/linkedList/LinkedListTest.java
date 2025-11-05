package com.satyam.algorithms.ds.theory.linkedList;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LinkedListTest {

	@Test
	void testGetHead() {
		LinkedList list = new LinkedList();
		list.insert("Fe");
		list.insert("Fi");
		list.insert("Fo");
		list.insert("Fum");
		assertEquals("Fe",list.getHead().data);
	}

	@Test
	void testInsert() {
		LinkedList list = new LinkedList();
		list.insert("Fe");
		list.insert("Fi");
		list.insert("Fo");
		list.insert("Fum");
		assertEquals("Fe->Fi->Fo->Fum",list.toString());
	}

	@Test
	void testDelete() {
		LinkedList list = new LinkedList();
		list.insert("Fe");
		list.insert("Fi");
		list.insert("Fo");
		list.insert("Fum");
		
		list.delete("Fi");
		assertEquals("Fe->Fo->Fum",list.toString());
	}

}
