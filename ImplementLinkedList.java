import Recursion.numberExample;

public class ImplementLinkedList {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }
    }

    public static Node head;
    public static int size;
    public static Node tail;
    
    //AddFirst
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            System.out.println("New Node add at First with value "+data);
            tail = head = newNode;
            return;
        }
        System.out.println("New Node add at First with value "+data);
        newNode.next = head;
        // tail = tail.next;
        head = newNode;
    }

    
    //Addlast
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        System.out.println("New Node add at Last with value "+data);
        if (tail == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    //Remove First
    public int removeFirst(){
        if(head == null){
            System.out.println("LinkedList Is Empty!");
            return -1;
        }
        int top = head.data;
        size--;
        System.out.println("Node Data "+top+" Deleted From First!");
        if (head.next == null) {
            head = null;
            return top;
        }
        head = head.next;
        return top;
    }

    //Remove Last
    public int removeLast(){
        if (head == null) {
            System.out.println("LinkedList Is Empty!");
            return -1;
        }
        int last = tail.data;
        size--;
        System.out.println("Node Data "+last+" Deleted From Last!");
        if (head == tail) {
            head = tail = null;
            return last;
        }
        return 0;
    }
    //Peek
    public int peek(){
        if(head == null){
            return -1;
        }
        int top = head.data;
        size--;
        System.out.println("Top Node Data "+top);
        return top;
    }
    //Display
    public void display(){
        if (head == null) {
            System.out.println("LinkedList Empty!");
            return;
        }
        Node temp = head;
        System.out.println("Data Display:");
        while (temp != null) {
            System.out.println("Data: "+temp.data);
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        ImplementLinkedList imp = new ImplementLinkedList();
        imp.addFirst(4);
        imp.addFirst(8);
        imp.removeFirst();
        imp.addFirst(10);
        imp.peek();
        imp.removeFirst();
        imp.peek();
        imp.addFirst(14);
        imp.addFirst(18);
        // imp.display();
        imp.addLast(20);
        imp.display();
    }
}