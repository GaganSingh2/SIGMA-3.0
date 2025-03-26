import java.util.Stack;
import java.util.Deque;
import java.util.LinkedList;
public class Stack_Using_Deque {
    static class Stack{
        Deque<Integer> list = new LinkedList<>();
        public void push(int data){
            list.addLast(data);
        }

        public int pop(){
            return list.removeLast();
        }

        public int peek(){
            return list.getLast();
        }
    }
    public static void main(String[] args) {
        Stack temp = new Stack();

        temp.push(1);
        temp.push(2);
        temp.push(3);

        System.out.println("Peek of the value in Deque: "+temp.peek());
        System.out.println("value is: "+temp.pop());
        System.out.println("value is: "+temp.pop());
        System.out.println("value is: "+temp.pop());
        
    }
}
