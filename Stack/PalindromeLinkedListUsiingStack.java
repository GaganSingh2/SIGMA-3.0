import java.util.LinkedList;
import java.util.Stack;
public class PalindromeLinkedListUsiingStack {

    static class Node{
        int data;
        Node next;
        Node(int data){
            data = this.data;
            next = null;
        }
    }

    public static boolean isPalindrome(Node head){
        Node slow = head;
        Stack<Integer> stk = new Stack<>();
        while (slow != null) {
            stk.push(slow.data);
            slow = slow.next;
        }

        while (head != null) {
            if(head.data != stk.peek()){
                return false;
            }
            stk.pop();
            head = head.next;
        }
        return true;
    }

    public static void main(String[] args) {
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(2);
        Node five = new Node(1);
        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        boolean res = isPalindrome(one);
        if(res) System.out.println("It is a Palindrome!");
        else System.out.println("It is not a Palindrome!");
        
    }
}
