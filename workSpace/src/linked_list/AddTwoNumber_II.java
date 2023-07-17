package linked_list;

import java.util.Stack;

public class AddTwoNumber_II {

	class ListNode {

		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	public void insert(ListNode head, int val) {
		ListNode listNode = new ListNode(val);

		while (head.next != null) {
			head = head.next;
		}
		head.next = listNode;
	}

	public void printList(ListNode listNode) {
		System.out.print("LinkedList : ");
		while (listNode != null) {
			System.out.print(listNode.val + " ");
			listNode = listNode.next;
		}
		System.out.println();
	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode head;
		Stack<Integer> list1 = new Stack<Integer>();
		Stack<Integer> list2 = new Stack<Integer>();
		Stack<Integer> list3 = new Stack<Integer>();

		while (l1 != null) {
			list1.add(l1.val);
			l1 = l1.next;
		}

		while (l2 != null) {
			list2.add(l2.val);
			l2 = l2.next;
		}

		int carry = 0;
		int maxPosition = Math.max(list1.size(), list2.size());

		for (int i = 0; i < maxPosition; i++) {
			int numOne = !list1.isEmpty() ? list1.pop() : 0;
			int numTwo = !list2.isEmpty() ? list2.pop() : 0;
			int sum = (numOne + numTwo + carry) % 10;
			carry = (numOne + numTwo + carry) / 10;
			list3.add(sum);
		}
		if(carry > 0) {
			list3.add(carry);
		}

		head = new ListNode(list3.pop());
		while (!list3.isEmpty()) {
			insert(head, list3.pop());
		}
		return head;
	}

	public static void main(String args[]) {
		AddTwoNumber_II addNumber = new AddTwoNumber_II();

		AddTwoNumber_II.ListNode list1 = addNumber.new ListNode(5);

		AddTwoNumber_II.ListNode list2 = addNumber.new ListNode(5);

		AddTwoNumber_II.ListNode result = addNumber.addTwoNumbers(list1, list2);
		addNumber.printList(result);
	}


}
