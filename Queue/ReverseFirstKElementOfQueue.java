package Queue;

import java.util.*;

public class ReverseFirstKElementOfQueue {

    public static void reverseQueue(Queue<Integer> q, int k){
        //If k more then size then with the help of this we remove extra Reversing (like k=15: k=>15%10=5)
        if(k>q.size()){
            k = k % q.size();
        }
        
        //Using Deque----------------
        Deque<Integer> dq = new ArrayDeque<>();
        //Add fist k element in Deque(Front)
        for(int i=0; i<k; i++){
            dq.addFirst(q.remove());
        }

        //Add reverse element back in queue(Reverse using Deque)
        while (!dq.isEmpty()) {
            q.add(dq.removeFirst());
        }

        //Reverse the remaining(len-k) elements in Queue
        int len = q.size();
        for(int i=0; i<len-k; i++){
            q.add(q.remove());
        }

        //Using Stack---------------------
        // Stack<Integer> stk = new Stack<>();
        // //Add First k element in stack
        // for(int i=0; i<k; i++){
        //     stk.push(q.remove());
        // }
       
        // //Add all stack value in Queue
        // while (!stk.isEmpty()) {
        //     q.add(stk.pop());
        // }

        // //Add size-k values in the same Queue again 
        // int size = q.size();
        // for(int i=0; i<size-k; i++){
        //     q.add(q.remove());
        // }
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
        q.add(80);
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