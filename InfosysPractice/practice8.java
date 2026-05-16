package InfosysPractice;

import java.util.HashMap;
import java.util.Scanner;

public class practice8 {
    public static int firstOccurenceOfNonDuplicateChar(String str){
        HashMap<Character,Integer> freq = new HashMap<>();
        for(int i=0; i<str.length(); i++){
            freq.put(str.charAt(i), freq.getOrDefault(str.charAt(i), 0)+1);
        }

        for(int i=0; i<str.length(); i++){
            if(freq.get(str.charAt(i))==1){
                return i+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(firstOccurenceOfNonDuplicateChar(str));
    }
}
