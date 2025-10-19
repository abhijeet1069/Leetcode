package com.satyam.algoexperiments;

public class LinkedList {
	Node head;
	
	public void add(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		Node curr = head;
		while(curr.next != null)
			curr = curr.next;
		curr.next = newNode;
	}
	
	public String toString() {
		StringBuilder res = new StringBuilder();
		Node curr = head;
		while(curr != null) {
			res.append(curr.data).append("->");
			curr = curr.next;
		}
		res.append("null");
		return res.toString();
	}
}
