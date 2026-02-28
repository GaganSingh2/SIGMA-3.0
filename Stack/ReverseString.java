import java.util.Scanner;
import java.util.Stack;
public class ReverseString {
    public static String revStr(String str){
        Stack<Character> temp = new Stack<>();
        StringBuilder sb = new StringBuilder("");
        int i = 0;
        while (i <= str.length()-1) {
            temp.push(str.charAt(i));
            i++;
        }
        while (!temp.isEmpty()) {
            sb.append(temp.peek());
            temp.pop();
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();

        System.out.println("Before Reversing the String: "+str);
        System.out.println("After Reversing the String: "+revStr(str));
    }
}
