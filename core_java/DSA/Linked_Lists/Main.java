package core_java.DSA.Linked_Lists;

public class Main {
    public static void main(String[] args) {
        LL list =  new LL();
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(6);
        list.insertFirst(18);
        list.insertLast(99);
        list.insert(100, 3);
        list.display();
        System.out.println(list.deleteFirst());
        list.display();
    }
}
