import java.util.Scanner;

public class RevisionOfLinkedList {

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

    //AddFirst
    public void addFirst(int data){
        //step1= create newNode
        Node newNode = new Node(data);
        //if LL is empty
        if(head==null){
            head = tail = newNode;
            return;
        }
        //step2 = link the newNode to head
        newNode.next = head;
        //step3 = newNode ko head bana denge
        head = newNode;
    }

    //AddLast
    public void addLast(int data){
        //Create a newNode
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        //link the tail to newNode
        tail.next = newNode;

        //newNode ko tail bana denge
        tail = newNode;
    }

    //print the LL
    public void printLL(){
        
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        RevisionOfLinkedList rll = new RevisionOfLinkedList();
        rll.addFirst(2);
        rll.addFirst(1);
        rll.addLast(3);
        rll.addLast(4);
        rll.printLL();

    }
}
