import java.util.Scanner;

public class CirclularQueueUsingArray {
    static class CircularQueue {
        static int arr[];
        static int size;
        static int front;
        static int rear;

        CircularQueue(int size){
            this.size = size;
            arr = new int[size];
            front = -1;
            rear = -1;
        }

        //For Empty
        public boolean isEmpty(){
            return front == -1 && rear == -1;
        }

        //For Full
        public boolean isFull(){
            return (rear+1)%size == front;
        }

        //For Adding
        public void add(int data){
            if (isFull()) {
                System.out.println("Queue is Full!");
                return;
            }
            if(front == -1){
                front = 0;
            }
            rear = (rear + 1)%size;
            System.out.println(data+" had been inserted in Queue!");
            arr[rear] = data;
        }

        //For Removing
        public int remove(){
           
            if (isEmpty()) {
                System.out.println("Queue is Empty!!");
                return -1;
            }
            int val = arr[front];
            if (front == rear) {
                front = rear = -1;
            }
            else{
                front = (front + 1)%size;
            }
            System.out.println(val+" had been deleted from Queue!");
            return val;
        }

        //For Clear
        public void clear(){
            System.out.println("Queue Had been cleard!!");
            front = rear = -1;
        }

        //For Displaying
        public void display(){
            if (isEmpty()) {
                System.out.println("QUeue is Empty!!");
                return;
            }
            System.out.println("Data Display: ");
            for(int i=0; i<rear; i++){
                System.out.println("Value: "+arr[i]);
            }
        }

        //For Peek
        public int peek(){
            if(isEmpty())
            {
                System.out.println("Queue is Empty!!");
                return -1;
            }
            return arr[front];
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size: ");
        int size = sc.nextInt();
        CircularQueue cq = new CircularQueue(size);

        cq.add(1);
        cq.add(2);
        cq.add(3);
        cq.add(4);
        cq.add(5);
        cq.add(6);
        cq.remove();
        cq.add(6);
        System.out.println("Top Value: "+cq.peek());
    }
}
