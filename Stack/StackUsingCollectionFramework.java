import java.util.Stack;
public class StackUsingCollectionFramework {
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();

        //Push the values
        stk.push(10);
        stk.push(20);
        stk.push(30);
        stk.push(40);
        stk.push(50);
        
        //Print the values
        while (!stk.isEmpty()) {
            System.out.println("Value: "+stk.peek()); //Print the top element
            stk.pop(); //Remove the top element
        }
    }
}
