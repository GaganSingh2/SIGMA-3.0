import java.util.Scanner;

public class dsa_sheet_Array {

    //for Maximum value
    public static int maximumELement(int arr[], int max_value){
        max_value = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if (arr[i]>max_value) {
                max_value = arr[i];
            }
        }
        return max_value;
    }

    //For minimum value
    public static int minimumElement(int arr[], int min_value){
        min_value = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if (arr[i]<min_value) {
                min_value = arr[i];
            }
        }
        return min_value;
    }


    public static void reverse_Array(int arr[]){
        int start = 0; 
        int end = arr.length-1;
        while (start<end) {
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }
        
    }


    public static int maxSubArraySum(int arr[]){
        //Using of Kadane's Algorithm
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            currSum +=  arr[i];
            maxSum = Math.max(currSum, maxSum);
            if (currSum < 0) {
                currSum = 0;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Q1)Given an array of size N. The task is to find the maximum and the minimum element of the array using the minimum number of comparisons.

        // System.out.println("Enter the length of Array: ");
        // int len = sc.nextInt();

        // int arr[] = new int[len];

        // System.out.println("ENter the value in Array: ");
        // for(int i=0; i<len; i++){
        //     arr[i] = sc.nextInt();
        // }
        // int ans = maximumELement(arr, len);
        // System.out.println("Maximum Value is "+ans);
        // int ans1 = minimumElement(arr, ans);
        // System.out.println("Minimum value is "+ans1);


        //Q2) Find the revrse of array
        // System.out.println("Enter the length of Array: ");
        // int len = sc.nextInt();

        // int arr[] = new int[len];

        // System.out.println("ENter the value in Array: ");
        // for(int i=0; i<len; i++){
        //     arr[i] = sc.nextInt();
        // }

        // reverse_Array(arr);
        // System.out.println("After the Reverse of Array:");
        // for(int i=0; i<len; i++){
        //     System.out.println(arr[i]+" ");
        //}


        //Q3) Given an integer array nums find the sub-array with the largest sum, and returns its sum.

        System.out.println("ENter the lenght of Array: ");
        int len = sc.nextInt();

        int arr[] = new int[len];

        System.out.println("ENter the value in Array: ");
        for(int i=0; i<len; i++){
            arr[i] = sc.nextInt();
        }

        int result = maxSubArraySum(arr);
        System.out.println("Maximum sum of Sub-Array is "+result);
    }
}
