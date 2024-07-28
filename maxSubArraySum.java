import java.util.Scanner;

public class maxSubArraySum {

    public static void maxSubarraySum(int arr[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        // find the start point
        for (int i = 0; i < arr.length; i++) {
            int start = i;

            // find the end point
            for (int j = i; j < arr.length; j++) {
                int end = j;
                currSum = 0;

                // for sum the sub-array
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ");
                    currSum += arr[k];
                }
                System.out.println();
                System.out.println("Sum is " + currSum);
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Maximum sum of sub-array is " + maxSum);
    }

    public static void maxSubarraySumPrefix(int arr[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];

        prefix[0] = arr[0];
        // Calculate Prefix Array
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        // for find start point
        for (int i = 0; i < arr.length; i++) {
            int start = i;

            // for find end point
            for (int j = i; j < arr.length; j++) {
                int end = j;

                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max Sum is " + maxSum);
    }

    public static int kadane_Algo_to_maxSum(int arr[]) {
        /*
         * Kadane Algorithm: Kadane Algorithm works when the sum of two value can be
         * create a negative number then the with the help of kadane algo the current
         * sum is automatically update the 0.
         */

        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            currSum = currSum + arr[i];
            maxSum = Math.max(currSum, maxSum);
            if (currSum < 0) {
                currSum = 0;
            }

        }
        return maxSum;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Find the Maximum Sum of sub array in given array with 1st-way
        // System.out.println("Enter the length of Array: ");
        // int len = sc.nextInt();

        // int arr[] = new int[len];

        // System.out.println("Enter the value in Array: ");
        // for (int i = 0; i < len; i++) {
        // arr[i] = sc.nextInt();
        // }
        // maxSubarraySum(arr);

        // Time Complexity = O(n^3) there is the worst case to find the maximum sum of
        // sub-array

        // Find the Maximum sum of sub-array in given array with 2nd-way
        // System.out.println("ENter the length of Array: ");
        // int len = sc.nextInt();

        // int arr[] = new int[len];

        // System.out.println("Enter the value in Array: ");
        // for(int i=0; i<len; i++){
        // arr[i] = sc.nextInt();
        // }

        // maxSubarraySumPrefix(arr);

        // Time COmplexity = O(n^2). it is lower than 1st way

        // Q) Find the Maximum Sum with the help of Kadane Algorithm.

        System.out.println("ENter the length of Array: ");
        int len = sc.nextInt();

        int arr[] = new int[len];

        System.out.println("Enter the value in Array:  ");
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        int result = kadane_Algo_to_maxSum(arr);
        
        System.out.println("Maximum sum is "+result);
    }
}
