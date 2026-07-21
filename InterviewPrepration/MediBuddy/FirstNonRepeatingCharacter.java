package InterviewPrepration.MediBuddy;

import java.util.HashMap;
import java.util.Scanner;

public class FirstNonRepeatingCharacter {
    public static char firstNonRepeatingCharacter(String str){
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        for(char ch: map.keySet()){
            if(map.get(ch) == 1){
                return ch;
            }
        }
        return '-';
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.nextLine();
        char res = firstNonRepeatingCharacter(str);
        if (res == '-') {
            System.out.println("Not Present: -1");
        }
        else{
            System.out.println("Character: "+res);
        }
    }
}
