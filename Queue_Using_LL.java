import java.util.LinkedList;

public class Queue_Using_LL {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class Queue {
        static Node head = null;
        static Node tail = null;
        

        //Queue is empty
        public static boolean isEmpty(){
            return head == null && tail == null;
        }

        //Add
        public static void add(int data){
            Node newNode = new Node(data);
            if (head == null) {
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        //Remove
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            int front = head.data;
            //if single node is exist
            if(tail == head){
                head = tail = null;
            }
            else{
                head = head.next;
            }
            
            return front;
        }

        //Return the top element
        public static int peek(){
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.remove();
        q.add(4);
        q.remove();
        q.add(5);

        while (!q.isEmpty()) {
            System.out.print(q.peek()+"-->");
            q.remove();
        }
        System.out.print("null");
    }
}
