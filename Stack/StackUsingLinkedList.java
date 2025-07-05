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

    static class Stack{
        static Node head = null;

        //For Empty of stack
        public boolean isEmpty(){
            return head == null;
        }

        //for Push in Stack
        public void push(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        //For pop in Stack
        public int pop(){
            if(isEmpty()){
                return -1;
            }

            int top = head.data;
            head = head.next;
            return top;
        }

        //for Peek in Stack
        public int peek(){
            if (isEmpty()){
                return -1;
            } 
            return head.data;
        }
    }

    public static void main(String[] args){
        Stack temp = new Stack();
        temp.push(10);
        temp.push(20);
        temp.push(30);
        temp.push(40);
        
        while (!temp.isEmpty()){
            System.out.println(temp.peek());
            temp.pop();
        } 
    }
}
