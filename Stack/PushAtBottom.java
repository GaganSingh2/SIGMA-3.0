import java.util.Scanner;
import java.util.Stack;
class PushAtBottom {

    public static void PushAtBottom(Stack<Integer> list, int data){
        if(list.isEmpty()){
            list.push(data);
            return;
        }
        int top = list.pop();
        PushAtBottom(list,data);
        list.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        stk.push(1);
        stk.push(2);
        stk.push(3);

        PushAtBottom(stk,4);
        while (!stk.isEmpty()) {
            System.out.println(stk.peek());
            stk.pop();
        }
    }
}
