package core_java.DSA.Linked_Lists;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL() {  //constructor
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);//created new node and put value
        node.next = head;//point the inserted node to head
        head = node;//head is alwYA FIRST

        if(tail == null) { //if there are no node, 1st node will be
            tail = head;
        }
        size += 1;

    }

    public void insertLast(int val) {
        if(tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);//create node
        tail.next = node; //add node to next of tail
        tail = node;//assign last node as tail
        size++;
    }

    public void insert(int val, int index) {
        if(index == 0) { //if empty add new at first
            insertFirst(val);
            return;
        }
        if(index == size) {//
            insertLast(val);
            return;
        }

        Node temp = head;
        for(int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

    public int deleteFirst() {
        int val = head.value;
        head = head.next;
        if(head == null) {
            tail = null;
        }
        size--;
        return val;
    }


    public void display() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
     
}
