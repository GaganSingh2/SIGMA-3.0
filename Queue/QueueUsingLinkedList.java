package Queue;

public class QueueUsingLinkedList {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }
    }
    static class Queue {
        static Node head = null;
        static Node tail = null;

        //For Emptyy
        public  boolean isEmpty(){
            return head==null;
        }

        //For Inserting Node
        public  void push(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                tail = head = newNode;
                return;
            }
        
            tail.next = newNode; //Tail connect to newNode
            tail = newNode; //Tail point to newNode
        }

        //For Removing Node
        public  int pop(){
            if (isEmpty()) {
                System.out.println("Underflow!!!");
                return -1;
            }
            int top = head.data;
            if(head==tail){
                head = tail = null;
            }
            else{
                head = head.next; //Head point to nextNode
            }
            return top;   
        }
        
        //For Top Value
        public  int peek(){
            if (isEmpty()) {
                System.out.println("Underflow!!");
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        Queue list = new Queue();
        list.push(3);
        list.push(2);
        list.push(4);
        list.push(5);
        list.push(9);
        list.push(10);

        System.out.println(list.pop()); //3
        System.out.println(list.peek()); //2

        list.push(11);
        list.push(32);

        while (!list.isEmpty()) {
            System.out.println("Value: "+list.peek());
            list.pop();
        }
        System.out.println("Value: "+list.peek());


    }
}
