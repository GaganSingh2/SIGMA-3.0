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

    //Remove first
    public int removeFirst(){
        int val = head.data;
        if (size==0) {
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            head = tail = null;
            size = 0;
            return val;
        }
        head = head.next;
        size--;
        return val;
    }

    //Remove Last
    public int removeLast(){
        int val = 0;
        if (size == 0) {
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        //Traversing on the previous of tail
        Node prev = head;
        for(int i=0; i<size-2; i++){
            prev = prev.next;
        }
        
        val = prev.next.data; //tail.data
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    //Searching the key in LL
    public int itrativeSearch(int key){
        Node temp = head;
        int i=0;
        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    //Search using Recursion
    public int helper(Node head, int key){
        if(head==null){
            return -1;
        }

        if (key==head.data) {
            return 0;
        }
        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx+1;
    }
    public int recSearch(int key){
        return helper(head, key);
    }

    //Reverse the LL
    public void reverseLL(){
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    //Delete the Nth Node form End
    public void deleteNthNodeFromEnd(int key){
        //CAlculate the size
        int Size = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            Size++;
        }

        if(key == Size){
            head = head.next;
            return;
        }

        int i = 1;
        int iToFind = Size-key;
        Node prev = head;
        while (i < iToFind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
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
        rll.removeFirst(); //Remove the first Node
        rll.printLL();
        System.out.println("Size of LL: "+rll.size);
        rll.removeLast(); //Remove last Node
        rll.printLL();
        System.out.println("Size of LL: "+rll.size);
        int res = rll.itrativeSearch(3);
        System.out.println("Index: "+res);
        int res1 = rll.itrativeSearch(15); //Search the index using linear search
        System.out.println("Index: "+res1);
        int res2 = rll.recSearch(3); //Serach the index using Recurrsion
        System.out.println("Index: "+res2);
        rll.reverseLL(); //Reverse the LL
        rll.printLL();
        rll.deleteNthNodeFromEnd(3);
        rll.printLL();
    }
}
