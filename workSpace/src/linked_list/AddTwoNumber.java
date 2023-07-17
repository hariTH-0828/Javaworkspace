package linked_list;

public class AddTwoNumber extends SinglyLinkedList {
	// https://leetcode.com/problems/add-two-numbers/

	// Optimal Solution
	public void addTwoNumber(LinkedList listOne, LinkedList listTwo) {
		Node currNodeOne = listOne.head;
		Node currNodeTwo = listTwo.head;
		LinkedList resultList = new LinkedList();

		int carry = 0;
		while (currNodeOne != null || currNodeTwo != null) {
			int numOne = currNodeOne != null ? currNodeOne.data : 0;
			int numTwo = currNodeTwo != null ? currNodeTwo.data : 0;
			int data = numOne + numTwo + carry;
			carry = data / 10;
			int remainder = data % 10;
			resultList.insert(remainder);

			currNodeOne = currNodeOne != null ? currNodeOne.next : null;
			currNodeTwo = currNodeTwo != null ? currNodeTwo.next : null;
		}

		if (carry != 0) {
			resultList.insert(carry);
		}

		printList(resultList);
	}

	public static void main(String args[]) {
		AddTwoNumber listOne = new AddTwoNumber();
		AddTwoNumber listTwo = new AddTwoNumber();
		AddTwoNumber object = new AddTwoNumber();

		listOne.insert(7);
		listOne.insert(3);
		listOne.insert(1);

		listTwo.insert(1);

		object.addTwoNumber(listOne, listTwo);

	}
}
