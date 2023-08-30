package workSpace.src.linked_list;

public class SinglyLinkedList extends LinkedList {

	public LinkedList reverseList(LinkedList list) {
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

		return list;
	}

	public static void main(String args[]) {
		SinglyLinkedList list1 = new SinglyLinkedList();

		list1.insert(1);
		list1.insert(2);
		list1.insert(3);
		list1.insert(4);
		list1.insert(5);

		list1.printList(list1.reverseList(list1));
		System.out.println();

	}
}
