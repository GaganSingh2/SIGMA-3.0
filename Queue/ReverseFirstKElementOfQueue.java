package Queue;

import java.util.*;

public class ReverseFirstKElementOfQueue {

    public static void reverseQueue(Queue<Integer> q, int k){
        //Using Stack---------------------
        Stack<Integer> stk = new Stack<>();
        //Add First k element in stack
        for(int i=0; i<k; i++){
            stk.push(q.remove());
        }
       
        //Add all stack value in Queue
        while (!stk.isEmpty()) {
            q.add(stk.pop());
        }

        //Add size-k values in the same Queue again 
        int size = q.size();
        for(int i=0; i<size-k; i++){
            q.add(q.remove());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.add(70);
        q.add(50);
        q.add(90);
        q.add(100);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the K value: ");
        int k = sc.nextInt();
        reverseQueue(q, k);

        //Print
        while (!q.isEmpty()) {
            System.out.println("Value: "+q.peek());
            q.poll();
        }
    }
}