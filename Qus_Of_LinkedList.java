import java.util.LinkedList;
import java.util.*;

public class Qus_Of_LinkedList {

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

    public void addFirst(int data){
        // step1= create new Node
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void print(){
       Node temp = head;
       while (temp != null) {
            System.out.print(temp.data+" -> ");
            temp = temp.next;
       }
       System.out.println("null");
    }

    public static int searchKey(int key){
        Node temp = head;
        int idx = 0;
        if (head==null) {
            return -1;
        }
        while (temp != null) {
            if (key==temp.data) {
                return idx;
            }
            temp = temp.next;
            idx++;
        }
        return -1;
    }

    //Using Recursion
    public int helper(int key, Node head){
        //Base case
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int idx = helper(key, head.next);
        if (idx == -1) {
            return -1;
        }
        return idx+1;
    }
    public  int recSearch(int key){
        return helper(key,head);
    }

    //Reverse
    public void reverse(){
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

    //Delete Nth Node
    public void deleteNthfromEnd(int key){
        //Calculate size 
        int sz = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }

        if (key == sz) {
            head = head.next; //remove first if key is stay on head
            return;
        }

        //Otherwise use formula sz-n+1
        int idx = 1;
        int iToFind = sz-key;
        Node prev = head;
        while (idx < iToFind) {
            prev = prev.next;
            idx++;
        }
        prev.next = prev.next.next;
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Qus_Of_LinkedList linkqus = new Qus_Of_LinkedList();
        linkqus.addFirst(5);
        linkqus.addFirst(4);
        linkqus.addFirst(3);
        linkqus.addFirst(2);
        linkqus.addFirst(1);

        linkqus.print();
        //Q1)Search the key and return the position of key using loop
        // System.out.println("Enter the key: ");
        // int key = sc.nextInt();

        // int res = linkqus.searchKey(key);
        // System.out.println("Postion of Node: "+res);

        //Same qus using Recursion
        // int result = linkqus.recSearch(key);
        // System.out.println("Position of Node: "+result);

        //Q2)Reverse the Linked List
        // linkqus.reverse();
        // linkqus.print();

        //Q3)Find & Remove Nth Node from End
        System.out.println("Enter key: ");
        int key = sc.nextInt();
        linkqus.deleteNthfromEnd(key);
        linkqus.print();
    }
}
