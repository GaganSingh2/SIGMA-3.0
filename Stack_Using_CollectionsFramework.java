import java.util.*;
import java.util.Stack;

public class Stack_Using_CollectionsFramework{
    public static void main(String[] args) {
        Stack<Integer> list = new Stack<>();

        list.push(1);
        list.push(2);
        list.push(3);

        while (!list.isEmpty()) {
            System.out.println(list.peek());
            list.pop();
        }

    }
}