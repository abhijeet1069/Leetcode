package com.satyam.algorithms.intro.exercises;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.satyam.algorithms.intro.util.ListNode;

class RotateListTest {

	@Test
	void testRotateRight() {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
	
		ListNode result = new ListNode(4);
		result.next = new ListNode(5);
		result.next.next = new ListNode(1);
		result.next.next.next = new ListNode(2);
		result.next.next.next.next = new ListNode(3);
		
		RotateList obj = new RotateList();
		assertEquals(result.toString(), obj.rotateRight(head, 2).toString());
		
	}

}
