package com.satyam.algorithms.ds.linkedList;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.satyam.algorithms.ds.linkedList.util.ListNode;

/**
Given the head of a linked list, rotate the list to the right by k places.
Input: head = [1,2,3,4,5], k = 2
Output: [4,5,1,2,3]

The rotating logic was insane. You don't have to rotate the list, only reconnect
links at proper places and its done.
 */

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
