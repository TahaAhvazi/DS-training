package LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        System.out.println(list);
        // LinkedList<Integer> list = new LinkedList<>();
        // list.addLast(10);
        // list.addLast(20);
        // list.addLast(30);
        // list.addFirst(5);
        // System.out.println(list.contains(30));
        // System.out.println(list.size());
        // System.out.println(list);
    }
}
