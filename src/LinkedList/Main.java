package LinkedList;


public class Main {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addFirst(55);
        list.addFirst(55);
        System.out.println(list.indexOF(30));
        System.out.println(list.contains(10));
    }
}
