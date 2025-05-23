import java.util.*;
import java.util.Stack;

public class Stack_Using_CollectionsFramework {
    public static void printStack(Stack<Integer> list) {
        while (!list.isEmpty()) {
            System.out.println(list.peek());
            list.pop();
        }
    }

    public static void pushAtBottom(Stack<Integer> sb, int data) {
        if (sb.isEmpty()) {
            sb.push(data);
            return;
        }
        int top = sb.pop();
        pushAtBottom(sb, data);
        sb.push(top);
    }

    public static String reverseOfString(String letter) {
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

    public static void reverseOfStack(Stack<Integer> list) {

        if (list.isEmpty()) {
            return;
        }
        int top = list.pop();
        reverseOfStack(list);
        pushAtBottom(list, top);

    }

    public static void stockSpan(int stock[], int span[]) { // O(n)
        Stack<Integer> list = new Stack<>();
        span[0] = 1;
        list.push(0);

        for (int i = 1; i < stock.length; i++) {
            int currPrice = stock[i];
            while (!list.isEmpty() && currPrice >= stock[list.peek()]) {
                list.pop();
            }
            if (list.isEmpty()) {
                span[i] = i + 1;

            } else {
                int prevHigh = list.peek();
                span[i] = i - prevHigh;
            }
            list.push(i);
        }
    }

    public static int[] nextGreater(int arr[]) {
        int len = arr.length;
        int nxtGreater[] = new int[len];
        Stack<Integer> val_track = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            // for track the stack
            while (!val_track.isEmpty() && arr[val_track.peek()] <= arr[i]) {
                val_track.pop();
            }
            // when the stack is empty
            if (val_track.isEmpty()) {
                nxtGreater[i] = -1;
            } else {
                nxtGreater[i] = arr[val_track.peek()];
            }
            val_track.push(i);

        }

        return nxtGreater;
    }

    public static boolean isValidParenthesis(String bracket) {
        if(bracket.length()%2 != 0){
            return false;
        }
        Stack<Character> tracker = new Stack<>();

        for (int i = 0; i < bracket.length(); i++) {
            char ch = bracket.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                tracker.push(ch);
            } else {
                if (tracker.isEmpty()) {
                    return false;
                }
                if((tracker.peek()=='(' && ch==')') || tracker.peek()=='[' && ch==']' || tracker.peek()=='{' && ch=='}'){
                    tracker.pop();
                }else{
                    return false;
                }
            }
        }
        if (!tracker.isEmpty()) {
            return false;
        }
        return true;
    }

    public static boolean isDuplicateParenthesis(String brackets){
        Stack<Character> track = new Stack<>();

        for(int i=0; i<brackets.length(); i++){
            char ch = brackets.charAt(i);
            //for closing parenthsis
            if (ch == ')') {
                int count = 0;
                while (track.pop() != '(') {
                    
                    count++;
                }
                if (count < 1) {
                    return true;
                }
            }
            //for opening and other values
            else{
                track.push(ch);
            }
        }
        return false;
    }

    public static int maxAreaHistogram(int arr[]){  //TC: O(n)
        int len = arr.length;

        int maxArea = 0;
        int nsR[] = new int[len];
        int nsL[] = new int[len];
        Stack<Integer> track = new Stack<>();

        //Next Smaller Right
        for(int i=len-1; i>=0; i--){
            while (!track.isEmpty() && arr[track.peek()] >= arr[i]) {
                track.pop();
            }
            if (track.isEmpty()) {
                nsR[i] = len;
            }else{
                nsR[i] = track.peek();
            }
            track.push(i);
        }

        //Next Smaller Left
        track = new Stack<>();
        for(int i=0; i<len; i++){
            while (!track.isEmpty() && arr[track.peek()] >= arr[i]) {
                track.pop();
            }
            if (track.isEmpty()) {
                nsL[i] = -1;
            }else{
                nsL[i] = track.peek();
            }
            track.push(i);
        }
        
        //find the currAreA: width=j-i-1 => nsR[i]-nsL[i]-1
        for(int i=0; i<len; i++){
            int height = arr[i];
            int width = nsR[i] - nsL[i] - 1;
            int currArea = height * width;
            maxArea = Math.max(maxArea, currArea);
        }
        return maxArea;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> list = new Stack<>();

        list.push(1);
        list.push(2);
        list.push(3);

        // Q1) Push the data at the bottom of the stack
        // System.out.print("Enter the Data: ");
        // int data = sc.nextInt();
        // pushAtBottom(list, data);

        // System.out.println("After the Pushing the DAta At Bottom: ");
        // printStack(list);

        // Q2) Reverse the String using Stack

        // System.out.println("Enter the String: ");
        // String letter = sc.nextLine();
        // String result = reverseOfString(letter);
        // System.out.println("After Reversing the String: "+result);

        // Q3) Reverse the Stack
        // Before: 3->2->1 & After: 1->2->3
        // System.out.println("After Reversing the Stack: ");
        // reverseOfStack(list);
        // printStack(list);

        // Q4) Stock Span Problem
        // System.out.println("Enter the length: ");
        // int len = sc.nextInt();
        // int stock[] = new int[len];
        // System.out.println("ENter the Value: ");
        // for(int i=0; i<stock.length; i++){
        // stock[i] = sc.nextInt();
        // }
        // int span[] = new int[stock.length]; //for tracking the max days

        // stockSpan(stock,span);
        // System.out.println("Span is: ");
        // for(int i=0; i<span.length; i++){
        // System.out.print(span[i]+" ");
        // }

        // Q5) Next Greater ELement
        // System.out.println("ENter the length: ");
        // int len = sc.nextInt();
        // int arr[] = new int[len];

        // System.out.println("Enter the value: ");
        // for (int i = 0; i < len; i++) {
        // arr[i] = sc.nextInt();
        // }
        // System.out.println("Array: ");
        // for (int i = 0; i < len; i++) {
        // System.out.print(arr[i] + " ");
        // }System.out.println();
        // int nxtGreater[] = nextGreater(arr);

        // System.out.println("Next Greater Array: ");
        // for (int i = 0; i < len; i++) {
        // System.out.print(nxtGreater[i] + " ");
        // }

        // Q6)Valid Parenthesis
        // System.out.println("Enter the Brackets: ");
        // String brackets = sc.nextLine();

        // Boolean res = isValidParenthesis(brackets);
        // if (res==true) {
        //     System.out.println("Brackets "+brackets+" are the correct order");
        // }
        // else{
        //     System.out.println("Brackets "+brackets+" are not the correct order");
        // }

        //Q7)Duplicate Parenthsis
        // System.out.println("Enter the Brackets: ");
        // String brackets = sc.nextLine();

        // Boolean res = isDuplicateParenthesis(brackets);
        // if (res==true) {
        //     System.out.println("String "+brackets+" can be contain the duplicate parenthesis");
        // }
        // else{
        //     System.out.println("String "+brackets+" can not be contain the duplicate parenthsis");
        // }

         //Q8) MaxArea in a given Histogram
        //  System.out.println("Enter the length: ");
        //  int len = sc.nextInt();
        //  int height[] = new int[len];
        //  System.out.println("Enter the Heights: ");
        //  for (int i = 0; i < len; i++) {
        //      height[i] = sc.nextInt();
        //  }
 
        //  System.out.println("Heights: ");
        //  for (int i = 0; i < len; i++) {
        //      System.out.print(height[i] + " ");
        //  }System.out.println();

        //  int maxArea = maxAreaHistogram(height);
        //  System.out.println("Maximum Area of Histogram: "+maxArea);

         //TC: O(n)
         //SC: O(n)

         
    }
}