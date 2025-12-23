import java.util.Stack;
public class ReverseStack {
    public static void pushAtBottom(Stack<Integer> tmp, int data){
        if(tmp.isEmpty()){
            tmp.push(data);
            return;
        }

        int top = tmp.pop();
        pushAtBottom(tmp, data);
        tmp.push(top);
    }

    public static void revStack(Stack<Integer> tmp){
        if(tmp.isEmpty()){
            return;
        }
        int top = tmp.pop();
        revStack(tmp);
        pushAtBottom(tmp, top);
    }

    public static void printStack(Stack<Integer> tmp){
        while (!tmp.isEmpty()) {
            System.out.println("Top Value: "+tmp.peek());
            tmp.pop();
        }
    }
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        stk.push(1);
        stk.push(2);
        stk.push(3);
        //3 2 1
        revStack(stk);
        printStack(stk);
        //1 2 3
    }
}
