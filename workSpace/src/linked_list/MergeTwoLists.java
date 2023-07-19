package linked_list;

import linked_list.LinkedList_leetcode.ListNode;

public class MergeTwoLists {

	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		ListNode dummy = new ListNode();
		ListNode tail = dummy;

		while (list1 != null && list2 != null) {
			if (list1.val < list2.val) {
				tail.next = list1;
				list1 = list1.next;
			} else {
				tail.next = list2;
				list2 = list2.next;
			}
			tail = tail.next;
		}

		if (list1 != null) {
			tail.next = list1;
		}

		if (list2 != null) {
			tail.next = list2;
		}

		return dummy.next;
	}

	public static void main(String args[]) {
		MergeTwoLists merging = new MergeTwoLists();
		LinkedList_leetcode list1 = new LinkedList_leetcode();
		LinkedList_leetcode list2 = new LinkedList_leetcode();

		list1.insert(5);

		list2.insert(1);
		list2.insert(3);
		list2.insert(4);

		ListNode result = merging.mergeTwoLists(list1.head(), list2.head());

		list1.printList(result);
	}

}
