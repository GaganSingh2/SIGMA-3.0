import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.*;
public class Prac_Qus_Queue {
    public static Queue<Integer> reverseFirstKInteger(Queue<Integer> list,int k){
        if (list.size() == 1 || k<=0 || k>list.size()) {
            return list;
        }

        Stack<Integer> temp = new Stack();
        
        for(int i=0; i<k; i++){
            temp.push(list.remove());
        }
        while (!temp.isEmpty()) {
            list.add(temp.pop());
        }
        int len = list.size();
        for(int i=0; i<len-k; i++){
            list.add(list.remove());
        }
        return list;

    }
    public static void main(String[] args) {
        // Q1)Reversing the first K elements of a Queue.We have an integer k and a queue of integers,we need to reverse the order of the  first k elements of the queue, leaving the other elements in the same relative order.

        Queue<Integer> val = new LinkedList<>();
        int k = 4;
        val.add(10);
        val.add(20);
        val.add(30);
        val.add(40);
        val.add(50);
        val.add(60);
        val.add(70);
        
        
        Queue<Integer> res = new LinkedList<>();
        res = reverseFirstKInteger(val, k);
        while (!res.isEmpty()) {
            System.out.print(res.remove()+" ");
        }
    }
}
