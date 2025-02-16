import java.util.Scanner;

public class strivar_DSA_sheet {

    public static int largestNum(int arr[]){
        int num = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if (num<arr[i]) {
                num = arr[i];
            }
        }
        return num;
    }

    public static int secondLargestNum(int arr[]){
        if (arr.length<2) {
            return -1;
        }

        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if (arr[i]>largest) {
                secondLargest = largest;
                largest = arr[i];
            }
            else if (arr[i]>secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }


    public static boolean sortedAndRotated(int nums[]){
        int spike = 0;
        int n = nums.length;
        for(int i=0; i<n-1; i++){
            if (nums[i]<=nums[i+1]) {
                continue;
            }
            else{
                spike++;
            }
        }
        if (nums[n-1]<=nums[0]) {
            
        }
        else{
            spike++;
        }
        if (spike>1) {
            return false;
        }
        return true;
    }

    public static void moveZero(int arr[]){
        int left = 0;
        for(int right=0; right<arr.length; right++){
            if(arr[right] != 0){
                int temp = arr[right];
                arr[right] = arr[left];
                arr[left] = temp;
                left++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Q1)Find the largest number in given array

        // System.out.println("ENter the length of Array: ");
        // int len = sc.nextInt();

        // int arr[] = new int[len];

        // System.out.println("ENter the value in Array: ");
        // for(int i=0; i<len; i++){
        //     arr[i] =sc.nextInt();
        // }
        // int greatest = largestNum(arr);
        //System.out.println("Largest value is "+greatest);


        //Q2) Find the second largeest number in given array
        // System.out.println("Enter the length of Array: ");
        // int len = sc.nextInt();

        // int arr[] = new int[len];

        // System.out.println("Enter the value in Array: ");
        // for(int i=0; i<len; i++){
        //     arr[i] = sc.nextInt();
        // }
        // int num = secondLargestNum(arr);
        // System.out.println("Second Largest is "+num);

        //Time Complexity: O(n)
        //Space Complexityy: O(1)

        //Q3) Given an array nums, return true if the array was originally sorted in non-decreasing order, then rotated some number of positions (including zero). Otherwise, return false
        // System.out.println("ENter the length in array: ");
        // int len = sc.nextInt();

        // int nums[] = new int[len];

        // System.out.println("Enter the value in Array: ");
        // for(int i=0; i<len; i++){
        //     nums[i] = sc.nextInt();
        // }

        // boolean res = sortedAndRotated(nums);
        // System.out.println(res);

        //Time Complexity:- O(n)
        //Space complexity

        //Q)Move all zeros in the right side
        System.out.println("enter the len: ");
        int len = sc.nextInt();
        int arr[] = new int[len];
        System.out.println("Enter the value: ");
        for(int i=0; i<len; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Before Moving the Zero: ");
        for(int i=0; i<len; i++){
            System.out.print(arr[i]+" ");
        }
        moveZero(arr);
        System.out.println("After Moving th Zero: ");
        for(int i=0; i<len; i++){
            System.out.print(arr[i]+" ");
        }
    }
}