import java.util.Scanner;
import java.util.Stack;
public class ValidParenthesis {
    private static boolean isValidParenthesis(String str){
        Stack<Character> stk = new Stack<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch=='{' || ch=='(' || ch=='['){
                stk.push(ch);
            }
            else if(stk.isEmpty()){
                return false;
            }
            else if((ch=='}' && stk.peek()=='{') || (ch==')' && stk.peek()=='(') 
            || (ch==']' && stk.peek()=='[')){
                
                stk.pop();
            }
        }
        if(stk.isEmpty()){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Parenthesis: ");
        String str = sc.nextLine();

        System.out.println("Parenthesis: "+str);

        boolean res = isValidParenthesis(str);
        if(res) System.out.println(str+" is a Valid Parenthesis Format!");
        else System.out.println(str+" is not a Valid Parenthesis Format!");
    }
}
