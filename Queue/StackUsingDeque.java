package Queue;

import java.util.*;
import java.util.LinkedList;

public class StackUsingDeque {
    static class Stack {
    
        Deque<Integer> d = new LinkedList<>();

        //For Empty
        public boolean isEmpty(){
            return d.isEmpty();
        }

        //For Push the Value
        public void push(int data){
            d.addLast(data);
        }

        //For Pop the value
        public int pop(){
            if(isEmpty()){
                System.out.println("Underflow!!");
                return -1;
            }

            return d.removeLast();
        }

        //For Peek the value
        public int peek(){
            if(isEmpty()){
                System.out.println("Underflow!!");
                return -1;
            }

            return d.getLast();
        }
    }
    public static void main(String[] args) {
        Stack stk = new Stack();
        stk.push(1);//1
        stk.push(2);//2,1
        stk.push(3);//3,2,1
        stk.push(4);//4,3,2,1
        stk.push(5);//5,4,3,2,1

        System.out.println("Top Value: "+stk.peek());

        while (!stk.isEmpty()) {
            System.out.println("Value: "+stk.peek());
            stk.pop();
        }
        System.out.println("Top Value: "+stk.peek());
    }
}
