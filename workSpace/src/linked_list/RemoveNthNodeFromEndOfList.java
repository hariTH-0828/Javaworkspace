package linked_list;

public class RemoveNthNodeFromEndOfList {

	Node head;
	int size = 0;

	class Node {

		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;
		}
	}

	public void insert(int data) {
		Node node = new Node(data);

		if (head == null) {
			head = node;
		} else {
			Node last = head;
			while (last.next != null) {
				last = last.next;
			}
			last.next = node;
		}
		size += 1;
	}

	public void printList(RemoveNthNodeFromEndOfList list) {
		Node node = list.head;
		System.out.print("LinkedList : ");
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
		System.out.println();
	}

	public void removeNthNode(RemoveNthNodeFromEndOfList list, int position) {
		position = size - position;
		Node node = list.head;
		Node next = null;
		Node prev = null;

		for (int i = 0; i < position; i++) {
			prev = node;
			node = node.next;
		}
		if (prev == null) {
			head = node.next;
			return;
		}
		next = node.next;
		prev.next = next;
	}

	public static void main(String args[]) {
		RemoveNthNodeFromEndOfList list = new RemoveNthNodeFromEndOfList();
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(4);
		list.insert(5);

		list.printList(list);
		list.removeNthNode(list, 4);
		System.out.println("After removing Node : ");
		list.printList(list);

	}

}
