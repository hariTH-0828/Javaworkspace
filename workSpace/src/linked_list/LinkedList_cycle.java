package linked_list;

import linked_list.LinkedList_leetcode.ListNode;

public class LinkedList_cycle {

	public boolean hasCycle(ListNode head) {
		ListNode slowPtr = head;
		ListNode fastPtr = head;

		while (slowPtr != null && fastPtr != null) {
			fastPtr = fastPtr != null ? fastPtr.next : null;
			fastPtr = fastPtr != null ? fastPtr.next : null;

			if (slowPtr == fastPtr) {
				return true;
			}
			slowPtr = slowPtr.next;
		}
		return false;
	}


	public static void main(String args[]) {
		LinkedList_leetcode list = new LinkedList_leetcode();
		list.insert(3);
//		ListNode interMediate = list.insert(0);
//		list.insert(4);
//
//		list.append(interMediate);

		LinkedList_cycle cycle = new LinkedList_cycle();
		boolean status = cycle.hasCycle(list.head());
		System.out.println(status);
	}
}
