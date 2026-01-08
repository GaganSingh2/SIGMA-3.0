package Queue;

import java.util.Stack;

public class QueueUsing2_Stack {

    //1st Way---------------
    //In this Class we perform Push()in O(n) and Pop() in O(1)
    static class QueuePushLinear{

         Stack<Integer> fir;
         Stack<Integer> sec;

        QueuePushLinear() {
            fir = new Stack<>();
            sec = new Stack<>();
        }

        // For Check First stack is Empty or not
        public  boolean isEmpty() {
            return fir.isEmpty();
        }

        // For Adding the value O(n)
        public  void push(int data) {

            while (!fir.isEmpty()) {
                sec.push(fir.pop());
            }
            fir.push(data);
            while (!sec.isEmpty()) {
                fir.push(sec.pop());
            }

        }

        // For Removing the Value O(1)
        public  int pop() {
            if(isEmpty()){
                System.out.println("Underflow");
                return -1;
            }
            return fir.pop();
        }

        //For Top Value
        public  int peek(){
            if(isEmpty()){
                System.out.println("Underflow");
                return -1;
            }
            return fir.peek();
        }
    }

    //2nd Way-----------------
    //In this Class we perform Push()in O(1) and Pop() in O(n)
    static class QueuePopLinear{

        Stack<Integer> fir;
        Stack<Integer> sec;

        QueuePopLinear(){
            fir = new Stack<>();
            sec = new Stack<>();
        }

        //For Empty of Queue
        public boolean isEmpty(){
            return fir.isEmpty();
        }

        //For Adding the Value O(1)
        public void push(int data){
            fir.push(data);
        }

        //For Removing the Value O(n)
        public int pop(){
            if(isEmpty()){
                System.out.println("UnderFlow");
                return -1;
            }
            while (!fir.isEmpty()) {
                sec.push(fir.pop());
            }
            int top = sec.pop();
            while (!sec.isEmpty()) {
                fir.push(sec.pop());
            }
            return top;
        }

        //For Top Value
        public int peek(){
            if(isEmpty()){
                System.out.println("Underflow!!");
                return -1;
            }
            while (!fir.isEmpty()) {
                sec.push(fir.pop());
            }
            int top = sec.peek();
            while (!sec.isEmpty()) {
                fir.push(sec.pop());
            }
            return top;
        }
    }

    public static void main(String[] args) {
        QueuePushLinear q = new QueuePushLinear();
        q.push(2);
        q.push(3);
        q.push(5);
        q.push(6);
        q.push(7);

        System.out.println("Queue Implment Using 2 Stack (Push in O(n)): ");
        while (!q.isEmpty()) {
            System.out.println("Value: "+q.peek());
            q.pop();
        }
        System.out.println(q.peek());
        q.push(23);
        System.out.println(q.pop());


         System.out.println("Queue Implment Using 2 Stack (Pop in O(n)): ");
        QueuePopLinear q1 = new QueuePopLinear();
        q1.push(2);
        q1.push(3);
        q1.push(5);
        q1.push(6);
        q1.push(7);

        while (!q1.isEmpty()) {
            System.out.println("Value: "+q1.peek());
            q1.pop();
        }
        System.out.println(q1.peek());
        q1.push(23);
        System.out.println(q1.pop());
    }
}
