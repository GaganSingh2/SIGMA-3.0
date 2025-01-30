import java.util.LinkedList;

public class Stack_Using_LinkedList {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class Stack{
        static Node head = null;

        public static boolean isEmpty(){
            return head == null;
        }
    }
    public static void main(String[] args) {
        
    }
}
