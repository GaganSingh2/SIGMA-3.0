import java.util.Scanner;
import java.util.Stack;
public class ValidParenthesis {

    public static boolean isValidParenthesis(String bracket){
        Stack<Character> stk = new Stack<>();

        for(int i=0; i<bracket.length(); i++){
            char ch = bracket.charAt(i);
            if(ch=='[' || ch=='(' || ch=='{'){ //Open Bracket put into Stack
                stk.push(ch);
            }
            else if(stk.isEmpty()){ //if String remaining but stack is Empty means compare then closing bracket, opening bracket are less  (Invalid)
                return false;
            }
            else if((ch==']' && stk.peek()=='[') || (ch==')' && stk.peek()=='(') || (ch=='}' && stk.peek()=='{')){ //Closing bracket if match the top of stk bracket then matching find and pop the opening bracket from stk
                    stk.pop();
            }
        }
        if(!stk.isEmpty()){ //if stack is not empty but string are empty means compare then opening bracket, closing bracket are less (Invalid)
            return false;
        }
        return true; //if stk is empty and string is also empty means (Valid)
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Brackets: ");
        String breacket = sc.next();
        if (isValidParenthesis(breacket)) {
            System.out.println("Valid Parenthesis!!");
        }
        else{
            System.out.println("Invalid Parenthesis!!");
        }
    }
}
