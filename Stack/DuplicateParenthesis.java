
import java.util.Scanner;
import java.util.Stack;

public class DuplicateParenthesis {
    private static boolean isContainDuplicateParenthesis(String str){
        Stack<Character> stk = new Stack<>();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch==')'){
                if(stk.isEmpty()){ // if stack is empty and String have value means pair is not available
                    return true;
                }
                else{
                    int cnt = 0;
                    while (stk.pop() != '(') { //if ch = ')' so he check how many operator or operand are available between the opening and closing 
                        cnt++;
                    }
                    if(cnt<1){ //between open and closing bracket any operand or operator are not available then String is Invalid
                        return true;
                    }
                }
            }
            else{
                stk.push(ch);
            }
        }
        //If String is empty but stack have some value means String are Invalid
        if(!stk.isEmpty()){
            return true;
        }
        return false; //String are Valid
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.next();

        boolean res = isContainDuplicateParenthesis(str);
        if(res) System.out.println(str+" Contain the Duplicate Parenthesis!");
        else System.out.println(str+" Not Contain the Duplicate Parenthesis!");
    }
}
