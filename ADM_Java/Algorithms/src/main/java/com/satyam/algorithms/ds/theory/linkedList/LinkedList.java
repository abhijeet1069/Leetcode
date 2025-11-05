package com.satyam.algorithms.ds.theory.linkedList;

public class LinkedList {
	
	public static class Node{
		public String data;
		public Node next;
		
		public Node(String data) {
			this.data = data;
			this.next = null;
		}
	}
	
	private Node head;
	
	public Node getHead() {
		return head;
	}
	
	public Node insert(String value) {
		Node newNode = new Node(value);
		
		if(head == null) {
			head = newNode;
			return head;
		}
		
		Node curr = head;
		while(curr.next != null)
			curr = curr.next;
		curr.next = newNode;
		return head;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		Node temp = head;
		while(temp != null) {
			if(temp.next == null)
				sb.append(temp.data);
			else
				sb.append(temp.data).append("->");
			temp = temp.next;
		}
		return sb.toString();
	}

	public Node delete(String string) {
		if(head == null)
			return head;
		
		
	}
}
