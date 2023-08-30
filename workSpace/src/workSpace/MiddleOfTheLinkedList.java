package workSpace.src.workSpace;

public class MiddleOfTheLinkedList {

    private static Node head;
    static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insert(int val) {
        if(head == null) {
            head = new Node(val);
            return;
        }

        Node node = new Node(val);
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = node;
    }

    public Node middleNode(Node head) {
        Node slowPtr = head; Node fastPtr = head;
        while(fastPtr != null && fastPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        return slowPtr;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9,0};
        MiddleOfTheLinkedList linkedList = new MiddleOfTheLinkedList();
        for (int i : nums) {
            linkedList.insert(i);
        }

        Node currNode = linkedList.middleNode(head);
        System.out.print("Middle Linked List : ");
        while (currNode != null) {
            System.out.print(currNode.data+" ");
            currNode = currNode.next;
        }
    }
}
