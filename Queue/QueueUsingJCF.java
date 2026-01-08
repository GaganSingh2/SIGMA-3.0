package Queue;

import java.util.*;

public class QueueUsingJCF {
    public static void main(String[] args) {
        //We Implement Queue using to Implementation classes
        //1)Using LinkedList
        Queue<Integer> que = new LinkedList<>();

        que.add(3);
        que.add(1);
        que.add(2);
        que.add(5);
        que.add(6);

        while (!que.isEmpty()) {
            System.out.println("Value: "+que.peek());

            que.poll();
        }

        //2)Using ArrayDeque
        Queue<Integer> q = new ArrayDeque<>();

        q.add(3);
        q.add(1);
        q.add(2);
        q.add(5);
        q.add(6);

        while (!q.isEmpty()) {
            System.out.println("Value: "+q.peek());

            q.poll();
        }
    }
}
