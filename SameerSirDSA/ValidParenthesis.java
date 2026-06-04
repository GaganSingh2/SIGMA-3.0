package SameerSirDSA;

import java.util.Scanner;
import java.util.Stack;

public class ValidParenthesis {
    public static boolean isValid(String str){
        if (str.charAt(0)==']' || str.charAt(0)=='}' || str.charAt(0)==')') {
            return false;
        }
        Stack<Character> stk = new Stack<>();
        for(int i=0; i<str.length(); i++){
            if (str.charAt(i)=='(' || str.charAt(i)=='[' || str.charAt(i)=='{') {
                stk.push(str.charAt(i));
            }
            else if (stk.isEmpty()) {
                return false;
            }
            else if((stk.peek()=='{' && str.charAt(i)=='}') || (stk.peek()=='[' && str.charAt(i)==']') 
                || (stk.peek()=='(' && str.charAt(i)==')')){
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
        System.out.println("Enter your String: ");
        String str = sc.next();
        System.out.println("Parenthesis is Valid: "+isValid(str));
    }
}