package SameerSirDSA;

public class StackCreationUsingLinkedList {
    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head = null;
    public static Node tail = null;
    public static int size = 0;

    public boolean isEmpty() {
        if(size == 0){
            System.out.println("Stack UnderFlow");
            return true;
        }
        System.out.println("Stack is not Empty");
        return false;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            newNode.next = null;
            System.out.println(data+" Had Been Inserted in Stack!");
            size++;
            return;
        }
        size++;
        tail.next = newNode;
        tail = newNode;
        System.out.println(data+" Had Been Inserted in Stack!");
    }

    public void pop(){
        if (isEmpty()) {
            System.out.println("Stack Underflow!");
            return;
        }
        if (head.next == null) {
            System.out.println(head.data+" Had Been Deleted from Stack!");
            size = 0;
            head = null;
            return;
        }
        Node tmp = head;
        while (tmp.next.next != null) {
            tmp = tmp.next;
        }
        System.out.println(tmp.next.data+" Had been Deleted From Stack!");
        tmp.next = null;
        size--;
    }

    public void peek(){
        if (isEmpty()) {
            System.out.println("Stack Underflow!");
            return;
        }
        if (head.next == null) {
            System.out.println(head.data+" Top Value In Stack!");
            return;
        }
        Node tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        System.out.println(tmp.data+"  Top Value In Stack!");
    }

    public void sizeOf(){
        if (size == 0) {
            System.out.println("Stack Underflow!");
            return;
        }
        System.out.println("Size of Stack: "+size);
    }

    public void clear(){
        if (size == 0) {
            System.out.println("Stack Underflow!");
            return;
        }
        head = null;
        System.out.println("Stack is Cleared!");
    }

    public static void main(String[] args) {
        StackCreationUsingLinkedList linkedList = new StackCreationUsingLinkedList();
        linkedList.push(4);
        linkedList.push(6);
        linkedList.push(10);
        linkedList.push(16);
        linkedList.sizeOf();
        linkedList.pop();
        linkedList.sizeOf();
        linkedList.peek();
        linkedList.isEmpty();
        linkedList.pop();
        linkedList.pop();
        linkedList.sizeOf();
        linkedList.pop();
        linkedList.pop();
    }
}
