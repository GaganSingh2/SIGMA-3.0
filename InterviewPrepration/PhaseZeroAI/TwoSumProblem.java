package InterviewPrepration.PhaseZeroAI;

import java.util.HashMap;
import java.util.Scanner;

public class TwoSumProblem {
    //TC: O(n^2) SC: O(1)
    public static int[] twoSumProblemApproach1(int arr[], int target){
        if (arr.length == 1) {
            return new int[]{};
        }
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]+arr[j] == target){
                    return new int[]{arr[i], arr[j]};
                }
            }
        }
        return new int[]{};
    }

    //TC: O(n) SC:O(n)
    public static int[] twoSumProblemApproach2(int arr[], int target){
        if (arr.length == 1) {
            return new int[]{};
        }
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            if (freq.containsKey(target-arr[i])) {
                return new int[]{arr[i], target-arr[i]};
            }
            freq.put(arr[i], i);
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size: ");
        int len = sc.nextInt();
        int arr[] = new int[len];
        System.out.println("Enter Value: ");
        for(int i=0; i<len; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array: ");
        for(int i=0; i<len; i++){
            System.out.print(arr[i]+" ");
        }System.out.println();
        System.out.println("Enter Target: ");
        int target = sc.nextInt();

        //Approach-1---------------
        // int res[] = twoSumProblemApproach1(arr, target);
        // if (res.length == 0) {
        //     System.out.println("Pair Not Exist: "+res);
        // }
        // else{
        //     System.out.println("["+res[0]+","+res[1]+"]");
        // }

        //Approach-2------------------
        int res[] = twoSumProblemApproach2(arr, target);
        if (res.length == 0) {
            System.out.println("Pair Not Exist: "+res);
        }
        else{
            System.out.println("["+res[0]+","+res[1]+"]");
        }
    }
}
