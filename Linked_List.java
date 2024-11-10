import java.util.LinkedList;

public class Linked_List {
    public static class Node{
        int data; 
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
    }
}
