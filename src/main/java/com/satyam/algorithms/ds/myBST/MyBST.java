package com.satyam.algorithms.ds.myBST;

public class MyBST<T> {
	
	public class Node<T>{
		T data;
		Node<T> parent;
		Node<T> left;
		Node<T> right;
		
		Node(T data){
			this.data = data;
			parent = left = right = null;
		}
	}

}
