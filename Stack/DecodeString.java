import java.util.Scanner;
import java.util.Stack;
public class DecodeString {

    public static String decodeString(String s){
        //1st Step: create 2 variable and 2 stack
        String currStr = "";
        int currNum = 0;
        Stack<Integer> num = new Stack<>();
        Stack<String> str = new Stack<>();
        int openBraket = 0, closeBraket = 0;
        
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            //1st step: if i==digit then assign into the currNum variable
            if(Character.isDigit(ch)){
                currNum = currNum * 10 + (ch-'0');
                // System.out.println("num: "+currNum);
            }

            //2nd Step: if i=='[' then push currNum into numStack and currStr into strStack, then re-initialise both variable 
            else if(ch=='['){
                openBraket++;
                num.push(currNum);
                str.push(currStr);
                currNum = 0;
                currStr = "";
            }
            //3rd Step: if i=='charcter' then asign into the currString variable
            else if(ch>='a' && ch<='z'){
                currStr += ch;
                // System.out.println("CurrStr: "+currStr);
            }
            //4th Step: if i==']' then pop numStack and pop strStack
            else if(ch==']'){
                closeBraket++;
                int count = num.pop();
                String prevStr = str.pop();
                //Repeat currStr count times
                String tmp = currStr;
                for(int j=1; j<count; j++){
                    currStr += tmp;
                }
                // System.out.println("CurrStr: "+currStr);
                //append the currStr to the prevStr--
                prevStr += currStr;
                //append the prevStr to the currStr--
                currStr = "";
                currStr += prevStr;
                prevStr = "";
            }

        }
        if(openBraket != closeBraket){ //if closing bracket are not equal to open bracket means given code is Invalid!!
            return "Invalid Code!!";
        }
        return (currStr.length()>0)?currStr:"EmptyString";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.next();
        System.out.println("Encoded String: "+str);
        String res = decodeString(str);
        System.out.println("Decode String: "+res);
    }
}
