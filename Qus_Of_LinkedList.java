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

    public void addFirst(int data) {
        // step1= create new Node
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static int searchKey(int key) {
        Node temp = head;
        int idx = 0;
        if (head == null) {
            return -1;
        }
        while (temp != null) {
            if (key == temp.data) {
                return idx;
            }
            temp = temp.next;
            idx++;
        }
        return -1;
    }

    // Using Recursion
    public int helper(int key, Node head) {
        // Base case
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
        return idx + 1;
    }

    public int recSearch(int key) {
        return helper(key, head);
    }

    // Reverse
    public void reverse() {
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

    // Delete Nth Node
    public void deleteNthfromEnd(int key) {
        // Calculate size
        int sz = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }

        if (key == sz) {
            head = head.next; // remove first if key is stay on head
            return;
        }

        // Otherwise use formula sz-n+1
        int idx = 1;
        int iToFind = sz - key;
        Node prev = head;
        while (idx < iToFind) {
            prev = prev.next;
            idx++;
        }
        prev.next = prev.next.next;
        return;
    }

    // Palindrome
    public Node findMid(Node head) {
        Node slow = head; // +1 increment
        Node fast = head; // +2 increment

        while (fast != null && fast.next == null) {
            slow = slow.next; // +1 forward
            fast = fast.next.next; // +2 forward
        }
        return slow; // slow on the Mid
    }

    public boolean isPalnidrome() {
        // Base Case
        if (head == null || head.next == null) {
            return true;
        }

        // Step1- find the mid Node
        Node mid = findMid(head);

        // Step2- Reverse the 2nd half
        Node curr = mid;
        Node prev = null;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;

        // Step3- check the left and right is equal
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public static boolean isCycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true; // Cycle exist
            }
        }
        return false; // Cycle does not exist
    }

    public static void isRemoveCycle() {
        // Detect the cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                cycle = true;
                break;
            }
        }
        if (cycle == false) {
            return;
        }
        // slow = head & find meeting point
        slow = head;
        Node prev = null;
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        // lastnode.next = null
        prev.next = null;
    }


    //Delete the Middle Node
    public static Node deleteMidNode(Node head){
        if (head.next == null) {
            return null;
        }
        Node slow = head;
        Node fast = head;
        Node prev = null;
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = slow.next;
        return head;
    }

    //Merge Sort
    //find the mid Node
    private Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next; //+1 increment
            fast = fast.next.next; //+2 increment
        }
        return slow; //Mid Node
    }
    private Node merge(Node head1, Node head2){
        Node mergell = new Node(-1);
        Node temp = mergell;
        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
            }
            else{
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
        }
        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergell.next;
    }
    public Node isMergeSort(Node head){
        //Base Case
        if(head==null || head.next==null){
            return head;
        }
        //Find Mid Node
        Node midNode = getMid(head);

        //Divide and applies merge sort on left & right part
        Node rightHead = midNode.next;
        midNode.next = null;
        Node newLeft = isMergeSort(head);
        Node newRight = isMergeSort(rightHead);
        
        //After sorting merge the Node
        return merge(newLeft, newRight);
    }

    //Zig-Zag Problem
    private Node giveMid(Node head){
        Node slow = head;
        Node fast = head.next;
        while (fast != null || fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;  //Slow is Mid
    }
    public void zigZag(){
        //Find mid of LL
         Node midNode = getMid(head);

        //Reverse the 2nd half
        Node curr = midNode.next;
        midNode.next = null;
        Node prev = null;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;
        Node nextL , nextR;

        //Alternat Merging
        while (left != null && right != null) {
            nextL = left.next;        //allocate the nodes
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;  //Update the node after swaping two nodes
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Qus_Of_LinkedList linkqus = new Qus_Of_LinkedList();
        linkqus.addFirst(8);
        linkqus.addFirst(7);
        linkqus.addFirst(6);
        linkqus.addFirst(5);
        linkqus.addFirst(4);
        linkqus.addFirst(3);
        linkqus.addFirst(2);
        linkqus.addFirst(1);
        // linkqus.print();
        // Q1)Search the key and return the position of key using loop
        // System.out.println("Enter the key: ");
        // int key = sc.nextInt();

        // int res = linkqus.searchKey(key);
        // System.out.println("Postion of Node: "+res);

        // Same qus using Recursion
        // int result = linkqus.recSearch(key);
        // System.out.println("Position of Node: "+result);

        // Q2)Reverse the Linked List
        // linkqus.reverse();
        // linkqus.print();

        // Q3)Find & Remove Nth Node from End
        // System.out.println("Enter key: ");
        // int key = sc.nextInt();
        // linkqus.deleteNthfromEnd(key);
        // linkqus.print();

        // Q6) Check the given integer is Palindrome or not.
        // System.out.println("Result is: "+linkqus.isPalnidrome());

        // Q7)Detect the Linked List contain the Loop/Cycle or not.
        // head = new Node(1);
        // head.next = new Node(2);
        // head.next.next = new Node(5);
        // head.next.next.next = head;

        // System.out.println("Cycle Exist: "+linkqus.isCycle());

        // Q7) Remove the Cycle/Loop in a Linked List
        // head = new Node(1);
        // Node temp = new Node(2);
        // head.next = temp;
        // head.next.next = new Node(3);
        // head.next.next.next = new Node(4);
        // head.next.next.next.next = temp;

        // System.out.println("Cycle is Exist: "+isCycle());
        // isRemoveCycle();
        // System.out.println("Cycle is Exist: "+isCycle());

        //Q8)Delete the middle Node and print the others Node
        // linkqus.print();
        // System.out.println(deleteMidNode(head));


        //9)Merge Sort on the Linked List
        // linkqus.print();
        // linkqus.head = linkqus.isMergeSort(linkqus.head);
        // linkqus.print();

        //10) Zig-Zag in Linked List
        linkqus.print();
        linkqus.zigZag();
        linkqus.print();

    }
}
