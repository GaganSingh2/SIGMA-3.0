import java.util.*;
public class StackUsing2_Queue {
    static class StackPushLinear{
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        //For Empty
        public boolean isEmpty(){
            return q1.isEmpty();
        }

        //For Adding The Value O(n)
        public void push(int data){
            //push all q1 data into q2
            while (!q1.isEmpty()) {
                q2.add(q1.remove());
            }
            //push new data in q1
            q1.add(data); 
            //again, push all q1 data into q1
            while (!q2.isEmpty()) {
                q1.add(q2.remove());
            }
        }

        //For Removig the Value O(1)
        public int pop(){
            if(isEmpty()){
                System.out.println("UnderFlow!!");
                return -1;
            }
            return q1.remove();
        }

        //For Top Value
        public int peek(){
            if(isEmpty()){
                System.out.println("UnderFlow!!");
                return -1;
            }
            int top = q1.peek();
            return top;
        }
    }

    static class StackPopLinear{
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        //For Empty
        public boolean isEmpty(){
            return q1.isEmpty();
        }

        //For Adding the Value O(1)
        public void push(int data){
            q1.add(data);
        }

        //For Removing the Value O(n)
        public int pop(){
            if(isEmpty()){
                System.out.println("Underflow!!");
                return -1;
            }
            int top = 0;
            //push all q1 data into q2 instead the last data of q1 because its going to pop
            while (!q1.isEmpty()) {
                top = q1.remove();
                //means top hold last value of q1, this value are going to pop
                if(q1.isEmpty()){
                    break;
                }
                else{
                    q2.add(top);
                }
            }
            //Push all the q2 data into q1
            while (!q2.isEmpty()) {
                q1.add(q2.remove());
            }
            return top;
        }

        //For TOp Value
        public int peek(){
            if(isEmpty()){
                System.out.println("Underflow!!");
                return -1;
            }
            int top = 0;
            while (!q1.isEmpty()) {
                top = q1.remove();
                q2.add(top);
            }
            while (!q2.isEmpty()) {
                q1.add(q2.remove());
            }
            return top;
        }
    }
    public static void main(String[] args) {
        System.out.println("Stack Implement Using 2 Queue (Push take O(n)): ");
        StackPushLinear stk = new StackPushLinear();
        stk.push(2);
        stk.push(3);
        stk.push(4);
        stk.push(5);

        while (!stk.isEmpty()) {
            System.out.println("Value: "+stk.peek());
            stk.pop();
        }
        System.out.println("Value: "+stk.pop());

        System.out.println("Stack Implement Using 2 Queue (Pop take O(n)): ");
        StackPopLinear stk2 = new StackPopLinear();
        stk2.push(2);
        stk2.push(3);
        stk2.push(4);
        stk2.push(5);

        while (!stk2.isEmpty()) {
            System.out.println("Value: "+stk2.peek());
            stk2.pop();
        }
        System.out.println("Value: "+stk2.pop());
        stk2.push(43);
        stk2.push(12);
        System.out.println("Value: "+stk2.peek());
        System.out.println("Value: "+stk2.pop());
    }
}
