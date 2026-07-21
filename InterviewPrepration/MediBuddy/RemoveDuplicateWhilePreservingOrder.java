package InterviewPrepration.MediBuddy;

import java.util.*;

public class RemoveDuplicateWhilePreservingOrder {
    public static List<Integer> removeDuplicateWhilePreservingOrder(int arr[]){
        //Approach-1: using LinkedHashSet (TC: O(n), SC: O(n)) 
        // LinkedHashSet<Integer> set = new LinkedHashSet<>();
        // for(int val: arr){
        //     set.add(val);
        // }

        // return new ArrayList<>(set);

        //Approach-2: Using ArrayList (TC: O(n^2))
        ArrayList<Integer> res = new ArrayList<>();
        for(int val: arr){
            if (!res.contains(val)) {
                res.add(val);
            }
        }
        return res; 
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size: ");
        int len = sc.nextInt();
        int arr[] = new int[len];

        System.out.println("Enter Value: ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Before Removing Duplicates: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }System.out.println();

        List<Integer> res = removeDuplicateWhilePreservingOrder(arr);
         System.out.println("Before Removing Duplicates: ");
        for(int i=0; i<res.size(); i++){
            System.out.print(res.get(i)+" ");
        }System.out.println();
    }
}
/**
 * Q) Remove Duplicate while Preserving order
 * Given an array of integers, remove duplicate elements while preserving the order of their first occurrence.
 * 
 * Input: {1,2,2,3,1,4,5,4}
 * Output: {1,2,3,4,5}
 */