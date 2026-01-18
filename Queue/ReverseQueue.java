package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {
    public static void revrseQueue(Queue<Integer> q){
        Stack<Integer> stk = new Stack<>();

        while (!q.isEmpty()) {
            stk.push(q.remove());
        }
        while (!stk.isEmpty()) {
            q.add(stk.pop());
        }


        while (!q.isEmpty()) {
            System.out.print(q.peek()+" ");
            q.remove();
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        revrseQueue(q);
    }
}
