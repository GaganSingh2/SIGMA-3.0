public class CircularQueue_Using_Array {
    static class Queue{
        static int arr[];
        static int size;
        static int front;
        static int rear;
        Queue(int len){
            arr = new int[len];
            size = len;
            front = -1;
            rear = -1;
        }

        //Queue is Empty
        public static boolean isEmpty(){
            return rear == -1 && front == -1;
        }

        //Queue is Full
        public static boolean isFull(){
            return (rear+1)%size == front;
        }

        //Add
        public static void add(int data){  //O(1)
            if (isFull()) {
                System.out.println("Queue is Full");
                return;
            }
            //add 1st element in the Queue
            if(front == -1){
                front = 0;
            }
            rear = (rear+1)%size;
            arr[rear] = data;
        }

        //Remove
        public static int remove(){   //O(1)
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            int top = arr[front];
            if (rear == front) {
                rear = front = -1;
            }else{
                front = (front+1)%size;
            }
            return top;
        }

        //Return top element in Queue
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty.");
                return -1;
            }
            return arr[front];
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue(3);

        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());
        q.add(5);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
        
    }
}
