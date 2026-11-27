package SlidingWindow;

import java.util.Scanner;

public class MaxSumSubArrayOfSizeK {
    public static int maxSumSubArrayOfSizeK(int arr[], int k){
        if(k<=0 || k > arr.length){
            return -1;
        }

        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        int left = 0, right = 0;
        for(right=0; right<k; right++){
            currSum += arr[right];
        }
        maxSum = Math.max(maxSum, currSum);
        while(right<arr.length){
            currSum -= arr[left];
            currSum += arr[right];
            left++;
            right++;
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum != Integer.MIN_VALUE ? maxSum : -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter value in Array: ");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter value of K: ");
        int k = sc.nextInt();
        System.out.println("Max Sum: "+(maxSumSubArrayOfSizeK(arr, k)));
    }
}
