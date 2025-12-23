import java.util.LinkedList;
class StackUsingLinkedList {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class Stack {
        static Node head = null;

        //Empty
        public boolean isEmpty(){
            return head == null;
        }
        
        //PUsh
        public void push(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode;
                return;
            }
            
            newNode.next = head; // basically we write here head.next = newNode (but here we implement stack so we go opposite so our latest value stay on top or first node)
            head = newNode; 
            // return;
        }

        //pop
        public int pop(){
            if(isEmpty()){
                System.out.println("Underflow");
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        //peek
        public int peek(){
            if(isEmpty()){
                System.out.println("Underflow");
                return -1;
            }
            return head.data;
            
        }
    }
    public static void main(String[] args) {
        Stack stk = new Stack();
        stk.push(23);
        stk.push(13);
        stk.push(43);
        stk.push(123);
        while (!stk.isEmpty()) {
            System.out.println("Top Value: "+stk.peek());
            stk.pop();
        }
        System.out.println("Stack is Empty: "+stk.isEmpty());
    }
}
