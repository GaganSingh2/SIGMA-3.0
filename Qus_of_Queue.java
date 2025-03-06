import java.util.Queue;
import java.util.Stack;
public class Qus_of_Queue {
    static class Queue{
        // 1st Way
        static Stack<Integer> list1 = new Stack<>();
        static Stack<Integer> list2 = new Stack<>();

        public static boolean isEmpty(){
            return list1.isEmpty();
        }

        // Add - O(n)
        public static void add(int data){
           while (!list1.isEmpty()) {
                list2.push(list1.pop());
           }
           list1.push(data);
           while (!list2.isEmpty()) {
                list1.push(list2.pop());
           }
        }

        //Remove - O(1)
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty.");
                return -1;
            }
            return list1.pop();
        }

        // Peek - O(1)
        public static int peek(){
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            return list1.peek();
        }
    }
    public static void main(String[] args) {
        // Q1)Implement Queue using 2 stack
        Queue val = new Queue();
        val.add(1);
        val.add(2);
        val.add(3);

        while (!val.isEmpty()) {
            System.out.println(val.peek());
            val.remove();
        }
    }
}
