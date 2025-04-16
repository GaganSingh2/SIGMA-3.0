import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
public class Qus_of_Queue {
    /*static class Queue{
        // 1st Way
        static Stack<Integer> list1 = new Stack<>();
        static Stack<Integer> list2 = new Stack<>();

        // public static boolean isEmpty(){
        //     return list1.isEmpty();
        // }

        // // Add - O(n)
        // public static void add(int data){
        //    while (!list1.isEmpty()) {
        //         list2.push(list1.pop());
        //    }
        //    list1.push(data);
        //    while (!list2.isEmpty()) {
        //         list1.push(list2.pop());
        //    }
        // }

        // //Remove - O(1)
        // public static int remove(){
        //     if(isEmpty()){
        //         System.out.println("Queue is Empty.");
        //         return -1;
        //     }
        //     return list1.pop();
        // }

        // // Peek - O(1)
        // public static int peek(){
        //     if (isEmpty()) {
        //         System.out.println("Queue is Empty");
        //         return -1;
        //     }
        //     return list1.peek();
        // }

        // 2nd Way-------

        public static boolean isEmpty(){
            return list1.isEmpty() && list2.isEmpty();
        }
        
        //Add O(1)
        public static void add(int data){
            list1.push(data);
        }

        // Remove (pop) O(n)
        public static int remove(){
            if(list1.isEmpty() && list2.isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            // if list2 is empty but list1 have some data
            if(list2.isEmpty()){
                while (!list1.isEmpty()) {
                    list2.push(list1.pop());
                }
            }
            return list2.pop();
        }
        
        // Peek O(n)
        public static int peek(){
            if(list1.isEmpty() && list2.isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            // if list2 is empty but list1 have some data
            if(list2.isEmpty()){
                while (!list1.isEmpty()) {
                    list2.push(list1.pop());
                }
            }
            return list2.peek();
        }
    } */
 
    static class Stack{
        static Queue<Integer> que1 = new LinkedList<>();
        static Queue<Integer> que2 = new LinkedList<>();

        public static boolean isEmpty(){
            return que1.isEmpty() && que2.isEmpty();
        }

        // 1st Approach
        // Add - O(1)
        public static void add(int data){
            if(!que1.isEmpty()){
                que1.add(data);
            }else{
                que2.add(data);
            }
        }

        // Pop - O(n)
        public static int pop(){
            if (isEmpty()) {
                System.out.println("Stack is Empty");
                return -1;
            }
            int top = -1;
            // if Queue1 is Non-empty then push the whole data in queue2
            if(!que1.isEmpty()){
                while (!que1.isEmpty()) {
                    // top = que1.remove();
                    top = que1.poll();
                    if(que1.isEmpty()){
                        break;
                    }
                    que2.add(top);
                }
            }else{ //if Queue2 is Non-empty then push the whole data in queue1
                while (!que2.isEmpty()) {
                    top = que2.remove();
                    if(que2.isEmpty()){
                        break;
                    }
                    que1.add(top);
                }
            }
            return top;
        }

        // Peek - O(n)
        public static int peek(){
            if (isEmpty()) {
                System.out.println("Stack is Empty");
                return -1;
            }
            int top = -1;
            // if Queue1 is Non-empty then push the whole data in queue2
            if(!que1.isEmpty()){
                while (!que1.isEmpty()) {
                    top = que1.remove();
                    que2.add(top);
                }
            }else{ //if Queue2 is Non-empty then push the whole data in queue1
                while (!que2.isEmpty()) {
                    top = que2.remove();
                    que1.add(top);
                }
            }
            return top;
        }

    } 

    public static void firstNon_ReaptingCharacter(String str){
        // Create a Frequency Array
        int freq[] = new int[26];

        // Create a Queue for tracking the character of string
        Queue<Character> list = new LinkedList<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            list.add(ch);

            freq[ch-'a']++;

            while (!list.isEmpty() && freq[list.peek()-'a']>1) {
                list.remove();
            }

            if (list.isEmpty()) {
                System.out.print(-1+" ");
            }
            else{
                System.out.print(list.peek()+" ");
            }
        }System.out.println();
        
    }

    public static void interleaveOf_Two_Halves(Queue<Integer> final_list){
        if(final_list.size() % 2 != 0){
            System.out.println("Size is not Even Length, So we can not generate of Interleave.");
            return;
        }
        int len = final_list.size()/2;
        Queue<Integer> newQueue = new LinkedList<>();
        for(int i=0; i<len; i++){
            newQueue.add(final_list.remove());
        }
        while (!newQueue.isEmpty()) {
            final_list.add(newQueue.remove());
            final_list.add(final_list.remove());
        }
    }

    public static void reverse_Queue(Queue<Integer> list){
        Stack temp = new Stack();
        while (!list.isEmpty()) {
            temp.add(list.remove());
        }
        while (!temp.isEmpty()) {
            list.add(temp.pop());
        }
    }

    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Q1)Implement Queue using 2 stack
        // Queue val = new Queue();
        // val.add(1);  
        // val.add(2);
        // val.add(3);
        

        // while (!val.isEmpty()) {
        //     System.out.println(val.peek());
        //     val.remove();
        // }

        // Q2) Implement Stack using 2 Queue
        // Stack stk = new Stack();
        // stk.add(1);
        // stk.add(2);
        // stk.add(3);
        // stk.add(4);

        // while (!stk.isEmpty()) {
        //     System.out.println(stk.peek());
        //     stk.pop();
        // }

        // Q3)First Non-Repeating Letter in a Stream of characters.
        // System.out.println("Enter the Streamm of Characters: ");
        // String str = sc.nextLine();
        // System.out.println("Characters is: "+str);
        // firstNon_ReaptingCharacter(str);

        // Q4)Interleave 2 Halves of Queue(even length)
        // Queue<Integer> val = new LinkedList<>();
        // val.add(1);
        // val.add(2);
        // val.add(3);
        // val.add(4);
        // val.add(5);
        // val.add(6);
        // val.add(7);
        // val.add(8);
        // val.add(9);
        // val.add(10);  
        // interleaveOf_Two_Halves(val);
        // if(val.size() % 2 == 0){
        //     System.out.println("After the InterLeave of Two Halves: ");
        //     while (!val.isEmpty()) {
        //         System.out.print(val.peek()+" ");
        //         val.remove();
        //     }
        // }
       
        //Q5)Reverse Queue
        // Queue<Integer> list = new LinkedList<>();
        // list.add(1);
        // list.add(2);
        // list.add(3);
        // list.add(4);
        // list.add(5);
        
        // reverse_Queue(list);
        // while (!list.isEmpty()) {
        //     System.out.print(list.peek()+" ");
        //     list.remove();
        // }


        

    }
}
