package Hashing.HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class ValidAnagram {

    public static boolean isValidAnagram(String s, String t)
    {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character,Integer> freq = new HashMap<>();

        //Increase the Frequency
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            freq.put(ch, freq.getOrDefault(ch, 0)+1);
        } 
        //Decrease the Frequency
        for(int i=0; i<t.length(); i++){
            char ch = t.charAt(i);
            //if count is not null
            if(freq.get(ch) != null){
                //if count is 1 then directly remove the key-value
                if(freq.get(ch)==1){
                    freq.remove(ch);
                }
                else{ //otherwise, Deccrease the Frequency
                    freq.put(ch, freq.get(ch)-1);
                }
            }
            else{ //if extra character comes means not a valid Anagram
                return false;
            }
        } 
        return freq.isEmpty();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Q)Given two string S and T, return true if T is an Anagram of S, otherwise false.
        //A Anagram is a word or pharse formed by rearranging the letter of different word or phrase, typically using all the original letter exactly once. eg: s = "race", t = "care"(True) | s = "tulip", t = "lipid" (False)
        System.out.println("Enter the first Str: ");
        String s = sc.nextLine();
        System.out.println("Enter the second Str: ");
        String t = sc.nextLine();

        boolean res = isValidAnagram(s, t);
        if (res) {
            System.out.println("Valid Anagram!!");
        }
        else{
            System.out.println("Invalid Anagram!!");
        }
    }
}
