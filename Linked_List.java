import java.util.LinkedList;
import java.util.*;
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
    public static void addFirst(int data){
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
    //Adding the newNode in last position
    public static void addLast(int data){
        //step1-> create new Node
        Node newNode = new Node(data);
        if (head==null) {
            head = tail = newNode;
            return;
        }
        //step2-> link the previous node to newNode
        tail.next = newNode;

        //step3-> tail = newNode
        tail = newNode;
    }

    public void print(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
    
    public static void main(String[] args) {
        Linked_List ll = new Linked_List();
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addLast(3);
        ll.print();
        ll.addFirst(6);
        ll.print();
        ll.addLast(4);
        
    }
}
