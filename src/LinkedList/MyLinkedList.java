package LinkedList;

public class MyLinkedList {
    private class Node{
        private int value;
        private Node next;
        public Node(int value){
            this.value = value;
        }
    }
    private Node first;
    private Node last;
    // *** CLONE A LINKED LIST IN DATA STRUCTURES AND ALGORITHMS *** \\
    //ADD FIRST
    // ADD LAST
    public void addLast(int item){
        Node node = new Node(item);
        if (first == null) {
            first = last = node;
        }else{
            last.next = node;
            last = node;
        }
    }
    // DELETE FIRST
    //DELETE LAST
    //CONTAINS
    //INDEX OF
}
