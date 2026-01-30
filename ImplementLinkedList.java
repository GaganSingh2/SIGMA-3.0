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
        Node tmp = head;
        while (tmp.next.next != null) {
            tmp = tmp.next;
        }
        int last = tmp.next.data;
        tmp.next = null;
        tail = tmp;
        size--;
        System.out.println("Node Data "+last+" Deleted From Last!");
        if (head == tail) {
            head = tail = null;
            return last;
        }
        return 0;
    }

    //Remove At Specific Position
    public int removeAtPosition(int pos){
        if(head == null){
            System.out.println("LinkedList Is Empty!");
            return -1;
        }
        else if(size==1 && pos>1){
            System.out.println("Specific Node is Not Available!!");
            return -1;
        }
        int te = 0;
        Node tmp = head;
        while (te != pos-1 && tmp.next != null) {
            te++;
            tmp = tmp.next;
        }
        int last = tmp.next.data;
        tmp.next = tmp.next.next;
        size--;
        System.out.println("Node Data "+last+" Deleted From "+pos);
        return last;
    }
    //1 2 3 4 5

    //Reverse the LL
    public void reverse(){
        Node next;
        Node prev = null;
        Node curr = head;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
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
        imp.removeLast();
        imp.display();
        imp.removeLast();
        imp.display();
        imp.addFirst(12);
        imp.addFirst(28);
        imp.display();
        imp.removeAtPosition(2);
        imp.display();
        imp.reverse();
        imp.display();
    }
}