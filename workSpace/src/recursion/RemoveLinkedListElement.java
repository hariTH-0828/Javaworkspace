package workSpace.src.recursion;

public class RemoveLinkedListElement {

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

    void insert(ListNode head, int val){
        ListNode newNode = new ListNode(val);
        while(head.next != null){
            head = head.next;
        }
        head.next = newNode;
    }

    void printList(ListNode head){
        System.out.print("LinkedList : ");
        while(head != null){
            System.out.print(head.val+" ");
            head = head.next;
        }
        System.out.println();
    }

    public void removeElements(ListNode head, int val){
        ListNode prev = head;
        ListNode currNode = head.next;
        while(currNode != null){
            if(currNode.val != val){
                prev = currNode;
                currNode = currNode.next;
            }else {
                prev.next = currNode.next;
                currNode = prev.next;
            }
        }
    }

    public static void main(String[] args) {
        RemoveLinkedListElement removeLinkedListElement = new RemoveLinkedListElement();
        ListNode listNode = new ListNode();
        int[] nums = {7,7,7,7};
        for(int i : nums){
            removeLinkedListElement.insert(listNode, i);
        }

        removeLinkedListElement.printList(listNode.next);

        int removeValue = 7;
        removeLinkedListElement.removeElements(listNode, removeValue);
        removeLinkedListElement.printList(listNode.next);
    }
}
