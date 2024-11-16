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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Qus_Of_LinkedList linkqus = new Qus_Of_LinkedList();
        linkqus.addFirst(1);
        linkqus.addFirst(2);
        linkqus.addFirst(3);
        linkqus.addFirst(4);
        linkqus.addFirst(5);

        linkqus.print();
        System.out.println("Enter the key: ");
        int key = sc.nextInt();

        int res = linkqus.searchKey(key);
        System.out.println("Postion of Node: "+res);
    }
}
