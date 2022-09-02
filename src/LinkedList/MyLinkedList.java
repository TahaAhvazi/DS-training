package LinkedList;

import java.util.NoSuchElementException;

public class MyLinkedList {
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node first;
    private Node last;
    private int size;

    // *** CLONE A LINKED LIST IN DATA STRUCTURES AND ALGORITHMS *** \\
    // ADD FIRST
    public void addFirst(int item) {
        Node node = new Node(item);
        if (isEmpty()) {
            first = last = node;
        } else {
            node.next = node;
            first = node;
        }
        size++;
    }

    // ADD LAST
    public void addLast(int item) {
        Node node = new Node(item);
        if (isEmpty()) {
            first = last = node;
        } else {
            last.next = node;
            last = node;
        }
        size++;
    }

    // DELETE FIRST
    public void removeFirst(int item) {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        if (first == last) {
            first = last = null;
            return;
        } else {
            Node secound = first.next;
            first.next = null;
            first = secound;
        }
        size--;
    }

    // DELETE LAST
    public void removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        if (first == last) {
            first = last = null;
            return;
        }
        Node previous = getPrevious(last);
        last = previous;
        last.next = null;
        size--;
    }

    // CONTAINS
    public boolean contains(int item) {
        return indexOF(item) != -1;
    }

    // INDEX OF
    public int indexOF(int item) {
        int index = 0;
        Node current = first;
        while (current != null) {
            if (current.value == item) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    public int size() {
        return size;
    }

    public int[] toArray() {
        int[] array = new int[size];
        Node current = first;
        int index = 0;
        while (current != null) {
            array[index++] = current.value;
            current = current.next;
        }
        return array;
    }

    public void reverse() {
        // changing the direction of LinkedLists
        Node previous = first;
        Node current = first.next;
        while (current != null) {
            Node BackUp = current.next;
            current.next = previous;
            previous = current;
            current = BackUp;
        }
        // Changing the first and last node
        last = first;
        last.next = null;
        first = previous;
    }

    public int getKthFromtheEnd(int k) {
        if (isEmpty()) {
            throw new IllegalStateException();
        }
        Node a = first;
        Node b = first;

        for (int i = 0; i < k - 1; i++) {
            b = b.next;
            if (b == null) {
                throw new IllegalArgumentException();
            }
            while (b != last) {
                a = a.next;
                b = b.next;
            }
        }
        return a.value;
    }

    // CREATING ISEMPTY METHOD
    public boolean isEmpty() {
        return first == null;
    }

    // CREATE GET PREVIOUS METHOD
    public Node getPrevious(Node node) {
        Node current = first;
        while (current != last) {
            if (current.next == last) {
                return current;
            }
        }
        return null;
    }
}
