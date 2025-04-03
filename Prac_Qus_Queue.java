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

    public static void generateAllBinary(int val){
        if(val == 1){
            System.out.println("1");
            return;
        }
        if(val<1){
            System.out.println("Invalid Value!");
            return;
        }

        Queue<String> li = new LinkedList<String>();
        li.add("1");
        while (val-- > 0) {
            String s1 = li.peek();
            li.remove();
            System.out.println(s1);
            String s2 = s1;
            li.add(s1 + "0");
            li.add(s2 + "1");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Q1)Reversing the first K elements of a Queue.We have an integer k and a queue of integers,we need to reverse the order of the  first k elements of the queue, leaving the other elements in the same relative order.

        // Queue<Integer> val = new LinkedList<>();
        // int k = 4;
        // val.add(10);
        // val.add(20);
        // val.add(30);
        // val.add(40);
        // val.add(50);
        // val.add(60);
        // val.add(70);
        
        // Queue<Integer> res = new LinkedList<>();
        // res = reverseFirstKInteger(val, k);
        // System.out.println("Queue After the Reversing the kth Pos: ");
        // while (!res.isEmpty()) {
        //     System.out.print(res.remove()+" ");
        // }

        // Q2)Given a number N.The task is to generate and print all binary numbers with decimal val ues from1 to N.
        System.out.print("Enter the value of N: ");
        int n = sc.nextInt();

        generateAllBinary(n);
    }
}
