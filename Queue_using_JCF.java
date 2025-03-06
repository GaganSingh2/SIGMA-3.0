import java.util.Queue;
import java.util.ArrayDeque;
import java.util.LinkedList;
public class Queue_using_JCF {
    public static void main(String[] args) {
        // Queue can be implement using JCF in 2 ways: 1)Using LinkedList 2)Using ArrayDeque
        // 1)Using Linkedlist
        // Queue<Integer> list = new LinkedList<>();

        // 2)Using ArrayDeque
        Queue<Integer> list = new ArrayDeque<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.remove();
        list.add(1);

        while (!list.isEmpty()) {
            System.out.println(list.peek());
            list.remove();
        }
    }
}
