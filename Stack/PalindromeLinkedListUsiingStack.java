import java.util.LinkedList;
import java.util.Stack;


class Node {
    int data;
    Node ptr;
    Node(int d)
    {
        ptr = null;
        data = d;
    }
}
public class PalindromeLinkedListUsiingStack {

    private static boolean isPalindrome(Node head){
        Node slow = head;
        Stack<Integer> te = new Stack<>();
        while(slow != null){
            te.push(slow.data);
            slow = slow.ptr;
        }
        while(head != null){
            int top = te.pop();
            if(top != head.data){
                return false;
            }
            head = head.ptr;
        }
        return true;
    }
    public static void main(String[] args) {
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(2);
        Node five = new Node(1);
        one.ptr = two;
        two.ptr = three;
        three.ptr = four;
        four.ptr = five;
        boolean res = isPalindrome(one);
        if(res) System.out.println("It is a Palindrome!");
        else System.out.println("It is not a Palindrome!");
        
    }
}
