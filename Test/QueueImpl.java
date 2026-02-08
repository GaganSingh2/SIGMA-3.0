package Test;

import java.util.Scanner;

public class QueueImpl {
    static class Queue{
         int arr[];
        int front;
        int rear;
        int size;

        Queue(int size){
            this.size = size;
            this.arr = new int[size];
            this.front = -1;
            this.rear = -1;
        }

        //isEmpty
        public boolean isEmpty(){
            return front == -1 && rear == -1;
        }
        
        //isFull
        public boolean isFull(){
            return (rear+1)%size == front;
        }

        //Push
        public void add(int data){
            if(isFull()){
                System.out.println("Queue is Full!");
            }
            else{
                // size++;
                if(front == -1){
                    front++;
                }
                rear = (rear+1)%size;
                arr[rear] = data;
                System.out.println(data+" had been inserted in Queue!");
            }
        }

        //Pop
        public void remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty!!");
            }
            else{
                System.out.println(arr[front]);
                if (rear == front) {
                    rear = front = -1;
                }
                front = (front+1)%size;
            }
        }

        //Peek
        public void peek(){
            if (isEmpty()) {
                System.out.println("Queue is Empty");
            }
            else{
                System.out.println(arr[front]+" First Value in QUeue");
            }
        }

        //Display
        public void display(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
            }
            else{
                System.out.println("Data Display");
                for(int i=0; i<=rear; i++){
                    System.out.println("Value: "+arr[i]);
                }
            }
        }

        //Clear
        public void clear(){
            System.out.println("Queue is Clear!");
            front = rear = -1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        Queue q = new Queue(size);
        q.add(3);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(10);
        q.add(15);
        q.display();
        q.peek();
        q.clear();
        q.display();
        q.add(45);
        q.peek();
    }
}
