package Queue;

import java.util.Scanner;

public class QueueUsingArray {

    static class Queue {
        int[] arr;
        int size;
        int rear = -1;
        int front = -1;
        Queue(int size){
            this.size = size;
            arr = new int[size];
        }

        //For Checking Empty
        public boolean isEmpty(){
            return rear == -1;
        }

        //For Inserting the value O(1)
        public void push(int data){
            if(rear == arr.length-1){
                System.out.println("Overflow!!");
                return;
            }
            if(front == -1){
                front = 0;
            }
            arr[++rear] = data;
        }

        //For Removing the value O(n)
        public int pop(){
            if(isEmpty()){
                System.out.println("Underflow!!");
                return -1;
            }
            int first =  arr[front];
            for(int i=0; i<=rear-1; i++){
                arr[i] = arr[i+1];
            }
            arr[rear--] = 0;
            return first;

        }

        //For Peeking the value
        public int peek(){
            if(isEmpty()){
                System.out.println("Underflow!!!");
                return -1;
            }
            return arr[front];
        }
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of Array: ");
        int size = sc.nextInt();

        Queue que = new Queue(size);
        System.out.println("Enter the Value: ");
        for(int i=0; i<size; i++){
            que.push(sc.nextInt());
        }
        
        while (!que.isEmpty()) {
            System.out.println("Value: "+que.peek());
            que.pop();
        }
        System.out.println(que.peek());
    }
}
