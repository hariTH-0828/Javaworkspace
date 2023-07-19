package linked_list;

import linked_list.LinkedList_leetcode.ListNode;

public class ReorderList {

	public ListNode reorderList(ListNode head) {

		// Find the mid point in the head
		ListNode slowPtr = head;
		ListNode fastPtr = head;
		while (fastPtr != null && fastPtr.next != null && fastPtr.next.next != null) {
			fastPtr = fastPtr.next.next;
			slowPtr = slowPtr.next;
		}

		ListNode nextCopy = slowPtr.next;
		slowPtr.next = null;

		// Reverse list from the mid to end
		ListNode currNode = nextCopy;
		ListNode prev = null;
		ListNode next = null;
		while (currNode != null) {
			next = currNode.next;
			currNode.next = prev;
			prev = currNode;
			currNode = next;
		}
		nextCopy = prev;

		// Reorder List Non-Reverse List -> head, Reverse List -> nextCopy
		ListNode dummy = new ListNode();
		ListNode tail = dummy;
		currNode = head;
		ListNode currNodeT = nextCopy;
		while (currNode != null && nextCopy != null) {
			head = head.next;
			nextCopy = nextCopy.next;

			currNode.next = null;
			currNodeT.next = null;

			tail.next = currNode;
			tail.next.next = currNodeT;

			currNode = head;
			currNodeT = nextCopy;
			tail = tail.next.next;
		}

		if (head != null) {
			tail.next = head;
		}

		if (nextCopy != null) {
			tail.next = nextCopy;
		}

		return dummy.next;
	}

	public static void main(String args[]) {
		ReorderList reorder = new ReorderList();
		LinkedList_leetcode list = new LinkedList_leetcode();

		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(4);
		list.insert(5);
		list.insert(6);
		list.insert(7);

		list.printList(reorder.reorderList(list.head()));

	}

}
