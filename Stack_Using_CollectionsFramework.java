import java.util.*;
import java.util.Stack;

public class Stack_Using_CollectionsFramework{
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
        // while (!list.isEmpty()) {
        //     System.out.println(list.peek());
        //     list.pop();
        // }

        //Q2) Reverse the String using Stack
        
        System.out.println("Enter the String: ");
        String letter = sc.nextLine();
        String result = reverseOfString(letter);
        System.out.println("After Reversing the String: "+result);
    }
}