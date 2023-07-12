package workSpace;

public class SinglyLinkedList extends LinkedList {

	public void reverseList(LinkedList list) {
		Node currNode = list.head;
		Node prev = null;
		Node next = null;
		while (currNode != null) {
			next = currNode.next;
			currNode.next = prev;
			prev = currNode;
			currNode = next;
		}
		list.head = prev;
		list.printList(list);

	}

	public void mergeTwoSortedList(LinkedList list1, LinkedList list2) {

	}

	public static void main(String args[]) {
		SinglyLinkedList list1 = new SinglyLinkedList();
		SinglyLinkedList list2 = new SinglyLinkedList();

		list1.insert(1);
		list1.insert(2);
		list1.insert(4);

		list2.insert(1);
		list2.insert(3);
		list2.insert(5);

		list1.reverseList(list1);
	}
}
