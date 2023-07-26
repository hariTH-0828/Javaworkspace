package workSpace.src.recursion;

public class ReverseLinkedList {

    static class ListNode {
        int val;
        ListNode next;
        public ListNode() {

        }
        public ListNode(int val) {
            this.val = val;
        }
        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public void insert(ListNode head, int val){
        ListNode new_node = new ListNode(val);
        while(head.next != null){
            head = head.next;
        }
        head.next = new_node;
    }

    public ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode next = null;
        ListNode currNode = head;

        while(currNode != null){
            next = currNode.next;
            currNode.next = prev;
            prev = currNode;
            currNode = next;
        }

        return prev;
    }

    public ListNode recursiveReverseList(ListNode prev, ListNode head){
        ListNode next = null;
        if(head == null){
            return prev;
        }
        next = head.next;
        head.next = prev;

        return recursiveReverseList(head, next);

    }

    public static void main(String[] args) {
        ReverseLinkedList linkedList = new ReverseLinkedList();
        int[] nums = {2,3,4,5};
        ListNode node = new ListNode(1);
        for(int i : nums){
            linkedList.insert(node, i);
        }

        printList(node);
        ListNode reversedList = linkedList.recursiveReverseList(null, node);
        printList(reversedList);

    }

    private static void printList(ListNode head) {
        System.out.print("Linked List : ");
        ListNode iterator = head;
        while(iterator != null){
            System.out.print(iterator.val+" ");
            iterator = iterator.next;
        }
        System.out.println();
    }
}
