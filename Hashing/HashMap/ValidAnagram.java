package Hashing.HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class ValidAnagram {
    //THis method throw ArrayIndexOutOfBoundException because we make the array only for small character because we use [ch-'a']
    //Its work but firstly convert both string in lowercase but it is not recommended otherwise if constraint only in LowerCase or UpperCase then its work fine
    public static boolean isValidAnagramUsingArray(String s, String t){
        if(s.length() != t.length()){
            return false;
        }
        int freq[] = new int[26];
        for(int i=0; i<s.length(); i++){
            char ch1 = s.charAt(i);
            freq[ch1-'a']++;
            char ch2 = t.charAt(i);
            freq[ch2-'a']--;
        }
        

        for(int ele: freq){
            if(ele != 0){
                return false;
            }
        }
        return true;
    }

    //THis is work for all
    public static boolean isValidAnagramUsingHashMap(String s, String t)
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

        boolean res = isValidAnagramUsingArray(s, t);
        if (res) {
            System.out.println("Valid Anagram!!");
        }
        else{
            System.out.println("Invalid Anagram!!");
        }
    }
}
