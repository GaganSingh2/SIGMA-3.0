package Hashing.HashMap;

import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SortStringByFrequencyInDecreasing {

    // Q)Sort Character in Decreasing order based on the frequency, if the frequency is same then perfrom lexicographical comparision. 
    public static String sortStringOnFrequencyUsingHashMapAndPriorityQueue(String str){
        //Using HashMap and Priority Queue--------------------
        //k = number of unique characters, n = length of string
        HashMap<Character, Integer> freq = new HashMap<>(); //SC: O(k)
        //count the frequency using HashMap
        for(int i=0; i<str.length(); i++){ //TC: O(n)
            freq.put(str.charAt(i), freq.getOrDefault(str.charAt(i), 0)+1);
        }

        //put characters into PriorityQueue based on the frequency
        PriorityQueue<Character> maxFreq = new PriorityQueue<>((a,b)->{
            int freqCompare = freq.get(a)-freq.get(b); //Higher frequency first
            if(freqCompare != 0){
                return freqCompare;
            }
            //When frequency same then lexicographical comparision so smaller character first (Note: if he want larger character first then just one change return(b-a)
            return a-b; 
        }); 
        //SC: O(k)
        //Each insertion into PriorityQueue: O(log k) and insert k elements 
        //so TC: O(k log k)
        maxFreq.addAll(freq.keySet());

        StringBuilder sb = new StringBuilder(""); //SC: O(n)
        
        while (!maxFreq.isEmpty()) {
            //remove the highest freqency character until the is not become empty
            //TC: (k log k)
            char ch = maxFreq.poll();
            int size = freq.get(ch);

            //append character in StringBuilder it frequency times 
            //TC: O(n)
            while (size-->0) {
                sb.append(ch);
            }
        }
        //TC: O(n log n), SC: O(n)
        return sb.toString();
    }

    public static String sortStringOnFrequencyUsingHashMapAndBucketArray(String str){
        HashMap<Character,Integer> freq = new HashMap<>(); //SC: O(k)
        //TC: O(n)
        for(int i=0; i<str.length(); i++){
            freq.put(str.charAt(i), freq.getOrDefault(str.charAt(i), 0)+1);
        }

        List<Character>[] bucket = new List[str.length()+1]; //SC: O(n)
        for(char ch: freq.keySet()){
            int idx = freq.get(ch);
            if (bucket[idx]==null) {
                bucket[idx] = new ArrayList<>();
            }
            //TC: O(k)
            bucket[idx].add(ch);
        }


        StringBuilder sb = new StringBuilder("");//SC: O(n)
        //TC: O(n)
        for(int i=bucket.length-1; i>=0; i--){
            if(bucket[i] != null){
                for(char ch: bucket[i]){
                    for(int j=0; j<i; j++){
                        sb.append(ch);
                    }
                }
            }
        }

        //Final Total TC: O(n), final Total SC: O(n)
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.next();
        
        String res = sortStringOnFrequencyUsingHashMapAndPriorityQueue(str);
        System.out.println("After Sorting: "+res);

        System.out.println("Enter the String: ");
        String str1 = sc.next();
        
        String res1 = sortStringOnFrequencyUsingHashMapAndBucketArray(str);
        System.out.println("After Sorting: "+res);
    }
}
