public class ImplementDoublyLL {
    static class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    //AddFirst
    public void addFirst(int data){
        Node newNode = new Node(data);
        System.out.println("Node "+data+" inserted At First");
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        newNode.prev = null;
        head = newNode;

    }

    //AddLast
    public void addLast(int data){
        Node newNode = new Node(data);
        System.out.println("Node "+data+" inserted At Last!");
        size++;
        if(head==null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    //Remove First
    public void removeFirst(){
        if (head == null) {
            System.out.println("LinkedList is Empty!!");
        }
        
        else if(head.next == null){
            System.out.println("Node "+head.data+" Deleted From First!");
            head = tail = null;
            size--;
        }
        else{
            System.out.println("Node "+head.data+" Deleted From First!");
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    //Remove Last
    public void removeLast(){
        if (head == null) {
            System.out.println("LinkedList is Empty!!");
        }
        
        else if(head.next == null){
            System.out.println("Node "+head.data+" Deleted From Last!");
            head = tail = null;
            size--;
        }
        else{
            System.out.println("Node "+tail.data+" Deleted From First!");
            tail = tail.prev;
            tail.next = null;
            size--;
        }
    }

    //Reverse
    public void reverseLL(){
        Node curr = head;
        Node next;
        Node prev = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        tail = curr;
    }
    //Display
    public void display(){
        System.out.println("Display All Node:");
        Node tmp = head;
        System.out.print("null");
        while (tmp != null) {
            System.out.print(" <- "+tmp.data+" -> ");
            tmp = tmp.next;
        }System.out.print("null");
        System.out.println();
    }
    public static void main(String[] args) {
        ImplementDoublyLL dd = new ImplementDoublyLL();
        dd.addFirst(3);
        dd.addFirst(5);
        dd.addFirst(6);
        dd.display();
        dd.addLast(7);
        dd.addLast(8);
        dd.display();
        // dd.reverseLL();
        // dd.display();
        dd.removeFirst();
        dd.display();
        dd.removeLast();
        dd.display();
        dd.addFirst(9);
        dd.addLast(13);
        dd.display();
    }
}

// Why we make our mainmethod as a static