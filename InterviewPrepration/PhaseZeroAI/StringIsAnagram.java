package InterviewPrepration.PhaseZeroAI;

import java.util.HashMap;
import java.util.Scanner;

public class StringIsAnagram {
    //Approach-1(but it will work if all the Character is in UpperCase or LowerCase)
    public static boolean isAnagramApproach1(String str1, String str2){
        if (str1.length() != str2.length()) {
            return false;
        }
        int freq[] = new int[26];
        for(int i=0; i<str1.length(); i++){
            char ch = str1.charAt(i);
            freq[ch-'a']++;
        }

        for(int i=0; i<str2.length(); i++){
            char ch = str2.charAt(i);
            freq[ch-'a']--;
        }

        for(int i=0; i<freq.length; i++){
            if(freq[i] != 0){
                return false;
            }
        }
        return true;
    }

    //TC:O(n) SC:O(n)
    public static boolean isAnagramApproach2(String str1, String str2){
        if (str1.length() != str2.length()) {
            return false;
        }
        HashMap<Character, Integer> freq = new HashMap<>();
        for(int i=0; i<str1.length(); i++){
            char ch = str1.charAt(i);
            freq.put(ch, freq.getOrDefault(ch, 0)+1);
        }

        for(int i=0; i<str2.length(); i++){
            char ch = str2.charAt(i);
            if (!freq.containsKey(ch)) {
                return false;
            }
            else{
                if(freq.get(ch)==1){
                    freq.remove(ch);
                }
                else{
                    freq.put(ch, freq.get(ch)-1);
                }
            }
        }
        return freq.isEmpty();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String1: ");
        String str1 = sc.next();
        System.out.println("Enter the String2: ");
        String str2 = sc.next();

        //Approach-1-------------------------------
        // boolean res = isAnagramApproach1(str1, str2);
        // if (res) {
        //     System.out.println("Anagram");
        // }
        // else{
        //     System.out.println("Not Anagram");
        // }

        //Approach-2 ------------------------------
        boolean res = isAnagramApproach2(str1, str2);
        if (res) {
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not Anagram");
        }
    }
}
