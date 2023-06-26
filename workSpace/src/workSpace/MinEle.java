package workSpace;

import java.util.Stack;

public class MinEle {
	int minEle;
	Stack<Integer> s = new Stack<Integer>();

	int getMin(Stack<Integer> s) {
		minEle = s.elementAt(0);
		for (int i = 0; i < s.size(); i++) {
			if (minEle > s.elementAt(i))
				minEle = s.elementAt(i);
		}
		return minEle;
	}
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
		MinEle e = new MinEle();
		s.add(9);
		s.add(5);
		s.pop();
		s.add(10);
		s.add(1);
		s.add(0);
		s.add(8);
		s.pop();
		s.add(7);
		s.isEmpty();
		s.empty();
		System.out.println(s);
		System.out.println(e.getMin(s));
	}
}
