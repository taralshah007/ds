package com.tashah.cs.stack;


public interface IStack<T extends Comparable<T>> {
	
	void push(T node);
	
	T pop();
	
	T peek();
	
	boolean isEmpty();
	
	boolean isFull();
	
	void print();
}
