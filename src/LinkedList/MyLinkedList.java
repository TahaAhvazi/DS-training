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
    public void addFirst(int item){
        Node node = new Node(item);
        if (isEmpty()) {
            first = last = node;
        }else{
            node.next = node;
            first = node;
        }
    }
    // ADD LAST
    public void addLast(int item){
        Node node = new Node(item);
        if (isEmpty()) {
            first = last = node;
        }else{
            last.next = node;
            last = node;
        }
    }
    // DELETE FIRST
    //DELETE LAST
    //CONTAINS
    public boolean contains(int item){
        return indexOF(item) != -1;
    }
    //INDEX OF
    public int indexOF(int item){
        int index = 0;
        Node current = first;
        while (current != null) {
            if (current.value == item) {
                return index;
            }
            current = current.next;
            index ++;
        }
        return -1;
    }
    // CREATING ISEMPTY METHOD
    public boolean isEmpty(){
        return first == null;
    }
}
