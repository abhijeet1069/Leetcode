package com.satyam.algorithms.ds.doublyLinkedList;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DoublyLinkedListTest {

	@Test
	void testToString() {
		DoublyLinkedList<String> list = new DoublyLinkedList<>();
		list.insert("Fe");
		list.insert("Fi");
		list.insert("Fo");
		list.insert("Fum");
		
		assertEquals("Fe->Fi->Fo->Fum",list.toString());
	}
	
	@Test
	void testSearch() {
		DoublyLinkedList<String> list = new DoublyLinkedList<>();
		list.insert("Fe");
		list.insert("Fi");
		list.insert("Fo");
		list.insert("Fum");
		
		assertNotNull(list.search("Fo"));
		assertNull(list.search("smell"));
		
		assertEquals("Fum",list.search("Fum").getData());
	}
	
	@Test
	void testPrevious() {
		DoublyLinkedList<String> list = new DoublyLinkedList<>();
		list.insert("Fe");
		list.insert("Fi");
		list.insert("Fo");
		list.insert("Fum");
		
		assertEquals("Fo",list.previous("Fum").getData());
		assertNull(list.previous("Fe"));
		assertNull(list.previous("smell"));
	}

}
