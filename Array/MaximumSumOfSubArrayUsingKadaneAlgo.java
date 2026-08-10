package Array;

import java.util.Scanner;

public class MaximumSumOfSubArrayUsingKadaneAlgo {
    public static int maximumSumOfSubArrayUsingKadaneAlgo(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for(int i=0; i<arr.length; i++){
            currentSum += arr[i];
            maxSum = Math.max(maxSum, currentSum);
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int arr[] = TakeInput.takeInput();

        int res = maximumSumOfSubArrayUsingKadaneAlgo(arr);
        System.out.println("Maximum Sum: "+res);
    }
}
