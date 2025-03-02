import java.util.Stack;
import java.util.LinkedList;
import java.util.*;
public class Qus_of_Stack {
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

    public static boolean is_Palindrome(Node head){
        Stack<Integer> track = new Stack<>();
        Node slow = head;
        boolean isPalin = true;
        while (slow != null) {
            track.push(slow.data);
            slow = slow.next;
        }
        while (head != null) {
            int value = track.pop();
            if(value != head.data){
                return false;
            }
            head = head.next;
        }
        return true;
    }

    public static void main(String[] args) {
        //Q1) CHeck the given Linked List is Palindrome or not using Stack
        LinkedList<String> val = new LinkedList<>();
        val.addFirst("a");
        val.addLast("b");
        val.addLast("c");
        val.addLast("b");
        //val.addLast("a");
        //boolean
        System.out.println(is_Palindrome( head));
    }
}
