package competetion;

import java.util.Stack;

public class StackProblem {

	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<Integer>();
		stack.push(15);
		stack.push(10);
		for (int i = 0; i < 10; i++) {
			stack.push(i);
		}
		System.out.println(stack);
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.capacity());
		System.out.println(stack.indexOf(5));
		System.out.println(stack.remove(5));
		System.out.println(stack);
	}

}
