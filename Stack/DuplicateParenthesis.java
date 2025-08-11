import java.util.Scanner;
import java.util.Stack;

public class DuplicateParenthesis {
    private static boolean isContainDuplicateParenthesis(String str){
        Stack<Character> temp = new Stack<>();
        
        for(int i=0; i<str.length(); i++){
            //For Closing 
            if(str.charAt(i)==')'){
                if(temp.isEmpty()){
                    System.out.println("Un-Balanced String!");
                    return false;
                }
                int count = 0;
                while (temp.pop() != '(') {
                    count++;
                }
                if(count<1){    //Contain the Duplicate Parenthesis
                    return true;
                }
            }
            //For Opening and other Operands and Operators
            else{
                temp.push(str.charAt(i));
            }
        }
        if(!temp.isEmpty()){
            System.out.println("Un-Balanced String!");
            return false;
        } 
        return false; //Not Contain the Duplicate Parenthesis
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
