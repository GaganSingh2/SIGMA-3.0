package Queue;

import java.util.Scanner;

public class CircularQueueUsingArray {

    static class CircularQueue {
    
        static int size;
        static int arr[];
        static int front;
        static int rear;

        CircularQueue(int size){
            this.size = size;
            arr = new int[size];
            front = -1;
            rear = -1;
        }

        //For Empty
        public static boolean isEmpty(){
            return front == -1 && rear == -1;
        }

        //For Full
        public static boolean isFull(){
            return (rear+1)%size == front;
        }

        //For Adding the value
        public static void push(int data){
            if(isFull()){
                System.out.println("Overflow!!!");
                return;
            }
            //add 1st element
            if (front==-1) {
                front = 0;
            }
            rear = (rear+1) % size;
            arr[rear] = data;
        }

        //For Removing the value
        public static int pop(){
            if (isEmpty()) {
                System.out.println("UnderFlow!!");
                return -1;
            }

            int result = arr[front];
            //last element delete in queue
            if(rear == front){
                rear = front = -1;
            }
            else{
                front = (front+1)%size;
            }
            return result;
        }

        //For Check the value
        public static int peek(){
            if (isEmpty()) {
                System.out.println("UnderFlow!!");
                return -1;
            }
            return arr[front];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of Array: ");
        int size = sc.nextInt();

        CircularQueue cq = new CircularQueue(size);
        cq.push(1);
        cq.push(2);
        cq.push(3);

        System.out.println(cq.pop());
        cq.push(4);
        System.out.println(cq.pop());
        cq.push(5);

        while (!cq.isEmpty()) {
            System.out.println(cq.peek());
            cq.pop();
        }
    }
}
