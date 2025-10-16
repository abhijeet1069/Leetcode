package com.satyam.algorithms.intro.util;

// leetcode flavored linked list 

public class ListNode {
	public int val;
	public ListNode next;
	
	public ListNode(){}
	
	public ListNode(int val) {this.val = val;}
	
	/**
	 *  ListNode head = new ListNode(3); <br>
	    head = new ListNode(2, head); <br>
		head = new ListNode(1, head); <br>
		System.out.println(head); // prints 1->2->3
	 * */
	
	public ListNode(int val, ListNode next) { this.val = val; this.next = next;}
	
	public String toString() {
        StringBuilder sb = new StringBuilder();
        ListNode current = this; // start from this node
        while (current != null) {
            sb.append(current.val);
            if (current.next != null) {
                sb.append("->");
            }
            current = current.next;
        }
        return sb.toString();
    }
	
}
