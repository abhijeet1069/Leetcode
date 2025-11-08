package com.satyam.algorithms.ds.linkedList;

import com.satyam.algorithms.ds.linkedList.util.ListNode;

public class RotateList {
	public ListNode rotateRight(ListNode head, int k) {
		if (head == null || head.next == null || k == 0)
			return head;

		int len = length(head);
		k = k % len;

		k = k % len;
		if (k == 0)
			return head;

		// Move fast pointer k steps ahead
	    ListNode fast = head;
	    for (int i = 0; i < k; i++) {
	        fast = fast.next;
	    }

	    //Move slow until fast reaches end
	    ListNode slow = head;
	    while (fast.next != null) {
	        slow = slow.next;
	        fast = fast.next;
	    }
	    
	    // this logic is just amazing, I didn't know we could rotate a linked list like this
	    ListNode newHead = slow.next;  // new head
	    slow.next = null;              // break link
	    fast.next = head; 

		return newHead;
	}

	public static int length(ListNode head) {
		int length = 0;
		while (head != null) {
			head = head.next;
			length++;
		}
		return length;
	}
}
