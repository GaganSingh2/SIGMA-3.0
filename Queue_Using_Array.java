import java.util.Queue;
public class Queue_Using_Array {
    static class Queue{
        static int arr[];
        static int size;
        static int rear;
        Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
        } 

        //CHeck Queue is Empty or not
       public static boolean isEmpty(){
            return rear == -1;
       }
       //Add the element
       public static void add(int data){
            if(rear == size-1){
                System.out.println("Queue is Full.");
                return;
            }
            rear++;
            arr[rear] = data;
       }

       //Remove the element
       public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            int front = arr[0];
            for(int i=0; i<rear; i++){   //O(n)
                arr[i] = arr[i+1];
            }
            rear--;         //rear ko current ke index pe bhejne ke liye
            return front;
       }

       //Return Peek of the Queue
       public static int peek(){
            if (isEmpty()) {
                System.out.println("Queue is Empty.");
                return -1;
            }
            return arr[0];

       }
    }
    public static void main(String[] args) {
        Queue q = new Queue(5);

        q.add(2);
        q.add(4);
        q.add(1);
        q.add(9);
        q.add(4);
        q.remove();
        q.add(9);
        
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
        
    }
}
