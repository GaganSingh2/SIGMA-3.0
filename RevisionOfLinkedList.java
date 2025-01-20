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

    //Check the Given LL is Palindrome or not
    public Node findMidNode(Node head){
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // slow is stay on mid node
    }

    public boolean isPalnidrome(){
        if(head == null || head.next == null){
            return true;
        }
        //Step1 to find mid
        Node midNode = findMidNode(head);

        //step2 to reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev; //right half head
        Node left = head; //left half head

        //step3 to check left and right part
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    //Detect the LL is contain the Cycle/Loop or not
    public boolean isCycle(){
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }

    //Remove the Cycle in the LL
    public void isRemoveCycle(){
        //detect the cycle
        Node slow = head;
        Node fast = head;
        boolean flag = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                flag = true;
                break;
            }
        }
        if (flag == false) {
            return;
        }

        //find the meeting point
        slow = head;
        Node prev = null;
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        //remove the cycle to conncet the prev to null
        prev.next = null;
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
        // rll.addFirst(2);
        // rll.addFirst(1);
        // rll.addLast(3);
        // rll.addLast(4);
        // rll.addMiddle(0, 9);
        // rll.addMiddle(4, 8);
        // rll.addMiddle(6, 10);
        // rll.printLL();
        // System.out.println("Size of LL: "+rll.size);
        // rll.removeFirst(); //Remove the first Node
        // rll.printLL();
        // System.out.println("Size of LL: "+rll.size);
        // rll.removeLast(); //Remove last Node
        // rll.printLL();
        // System.out.println("Size of LL: "+rll.size);
        // int res = rll.itrativeSearch(3);
        // System.out.println("Index: "+res);
        // int res1 = rll.itrativeSearch(15); //Search the index using linear search
        // System.out.println("Index: "+res1);
        // int res2 = rll.recSearch(3); //Serach the index using Recurrsion
        // System.out.println("Index: "+res2);
        // //rll.reverseLL(); //Reverse the LL
        // rll.printLL();
        // rll.deleteNthNodeFromEnd(3);  //Remove the Nth node from the end of the LL
        
        // rll.printLL();
        // boolean palindrome = rll.isPalnidrome();
        // System.out.println("Given Linked List is Palindrome: "+palindrome);

        //Detect the cycle
        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = temp; //1->2->3->2
        boolean ans = rll.isCycle();
        System.out.println("LL is Contain Cycle: "+ans);
        rll.isRemoveCycle();
        System.out.println("LL is Contain Cycle: "+rll.isCycle());
        
    }
}
