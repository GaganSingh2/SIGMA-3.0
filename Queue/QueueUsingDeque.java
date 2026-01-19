package Queue;

import java.util.Deque;
import java.util.LinkedList;

public class QueueUsingDeque {
    static class Queue{
        Deque<Integer> d = new LinkedList<>();

        //For Empty
        public boolean isEmpty(){
            return d.isEmpty();
        }

        //FOr Adding the Value
        public void add(int data){
            d.addLast(data);
        }

        //For Removing the value
        public int remove(){
            if(isEmpty()){
                System.out.println("UnderFlow!!");
                return -1;
            }
            return d.removeFirst();
        }

        //For Peek the value
        public int peek(){
            if (isEmpty()) {
                System.out.println("UnderFlow!!");
                return -1;
            }
            return d.getFirst();
        }
    }

    public static void main(String[] args) {
        Queue que = new Queue();
        que.add(1);//1
        que.add(2);//1,2
        que.add(3);//1,2,3
        que.add(4);//1,2,3,4
        que.add(5);//1,2,3,4,5

        System.out.println("Top Value: "+que.peek()); //1

        while (!que.isEmpty()) {
            System.out.println("Value: "+que.peek());
            que.remove();
        }
        System.out.println("Top Value: "+que.peek());
    }
}
