package workspace;

public class LinkedList {
    Node head;

    static class Node{
        int data;
        Node next;
    }

    public void insert(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;

        if(head == null){
            head = node;
        }else{
            Node n = head;
            while (n.next != null){
                n = n.next;
            }
            n.next = node;
        }
    }

    public void insertAtStart(int num){
        Node node = new Node();

        node.data = num;
        node.next = head;
        head = node;
    }

    public void insertAt(int position, int nums){
        Node node = new Node();
        node.data = nums;
        node.next = null;

        if(position == 0){
            insertAtStart(nums);
        }else{
            Node n = head;
            for(int i = 0; i < position-1; i++){
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        }
    }
    public void show(){
        Node node = head;
        while(node.next != null){
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insert(5);
        list.insert(10);
        list.insert(15);
        list.insert(20);
        list.insert(30);

        list.insertAtStart(0);

        list.insertAt(5,25);

        list.show();
    }
}