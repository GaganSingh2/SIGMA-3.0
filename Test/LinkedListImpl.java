package Test;

public class LinkedListImpl {

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;
    
    //AddFirst
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        System.out.println(data+" had been insert at First!");
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    //AddLast
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        System.out.println(data+" had been insert at Last!");
        if(head == null){
            head = newNode;
            return;
        }
        
        
        tail.next = newNode;
        tail = newNode;
    }

    //removeFirst
    public void removeFirst(){
        if(head == null){
            System.out.println("LinkedList is Empty");
        }
        else if(head.next == null){
            System.out.println(head.data+" had been Deleted from First!");
            head = tail = null;
        }
        else{
            System.out.println(head.data+" had been deleted from first!");
            head = head.next;
        }
        size--;
    }

    //removeLast
    public void removeLast(){
        if(head == null){
            System.out.println("LinkedList is Empty");
        }
        else if(head.next == null){
            System.out.println(head.data+" had been Deleted from Last!");
            head = tail = null;
        }
        else{
            
            Node tmp = head;
            while (tmp.next.next != null) {
                tmp = tmp.next;
            }
            System.out.println(tmp.next.data+" had been deleted from Last!");
            tmp.next = null;
        }
        size--;
    }

    //Peek
    public void peek(){
        if (head == null) {
            System.out.println("LinkedList is Empty!!");
        }
        else{
            System.out.println("Top Data: "+head.data);
        }
    }

    //Display
    public void display(){
        if (head == null) {
            System.out.println("LinkedList is Empty!!");
        }
        else{
            System.out.println("Node Display");
            Node tmp = head;
            while (tmp != null) {
                System.out.print(tmp.data+" -> ");
                tmp = tmp.next;
            }System.out.print("null");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        LinkedListImpl ll = new LinkedListImpl();
        ll.addFirst(4);
        ll.addFirst(6);
        ll.addFirst(9);
        ll.display();
         ll.addLast(14);
        ll.addLast(16);
        ll.addLast(19);
        ll.display();
        ll.peek();
        ll.removeFirst();
        ll.display();
        ll.removeLast();
        ll.display();
    }
}