package linked_list;

public class LinkedList_leetcode {
	private ListNode head;

	static class ListNode {

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

	public ListNode insert(int val) {
		return insertInto(head, val);
	}

	private ListNode insertInto(ListNode node, int val) {
		ListNode listNode = new ListNode(val);

		if (node == null) {
			head = listNode;
			return head();
		}

		while (node.next != null) {
			node = node.next;
		}

		node.next = listNode;
		return listNode;
	}

	public void append(ListNode listNode) {
		ListNode lastNode = head;
		while (lastNode.next != null) {
			lastNode = lastNode.next;
		}

		lastNode.next = listNode;
	}

	public ListNode last() {
		ListNode node = head;
		while (node.next != null) {
			node = node.next;
		}
		return node;
	}

	public ListNode head() {
		return head;
	}

	public void printList(ListNode listNode) {
		System.out.print("LinkedList : ");
		ListNode head = listNode;
		while (head != null) {
			System.out.print(head.val + " ");
			head = head.next;
		}
		System.out.println();
	}

}
