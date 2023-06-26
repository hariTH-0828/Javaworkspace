package workSpace;

import java.util.Scanner;
import java.util.Stack;

public class MinVal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int testCase=sc.nextInt();
		MinVal min=new MinVal();
		while(testCase-->0) {
			int input = sc.nextInt();
			if(input==1) {
				int data=sc.nextInt();
				min.Push(data);
			}else if(input==2){
				System.out.print(min.Pop() + " ");
				
			}else if(input==3) {
				System.out.print(min.getMin() + " ");
			}
		}
		sc.close();
	}
	Stack<Integer> stack1 = new Stack<>();
	Stack<Integer> stack2 = new Stack<>();

	void Push(int data) {
		if (stack2.isEmpty() || stack2.peek() >= data) {
			stack2.push(data);
		}
		stack1.push(data);
	}
	int getMin() {
		if (stack2.isEmpty()) {
			return -1;
		}
		return stack2.peek();
	}

	int Pop() {
		if (stack1.isEmpty()) {
			return -1;
		}
		if (!stack2.isEmpty() && stack1.peek() == stack2.peek())
			stack2.pop();
		return stack1.pop();
	}
}
