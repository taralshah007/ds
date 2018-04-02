package com.tashah.cs.stack;


public class PlayWithStack {

	public static void main(String[] args) {
		IStack<Integer> stack = new Stack<Integer>();
		stack.push(new Integer(5));
		stack.push(new Integer(32));
		stack.push(new Integer(22));
		stack.push(new Integer(77));
		stack.push(new Integer(52));
		stack.push(new Integer(321));
		stack.push(new Integer(3132));
		stack.push(new Integer(1));
		stack.push(new Integer(0));
		stack.print();
		stack.pop();
		stack.pop();stack.pop();
		stack.print();
		
	}

}
