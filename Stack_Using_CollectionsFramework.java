import java.util.*;
import java.util.Stack;

public class Stack_Using_CollectionsFramework{
    public static void printStack(Stack<Integer> list){
        while (!list.isEmpty()) {
            System.out.println(list.peek());
            list.pop();
        }
    }

    public static void pushAtBottom(Stack<Integer> sb,int data){
        if (sb.isEmpty()) {
            sb.push(data);
            return;
        }
        int top = sb.pop(); 
        pushAtBottom(sb, data);
        sb.push(top);
    }

    public static String reverseOfString(String letter){
        Stack<Character> ch = new Stack<>();
        int idx = 0;
        while (idx < letter.length()) {
            ch.push(letter.charAt(idx));
            idx++;
        }

        StringBuilder sb = new StringBuilder("");
        while (!ch.isEmpty()) {
            char curr = ch.pop();
            sb.append(curr);
        }
        return sb.toString();

    }

    public static void reverseOfStack(Stack<Integer> list){
        
        if(list.isEmpty()){
            return;
        }
        int top = list.pop();
        reverseOfStack(list);
        pushAtBottom(list, top);

    }

    public static void stockSpan(int stock[],int span[]){
        Stack<Integer> list = new Stack<>();
        span[0] = 1;
        list.push(0);

        for(int i=1; i<stock.length; i++){
            int currPrice = stock[i];
            while (!list.isEmpty() && currPrice >= stock[list.peek()]) {
                list.pop();
            }
            if (list.isEmpty()) {
                span[i] = i+1;
                
            }else{
                int prevHigh = list.peek();
                span[i] = i-prevHigh;
            }
            list.push(i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> list = new Stack<>();

        list.push(1);
        list.push(2);
        list.push(3);

        //Q1) Push the data at the bottom of the stack
        // System.out.print("Enter the Data: ");
        // int data = sc.nextInt();
        // pushAtBottom(list, data);

        // System.out.println("After the Pushing the DAta At Bottom: ");
        // printStack(list);
        

        //Q2) Reverse the String using Stack
        
        // System.out.println("Enter the String: ");
        // String letter = sc.nextLine();
        // String result = reverseOfString(letter);
        // System.out.println("After Reversing the String: "+result);

        //Q3) Reverse the Stack
        //Before: 3->2->1 & After: 1->2->3
        // System.out.println("After Reversing the Stack: ");
        // reverseOfStack(list);
        // printStack(list);

        //Q4) Stock Span Problem
        System.out.println("Enter the length: ");
        int len = sc.nextInt();
        int stock[] = new int[len];
        System.out.println("ENter the Value: ");
        for(int i=0; i<stock.length; i++){
            stock[i] = sc.nextInt();
        }
        int span[] = new int[stock.length]; //for tracking the max days

        stockSpan(stock,span);
        System.out.println("Span is: ");
        for(int i=0; i<span.length; i++){
            System.out.print(span[i]+" ");
        }
    }
}