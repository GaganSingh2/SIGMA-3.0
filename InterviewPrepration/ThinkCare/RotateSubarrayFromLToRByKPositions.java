package InterviewPrepration.ThinkCare;

import java.util.Scanner;

public class RotateSubarrayFromLToRByKPositions {
    
    public  static  void reverse(int arr[], int si, int ei){
        while(si<ei){
            int temp = arr[si];
            arr[si] = arr[ei];
            arr[ei] = temp;
            si++;
            ei--;
        }
    }
    public static void rotateSubarrayFromLToRByKPositions(int arr[], int l, int r, int k){
        if (l < 0 || r < 0 || l > arr.length || r > arr.length || k < 0) {
            System.out.println("Invalid values");
            return;   
        }

        int len = r - l + 1;
        k = k % len;
        reverse(arr, l, r); //Reverese the selected sub-array
        reverse(arr, l, l+k-1); //Reverse the first k elements of that subarray
        reverse(arr, l+k, r); //reverse the remaining elements

        
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        int k = sc.nextInt();

        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }System.out.println();
        rotateSubarrayFromLToRByKPositions(arr, l, r, k);
    }
}

/*
You are given an array {1, 2, 3, 4, 5, 6} with l = 1, r = 4, and k = 1.

You need to rotate the subarray from index l to index r to the right by k positions.
Example
Input:
arr = {1, 2, 3, 4, 5, 6} 
l = 1, r = 4, k = 1

Assuming 0-based indexing, the subarray from index 1 to index 4 is:
{2, 3, 4, 5}

Rotate it right by one position:
Before: {2, 3, 4, 5} => 5,4,3,2 =>
After:  {5, 2, 3, 4}


Place it back into the original array:
Output: {1, 5, 2, 3, 4, 6}
 */