package linked_list;

import linked_list.LinkedList_leetcode.ListNode;

public class MergeKSortedList {

	public ListNode mergeKLists(ListNode[] lists) {
		if(lists == null) {
			return new ListNode();
		}

		ListNode dummy = new ListNode();
		ListNode tail = dummy;

		ListNode prev = lists[0];
		for (int i = 1; i < lists.length; i++) {
			ListNode nextNode = lists[i];
			prev = mergeList(dummy, tail, prev, nextNode);
		}

		return prev;
	}


	private ListNode mergeList(ListNode dummy, ListNode tail, ListNode currNodeOfOne, ListNode currNodeOfTwo) {
		while (currNodeOfOne != null && currNodeOfTwo != null) {
			if (currNodeOfOne.val < currNodeOfTwo.val) {
				tail.next = currNodeOfOne;
				currNodeOfOne = currNodeOfOne.next;
			} else {
				tail.next = currNodeOfTwo;
				currNodeOfTwo = currNodeOfTwo.next;
			}
			tail = tail.next;
		}
		if (currNodeOfOne != null) {
			tail.next = currNodeOfOne;
		}

		if (currNodeOfTwo != null) {
			tail.next = currNodeOfTwo;
		}

		return dummy.next;
	}

	public static void main(String[] args) {
		LinkedList_leetcode linkedList = new LinkedList_leetcode();
		ListNode[] lists = new ListNode[1];
		
		int[] listOne = { 4, 5 };
		int[] listTwo = { 3, 4 };
		int[] listThree = { 6 };
		int[] listFour = { 5, 7, 8, 9 };

		lists[0] = new ListNode(1);
		lists[1] = new ListNode(1);
		lists[2] = new ListNode(2);
		lists[3] = new ListNode(0);

		createList(listOne, lists[0]);
		createList(listTwo, lists[1]);
		createList(listThree, lists[2]);
		createList(listFour, lists[3]);

		linkedList.printList(new MergeKSortedList().mergeKLists(lists));

	}

	private static void createList(int[] listOne, ListNode currNode) {
		for (int i : listOne) {
			currNode.next = new ListNode(i);
			currNode = currNode.next;
		}
	}

}
