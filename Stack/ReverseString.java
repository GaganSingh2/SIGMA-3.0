import java.util.Scanner;
import java.util.Stack;
public class ReverseString {
    public static String reverseOfString(String str){
        if(str.length()==1){
            return str;
        }

        Stack<Character> temp = new Stack<>();
        int idx = 0;
        while (idx<str.length()) {
            char ch = str.charAt(idx);
            temp.push(ch);
            idx++;
        }

        StringBuilder sb = new StringBuilder("");
        while(!temp.isEmpty()){
            char ch = temp.pop();
            sb.append(ch);
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String: ");
        String str = sc.nextLine();

        System.out.println("Before Reversing the String: "+str);

        String res = reverseOfString(str);
        System.out.println("After Reversing the String: "+res);
    }
}
