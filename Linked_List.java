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

    //Adding the new Node in first position
    public void addFirst(int data){
        //step1= create new Node
        Node newNode = new Node(data);
        if (head==null) {
            head = tail = newNode;
            return;
        }
        //step2-> link the newNode to head
        newNode.next = head; 

        //step3-> head = newNode
        head = newNode;
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        
    }
}
