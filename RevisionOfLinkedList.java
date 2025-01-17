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
    public static int size;

    //AddFirst
    public void addFirst(int data){
        //step1= create newNode
        Node newNode = new Node(data);
        size++;
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
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        //link the tail to newNode
        tail.next = newNode;

        //newNode ko tail bana denge
        tail = newNode;
    }

    //Add in Middle or define index position
    public void addMiddle(int idx,int data){
        
        if (idx == 0) {
            addFirst(data);
            return;
        }
        else if(idx == size){
            addLast(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i=0;
        while (i<idx-1) {
            temp = temp.next;
            i++;
        }
        
        newNode.next = temp.next;
        temp.next = newNode;
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
        rll.addMiddle(0, 9);
        rll.addMiddle(4, 8);
        rll.addMiddle(6, 10);
        rll.printLL();
        System.out.println("Size of LL: "+rll.size);

    }
}
