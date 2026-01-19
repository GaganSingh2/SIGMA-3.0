package Queue;

import java.util.*;

public class GenerateBinaryNumberUsingQueue {

    public static void printAllBinaryValue(int num){
        Queue<String> q = new LinkedList<>();

        q.add("1");
        int id = 1;

        while (num-- > 0) {
            String s1 = q.peek();
            q.remove();
            System.out.println("Binary value for "+id+": "+s1);
            id++;
            String s2 = s1;
            q.add(s1 + "0");
            q.add(s2+"1");
        }
    }
    public static void main(String[] args) {
        //Q)Given a number N. The task is to generate and print all binary number with decimal value from 1 to N.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = sc.nextInt();

        printAllBinaryValue(num);
    }
}