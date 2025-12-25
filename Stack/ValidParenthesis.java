import java.util.Scanner;
import java.util.Stack;
public class ValidParenthesis {

    //Using Repeated Parenthesis(){}[] are replace with ""(empty string). TC: O(n^2)(contains take O(n) and replace take O(n)), SC:O(n)(each time create String)
    public static boolean isValidParenthesisUsingReplaceApproach(String bracket){
        //// Keep removing valid pairs until no more exist
        while (bracket.contains("()") || bracket.contains("[]") || bracket.contains("{}")) {
            bracket = (bracket.replace("()",""))
                        .replace("[]","")
                        .replace("{}", "");
        }

        //if string is empty means Valid Parenthesis, Otherwise Invalid Parenthesis
        return bracket.isEmpty();
    }

    //Using Stack TC: O(n), SC: O(n)
    public static boolean isValidParenthesisUsingStack(String bracket){
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
        if (isValidParenthesisUsingReplaceApproach(breacket)) {
            System.out.println("Valid Parenthesis!!");
        }
        else{
            System.out.println("Invalid Parenthesis!!");
        }
    }
}
