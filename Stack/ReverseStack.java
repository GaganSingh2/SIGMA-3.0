import java.util.Stack;
public class ReverseStack {
    private static void pushAtBottom(Stack<Integer> st,int top){
        if(st.isEmpty()){
            st.push(top);
            return;
        }

        int data = st.pop();
        pushAtBottom(st, top);
        st.push(data);
    }

    private static void Reverse_Stack(Stack<Integer> st){
        if(st.isEmpty()){
            return;
        }
        int top = st.pop();
        Reverse_Stack(st);
        pushAtBottom(st, top);
    }
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        stk.push(1);
        stk.push(2);
        stk.push(3);
        stk.push(4);

        Reverse_Stack(stk);
        while(!stk.isEmpty()){
            System.out.println("Value: "+stk.peek());
            stk.pop();
        }
        
    }
}
