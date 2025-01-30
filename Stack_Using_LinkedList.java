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

        //For Push
        public static void push(int data){
            Node newNode = new Node(data);
            if (isEmpty()){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        //For Pop
        public static int pop(){
            if (isEmpty()) {
                return -1;
            }
            int top_Data = head.data;
            head = head.next;
            return top_Data;
        }

        //For peek or Top 
        public static int peek(){
            if (isEmpty()) {
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        Stack sb = new Stack();
        sb.push(1);
        sb.push(2);
        sb.push(3);

        while (!sb.isEmpty()) {
            System.out.println(sb.peek());
            sb.pop();
        }
    }
}
