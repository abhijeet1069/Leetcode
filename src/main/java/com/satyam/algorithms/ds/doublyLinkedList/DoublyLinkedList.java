package com.satyam.algorithms.ds.doublyLinkedList;

public class DoublyLinkedList<T extends Comparable<T>> {

	public static class Node<T> {
		private Node<T> prev;
		private T data;
		private Node<T> next;

		Node(T data) {
			this.data = data;
			prev = next = null;
		}

		public T getData() {
			return data;
		}

		public Node<T> getPrev() {
			return prev;
		}

		public Node<T> getNext() {
			return next;
		}
	}

	private Node<T> head;
	private Node<T> tail; // keep tail to make append O(1)
	private int size = 0;

	public Node<T> getHead() {
		return head;
	}

	public Node<T> getTail() {
		return tail;
	}

	public int size() {
		return size;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Node<T> ptr = head; ptr != null; ptr = ptr.next) {
			sb.append(String.valueOf(ptr.data));
			if (ptr.next != null)
				sb.append("->");
		}
		return sb.toString();
	}

	// append (O(1) now) with tail approach
	public void insert(T data) {
		Node<T> newNode = new Node<>(data);
		if (head == null) {
			head = tail = newNode;
		} else {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
		}
		size++;
	}

	public Node<T> search(T data) {
		if(data == null)
			return null;
		
		Node<T> ptr = head;

		while (ptr != null) {
			if (data.compareTo(ptr.data) == 0)
				return ptr;
			ptr = ptr.next;
		}

		return null;
	}

	public Node<T> previous(T data) {
		Node<T> current = search(data);
		if (current == null)
			return null;
		return current.prev;
	}
	
	//implement delete
}
