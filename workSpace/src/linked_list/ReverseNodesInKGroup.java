package linked_list;

import linked_list.LinkedList_leetcode.ListNode;

public class ReverseNodesInKGroup {

	public ListNode reverseKGroup(ListNode head, int k) {
		ListNode dummy = new ListNode(0, head);
		ListNode tail = dummy;

		while (true) {
			ListNode kth = kthNode(tail, k);

			if (kth == null) {
				return dummy.next;
			}

			ListNode next = kth.next;
			ListNode temp = reverseList(tail.next, next);

			ListNode prev = tail.next;
			tail.next = temp;
			prev.next = next;
			tail = prev;
		}
	}

	public ListNode kthNode(ListNode head, int k) {
		while (head != null && k > 0) {
			head = head.next;
			k--;
		}
		return head;
	}

	public ListNode reverseList(ListNode head, ListNode breakerNode) {
		ListNode next;
		ListNode prev = null;
		while (head != breakerNode) {
			next = head.next;
			head.next = prev;
			prev = head;
			head = next;
		}
		return prev;
	}

	public static void main(String[] args) {
		LinkedList_leetcode linkedList = new LinkedList_leetcode();
		linkedList.insert(1);
		linkedList.insert(2);
		linkedList.insert(3);
		linkedList.insert(4);
		linkedList.insert(5);

		ListNode list = linkedList.head();
		int k = 2;

		linkedList.printList(new ReverseNodesInKGroup().reverseKGroup(list, k));

	}

}
