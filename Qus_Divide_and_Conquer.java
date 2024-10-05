import java.util.Arrays;
import java.util.Scanner;

public class Qus_Divide_and_Conquer {

    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static int searchIndex(int arr[], int tar, int si, int ei){

        //Base Case
        if (si<ei) {
            return -1;
        }

        //Kaam
        int mid = si+(ei-si)/2;

        //if mid is target
        if (tar==arr[mid]) {
            return mid;
        }

        //Mid on L1
        if (arr[si]<=arr[mid]) {
            //case a: Left
            if (arr[si]<=tar && tar<=arr[mid]) {
                return searchIndex(arr, tar, si, mid-1);
            }
            //Case b: right
            else{
                
                return searchIndex(arr, tar, mid+1, ei);
            }
        }
        //Mid on L2
        else{
            //Case c: right
            if (arr[mid]<=tar && tar<=arr[ei]) {
                return searchIndex(arr, tar, mid+1, ei);
            }
            //Case d: left
            else{
                return searchIndex(arr, tar, si, mid-1);
            }
        }
    }

    public static String[] sortString(String arr[],int si,int ei){
        //Base Case
        if(arr.length<2){
            String[] A = {arr[si]};
            return A;
        }

        //Divide
        int mid = si+(ei-si)/2;
        
        //Merge sort for left
        String arr1[] = sortString(arr, si, mid);
        //Merge sort for right
        String arr2[] = sortString(arr, mid+1, ei);

        //for Merging 
        String arr3[] = merge(arr1,arr2);
        return arr3;
    }
    public static String[] merge(String arr1[],String arr2[]){
        int m = arr1.length;
        int n = arr2.length;
        
        String arr3[] = new String[m+n];//temparary array
        int i=0;//iterator for left
        int j = 0; //iterator for right part
        int k = 0; //iterator for temp arr

        //for compare both part & insert the smaller value in temp arr
        while (i<m && j<n) {
            if (arr1[i].compareTo(arr2[j])<=0) {
                arr3[k]=arr1[i];
                i++;
            }
            else{
                arr3[k]=arr2[j];
                j++;
            }
            k++;
        }
        //for remaining part of left
        while (i<m) {
            arr3[k++]=arr1[i++];
        }
        //for ramining part of right
        while (j<n) {
            arr3[k++]=arr2[j++];
        }
        return arr3;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Q1)Search in rotated sorted array.=>Sorted,rotated array with distinct number (in ascending order).It is ratated at a pivot point. Find the index of given element.
        // System.out.println("Enter the length of Array: ");
        // int len = sc.nextInt();

        // int arr[] = new int[len];
        // System.out.println("ENter the value in Array: ");
        // for(int i=0; i<len; i++){
        //     arr[i] = sc.nextInt();
        // }
        // System.out.println("Array: ");
        // printArr(arr);

        // System.out.println("Enter the Target: ");
        // int target = sc.nextInt();
        
        // int tarIdx = searchIndex(arr, target, 0, arr.length);
        // System.out.println("Index: "+tarIdx);


        //Q2)Apply Merge sort to sort an array of Strings.(Assume that all the characters in all the Strings are in lowercase.
        System.out.println("Enter the length of Array: ");
        int len = sc.nextInt();

        String arr[] = new String[len];
 
        System.out.println("Enter the value in Array: ");
        for(int i=0; i<len; i++){
            arr[i] = sc.nextLine();
        }

        System.out.println("Array: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        String str[] = sortString(arr, 0, arr.length-1);

        System.out.println("Sorted String Array: ");
        for(int i=0; i<str.length; i++){
            System.out.print(str[i]+" ");
        }
    }
}
