package InterviewPrepration.PhaseZeroAI;

import java.util.Scanner;

public class ToggleString {
    public static String toggleString(String str){
        StringBuilder sb = new StringBuilder("");
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
             ch -= 32; //Convert in UpperCase
            }
            else if(ch >='A' && ch <='Z'){
                ch += 32; //Convert in LowerCase
            }
            sb.append(ch);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.nextLine();
       String result =  toggleString(str);
       System.out.println(result);
    }
}
