package workSpace;

public class LinkedList implements LinkedLists {

	Node head;

	class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	public void insert(int data) {
		Node node = new Node(data);

		if (head == null) {
			head = node;
		} else {
			// copy of head Node duplicate
			Node last = head;
			while (last.next != null) {
				last = last.next;
			}

			last.next = node;
		}
	}

	public void insertInto(int pos, int value) {
		try {
			Node currNode = head;
			Node prev = null;
			
			int i = 1;
			while(i != pos) {
				prev = currNode;
				currNode = currNode.next;
				i += 1;
			}
			Node new_node = new Node(value);
			if(prev == null) {
				new_node.next = head;
				head = new_node;
			} else {
				new_node.next = prev.next;
				prev.next = new_node;
			}
		} catch (Exception e) {
			System.out.println("There is no list to insert - " + e.getLocalizedMessage());
		}
	}

	public void deleteByKey(int value) {
		Node currNode = head;
		Node prev = null;
		while (currNode.data != value) {
			prev = currNode;
			currNode = currNode.next;
		}

		Node copy = currNode.next;
		if (prev == null) {
			head = copy;
		} else {
			prev.next = copy;
		}
	}

	public void printList(LinkedList list) {
		if (list.head != null) {
			Node currNode = list.head;
			System.out.print("LinkedList: ");
			while (currNode != null) {
				System.out.print(currNode.data + " ");
				currNode = currNode.next;
			}
		}
	}

}
