package TCSPractice;

import java.util.Arrays;
import java.util.Scanner;

public class ProblemStatment6 {
    public static void longestCommanPrefix(String[] str){
        Arrays.sort(str);
        StringBuilder sb = new StringBuilder("");
        
        for(int i=0; i<str[0].length(); i++){
            char ch1 = str[0].charAt(i);
            char ch2 = str[str.length-1].charAt(i);
            if(ch1 == ch2){
                sb.append(ch1);
            }
            
        }
        if (sb.length()>0) {
            System.out.println(sb.toString());
        }else{
            System.out.println("\"\"");
        }
        return;
    }
    public static void main(String[] args) {
        // Q)print the longestCommanPrefix in given string of array, if not found then print ""
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] str = new String[n];

        for(int i=0; i<n; i++){
            str[i] = sc.nextLine();
        }
        for(int i=0; i<n; i++){
            System.out.print(str[i]+" ");
        }System.out.println();
         longestCommanPrefix(str);
        
    }
}
