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
    void testReverseToString() {
        DoublyLinkedList<String> list = new DoublyLinkedList<>();
        list.insert("Fe");
        list.insert("Fi");
        list.insert("Fo");
        list.insert("Fum");

        assertEquals("Fum->Fo->Fi->Fe",list.reverseToString());
    }

    @Test
    void testSize() {
        DoublyLinkedList<String> list = new DoublyLinkedList<>();
        list.insert("Fe");
        list.insert("Fi");
        list.insert("Fo");
        list.insert("Fum");

        assertEquals(4,list.size());
    }

    @Test
    void testDeleteFirst() {
        DoublyLinkedList<String> list = new DoublyLinkedList<>();
        list.insert("Fe");
        list.insert("Fi");
        list.insert("Fo");
        list.insert("Fum");

        list.delete("Fe");
        list.delete("Sum");

        assertEquals("Fi->Fo->Fum",list.toString());

        assertEquals(3,list.size());
    }

    @Test
    void testDeleteLast() {
        DoublyLinkedList<String> list = new DoublyLinkedList<>();
        list.insert("Fe");
        list.insert("Fi");
        list.insert("Fo");
        list.insert("Fum");

        list.delete("Fum");
        list.delete("Sum");

        assertEquals("Fe->Fi->Fo",list.toString());

        assertEquals(3,list.size());
    }

    @Test
    void testDeleteNiddle() {
        DoublyLinkedList<String> list = new DoublyLinkedList<>();
        list.insert("Fe");
        list.insert("Fi");
        list.insert("Fo");
        list.insert("Fum");

        list.delete("Fi");
        list.delete("Sum");

        assertEquals("Fe->Fo->Fum",list.toString());

        assertEquals(3,list.size());
    }
}
