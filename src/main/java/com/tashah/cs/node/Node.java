package com.tashah.cs.node;

public class Node<T extends Comparable<T>> implements INode<T> {

	private T value;
	
	protected Node<T> left;
	
	protected Node<T> right;
	
	public Node(T val) {
		this.value = val;
		this.left = null;
		this.right = null;
	}
	public T getValue() {
		return value;
	}


	public void setValue(T value) {
		this.value = value;
	}


	public Node<T> getLeft() {
		return left;
	}


	public void setLeft(Node<T> left) {
		this.left = left;
	}


	public Node<T> getRight() {
		return right;
	}


	public void setRight(Node<T> right) {
		this.right = right;
	}
}
	
