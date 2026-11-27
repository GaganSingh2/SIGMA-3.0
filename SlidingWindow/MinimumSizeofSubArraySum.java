package SlidingWindow;

import java.util.Scanner;

public class MinimumSizeofSubArraySum {
    public static int minimumSizeofSubArraySum(int arr[], int target){
        int minSize = Integer.MAX_VALUE;
        int currSum = 0;
        int right = 0, left = 0;
        for(right = 0; right<arr.length; right++){
            currSum += arr[right];
            while (currSum >= target) {
                minSize = Math.min(minSize, right - left + 1);
                currSum -= arr[left];
                left++;
            }
        }
        return minSize != Integer.MAX_VALUE ? minSize : -1;
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
        System.out.println("Enter target value: ");
        int target = sc.nextInt();
        System.out.println("Minimum Size: "+minimumSizeofSubArraySum(arr, target));
    }
}
