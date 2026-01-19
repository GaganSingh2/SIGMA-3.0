package Queue;

import java.util.Deque;
import java.util.LinkedList;

//Deque(Double Ended Queue means we perform each operation on both end)
public class DoubleEndedQueue {
    
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();

        deque.addFirst(1); //1
        deque.addFirst(2);// 2,1
        System.out.println(deque); //2,1

        deque.addLast(3);//2,1,3
        deque.addLast(4);//2,1,3,4
        System.out.println(deque);//2,1,3,4

        System.out.println("Remove Last ELe: "+deque.removeLast());//4

        System.out.println(deque);//2,1,3

        System.out.println("Remove First Ele: "+deque.removeFirst());//2

        System.out.println(deque);//1,3

        System.out.println("Peek First Ele: "+deque.getFirst());//1

        System.out.println("Peek Last Ele: "+deque.getLast());//3
    }
}
