package Recursion;

import java.util.Scanner;

public class BinarySearchUsingRecursion {
    static int binarySearchUsingRecursion(int arr[], int target, int si, int ei){
        if (si>ei) {
            return -1;
        }
        int mid = si+(ei-si)/2;
        System.out.println(mid);
        if(arr[mid]==target){
            return mid;
        }
        if(arr[mid]<target){
            
           return binarySearchUsingRecursion(arr,target,mid+1,ei);
        }
        return binarySearchUsingRecursion(arr,target,si,mid-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int len = sc.nextInt();
        int arr[] = new int[len];
        CreateArray.createArray(arr);
        CreateArray.printArray(arr);

        System.out.println("Enter the Target: ");
        int target = sc.nextInt();
        int idx = binarySearchUsingRecursion(arr,target,0,arr.length-1);
        System.out.println(idx);
    }
    
}