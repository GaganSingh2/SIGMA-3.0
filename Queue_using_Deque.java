import java.util.Queue;
import java.util.Deque;
import java.util.LinkedList;
public class Queue_using_Deque {
    static class Queue{

        Deque<Integer> list = new LinkedList<>();
        public void push(int data){
            list.addLast(data);
        }

        public int pop(){
            return list.removeFirst();
        }

        public int peek(){
            return list.getFirst();
        }
    }
    public static void main(String[] args) {
        Queue val = new Queue();

        val.push(1);
        val.push(2);
        val.push(3);

        System.out.println("Top Value in Deque: "+val.peek());
        System.out.println("Value is: "+val.pop());
        System.out.println("Value is: "+val.pop());
        System.out.println("Value is: "+val.pop());
    }
}
