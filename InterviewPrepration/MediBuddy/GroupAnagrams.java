package InterviewPrepration.MediBuddy;
import java.util.*;
public class GroupAnagrams {
    public static List<List<String>> groupAnagram(String grp[]){
        HashMap<String, List<String>> map = new HashMap<>();
        for(String word: grp){
            //convert it into a character array
            char[] ch = word.toCharArray();
            //sot the characters
            Arrays.sort(ch);

            //convert back into a String
            String key = new String(ch);
            
            //if key is not present in map so create a new empty subArrayList with given key
            map.putIfAbsent(key, new ArrayList<>());

            //if key is already present in map so just add into the existing subArrayList
            map.get(key).add(word);
        }

        return new ArrayList<>(map.values());
    }
    public static void main(String[] args) {
        String [] grp = {"eat","tea","ate","tan","nat","bat"};
        List<List<String>> res = groupAnagram(grp);

        for(int i=0; i<res.size(); i++){
            for(int j=0; j<res.get(i).size(); j++){
                System.out.print(res.get(i).get(j)+", ");
            }
            System.out.println();
        }
    }
}

/*
Q) Group Anagrams
Given a list of strings group all anagrams together.
Input: ["eat","tea","tan","ate","nat","bat"]

Output: 
[
    ["eat","tea","ate"],
    ["tan","nat"],
    ["bat"]
]

Approach: 
    1)take one - one word at a time
    2)convert it into character array
    3)sort this character array
    4)convert back into String of sorted characterArray
    5)if key is not present in map so create a new empty subArrayList with given key.
    6)if key is already present in map so just add into the existing subArrayList.

 */
