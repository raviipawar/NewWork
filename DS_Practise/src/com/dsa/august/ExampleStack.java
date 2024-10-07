package com.dsa.august;

import java.util.Stack;

public class ExampleStack {

	public static void main(String[] args) {
		//perform stack ops
		Stack<Integer> stack = new Stack<>();
		stack.add(1);
		stack.add(2);
		stack.add(3);
		stack.add(4);

		 stackpush(stack);
		 stackpop(stack);
		for (Integer integer : stack) {
			System.out.println("Hello "+integer);
		}
	}

	private static void stackpush(Stack<Integer> stack) {
		//stack.add(10);
		
	}

	private static void stackpop(Stack<Integer> stack) {
		// TODO Auto-generated method stub
		stack.pop();
	}
}
