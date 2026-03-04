package Hashing.HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class LargestSubArrayWithSumIs0 {

    public static int largestSubArrayWithSumIs0(int arr[]){
        int maxLen = 0, sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int j=0; j<arr.length; j++){
            sum += arr[j];
            if(map.containsKey(sum)){
                maxLen = Math.max(maxLen, j-map.get(sum));
            }
            else{
                map.put(sum, j);
            }
        }
        return maxLen;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length: ");
        int len = sc.nextInt();
        int arr[] = new int[len];
        System.out.println("Enter Value: ");
        for(int i=0; i<len; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Value: ");
        for(int val: arr){
            System.out.print(val+" ");
        }System.out.println();

        int maxLen = largestSubArrayWithSumIs0(arr);
        System.out.println("Largest Sub-Array with sum as 0: "+maxLen);
    }

}
