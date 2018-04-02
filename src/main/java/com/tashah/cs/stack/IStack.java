package com.tashah.cs.stack;

import com.tashah.cs.node.Node;

public interface IStack<T extends Comparable<T>> {
	
	void push(T node);
	
	T pop();
	
	T peek();
	
	boolean isEmpty();
	
	boolean isFull();
	
	void print();
}
