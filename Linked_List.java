// import java.util.LinkedList;
// import java.util.*;

public class Linked_List {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // Adding the new Node in first position
    public static void addFirst(int data) {
        // step1= create new Node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // step2-> link the newNode to head
        newNode.next = head;

        // step3-> head = newNode
        head = newNode;
    }

    // Adding the newNode in last position
    public static void addLast(int data) {
        // step1-> create new Node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // step2-> link the previous node to newNode
        tail.next = newNode;

        // step3-> tail = newNode
        tail = newNode;
    }

    // print the Nodes
    public void print() { // O(n)
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    // Adding the nodes in Middle of LinkedList
    public void add(int idx, int data) {
        // if the LL is empty then add the Node on Head of LL
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }

        // i=idx-1, temp->prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Remove the first node in LinkedList
    public int removeFirst() {
        int val = head.data;
        // Base case
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            head = tail = null;
            size = 0;
            return val;
        }

        head = head.next;
        size--;
        return val;
    }

    // Remove the last Node in LinkedList
    public int removeLast() {
        int val = tail.data;
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            head = tail = null;
            size = 0;
            return val;
        }

        int i = 0;
        Node prev = head;
        while (i < size - 2) {
            prev = prev.next;
            i++;
        }

        prev.next = null;
        tail = prev;
        size--;
        return val;
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
        ll.print();
        ll.add(2, 10);
        ll.print();
        System.out.println("Size of LinkedList: " + ll.size);
        ll.removeFirst();
        ll.print();
        System.out.println("Size of LinkedList: " + ll.size);
        ll.removeLast();
        ll.print();
        System.out.println("Size of LinkedList: " + ll.size);
    }
}
