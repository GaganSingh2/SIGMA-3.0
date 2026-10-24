package InterviewPrepration.ThinkCare;

import java.util.Scanner;

public class FirstNonRepeatedCharacter {
    public  static void firstNonRepeatedCharacter(String str){
        int freq[] = new int[26];
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            freq[ch - 'a']++;
        }
        char res = ' ';
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(freq[ch-'a'] == 1){
                res = ch;
                break;
            }
        }
        if(res == ' '){
            System.out.println("None");
        }
        else{
            System.out.println(res);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        firstNonRepeatedCharacter(str);
    }
}
