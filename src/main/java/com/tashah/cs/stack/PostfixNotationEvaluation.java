package com.tashah.cs.stack;

public class PostfixNotationEvaluation {
	
	public static int evalRPN(String[] tokens) {
		IStack<Integer> stack = new Stack<Integer>();  
		Integer right, left;
		for(String x : tokens) {
			switch(x) {
			case "+":
				right = stack.pop();
				left = stack.pop();
				stack.push(left + right);
				break;
			case "-":
				right = stack.pop();
				left = stack.pop();
				stack.push(left - right);
				break;
			case "*":
				right = stack.pop();
				left = stack.pop();
				stack.push (left * right);
				break;
			case "/":
				right = stack.pop();
				left = stack.pop();
				stack.push (left / right);
				break;
			default:
				stack.push(Integer.parseInt(x));
				
			}
		}
		return stack.pop();
	}

	public static void main(String[] args) {
		System.out.println(evalRPN(new String [] {"4", "13", "5", "/", "+"}));
	}
}
