package linked_list;

public class DoublyLinkedList {

	Node head;

	class Node {
		Node prev;
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}

		Node(int data, Node prev){
			this.data = data;
			this.prev = prev;
			this.next = null;
		}
	}

	private void insert(int data) {
		Node node = new Node(data);

		if (head == null) {
			head = node;
		} else {
			Node last = head;
			while (last.next != null) {
				last = last.next;
			}
			last.next = node;
			node.prev = last;
		}
	}

	private void printList(DoublyLinkedList list) {
		Node currNode = list.head;
		Node prev = null;

		System.out.print("DoublyLinkedList : ");
		while (currNode != null) {
			System.out.print(currNode.data + " ");
			prev = currNode;
			currNode = currNode.next;
		}

		System.out.println();
		System.out.print("Reverse List : ");
		while (prev != null) {
			System.out.print(prev.data + " ");
			prev = prev.prev;
		}
	}

	private void insertInto(int position, int data) {
		try {
			Node currNode = head;
			Node prev = null;

			int i = 1;
			while (i != position) {
				currNode = currNode.next;
				i += 1;
			}

			Node new_node = new Node(data);
			prev = currNode.prev;
			currNode.prev = new_node;
			new_node.next = currNode;
			if (prev == null) {
				head = new_node;
			} else {
				new_node.prev = prev;
				prev.next = new_node;
			}

		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
	}

	private void deleteBykey(int data) {
		return;
	}

	public static void main(String args[]) {
		DoublyLinkedList list = new DoublyLinkedList();
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(5);
		list.insertInto(4, 4);
		list.insertInto(1, 0);
		list.deleteBykey(0);

		list.printList(list);
	}
}
