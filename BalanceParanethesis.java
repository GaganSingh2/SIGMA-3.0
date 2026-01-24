import java.util.Stack;
import java.util.*;
public class BalanceParanethesis {
    static boolean isBalanceUsingArray(String paranthesis){
        char arr[] = new char[paranthesis.length()];
        int top = -1;
        // boolean flag = true;
        for(int i=0; i<paranthesis.length(); i++){
            char ch = paranthesis.charAt(i);
            if(ch=='(' || ch=='[' || ch=='{'){
                arr[++top] = ch;
            }
            else if((ch==')' && top==-1) || (ch==']' && top==-1) || (ch=='}' && top==-1)){
                return false;
            }
            else if((ch==')' && arr[top]=='('  && top != -1) || (ch==']' && arr[top]=='['  && top != -1) || 
            (ch=='}' && arr[top]=='{'  && top != -1) ){
                top--;
            }
            
        }
        if (top!=-1) {
            return false;
        }
        return true;
    }
    static boolean isBalanceUsingStack(String paranthesis){
        if(paranthesis.charAt(0)==')'){
            return false;
        }
        Stack<Character> stk = new Stack<>();
        for(int i=0; i<paranthesis.length(); i++){
            char ch = paranthesis.charAt(i);
            if(ch=='(' || ch=='[' || ch=='{'){
                stk.push(ch);
            }
            else if(stk.isEmpty()){
                return false;
            }
            else if((ch==')' && stk.peek()=='(') || (ch=='}' && stk.peek()=='{') || (ch==']' && stk.peek()=='[')){
                stk.pop();
            }
        }
        if(!stk.isEmpty()){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(isBalanceUsingArray(str));
    }
}
