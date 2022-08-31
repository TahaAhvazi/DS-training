package LinkedList;

import java.util.Arrays;;

public class Main {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        System.out.println(list.size());
        int[] array = list.toArray();
        System.out.println(Arrays.toString(array));
    }
}
