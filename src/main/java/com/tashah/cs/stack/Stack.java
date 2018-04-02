package com.tashah.cs.stack;

import java.lang.reflect.Array;

import com.tashah.cs.node.Node;

public class Stack<T extends Comparable<T>> implements IStack<T> {

	private static int MAX_LENGTH = 100;
	
	private Object[] arr;
	
	private int pointer = 0;
	
	@SuppressWarnings("unchecked")
	public Stack() {
		arr = new Object[MAX_LENGTH];
	}
	
	/**
	 * Push the node on top of the stack
	 */
	public void push(T node) {
		if(node != null) {
			if(!isFull()) {
				arr[pointer++] = (T) node;
			} else {
				throw new RuntimeException("Stack is full!");
			}
		}
	}
	
	
	public T pop() {
		if(!isEmpty()) {
			T node = (T)(arr[pointer]);
			pointer--;
			return node;
		} else {
			throw new RuntimeException("Stack is empty!");
		}
	}

	/**
	 * Returns the object on top of stack. It doesn't remove object at all.
	 */
	public T peek() {
		return (T)(arr[pointer]);
	}
	
	/**
	 * Returns true if array is empty.
	 */
	public boolean isEmpty() {
		return pointer == 0;
	}

	/**
	 * Returns true if array is full.
	 */
	public boolean isFull() {
		return pointer == MAX_LENGTH - 1;
	}
	
	public void print() {
		for(int i=0;i<pointer;i++) {
			System.out.println(arr[i]);
		}
	}

}