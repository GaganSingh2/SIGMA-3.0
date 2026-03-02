package Hashing.HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {
    public static int[] twoSumIdx(int arr[], int target){
        HashMap<Integer,Integer> pairIdx = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            if(pairIdx.containsKey(target-arr[i])){
                return new int[]{pairIdx.get(target-arr[i]),i};
            }
            pairIdx.put(arr[i], i);
        }
       
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size: ");
        int len = sc.nextInt();
        int arr[] = new int[len];

        System.out.println("Enter Value: ");
        for(int i=0; i<len; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Value: ");
        for(int i=0; i<len; i++){
           System.out.print(arr[i]+" ");
        }System.out.println();
        System.out.println("Enter target: ");
        int target = sc.nextInt();

        int res[] = twoSumIdx(arr, target);
        System.out.println("Output: ");
        for(int v: res){
            System.out.print(v+", ");
        }
    }
}
