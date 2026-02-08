package Test;

import java.util.Scanner;

public class BinarySearch {

    public static int binarySearch(int arr[], int k){
        int si = 0, ei = arr.length-1;
        while (si<=ei){
            int mid = (si+ei)/2;
            if(arr[mid]==k){
                return mid;
            }
            else if(arr[mid]<k){
                si = mid+1;
            }
            else{
                ei = mid-1;
            }
        } 
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size: ");
        int len = sc.nextInt();
        int arr[] = new int[len];
        System.out.println("Enter Value: ");
        for(int i=0; i<len; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Array: ");
        for(int val: arr){
            System.out.print(val+" ");
        }System.out.println();


        System.out.println("Enter Key: ");
        int key = sc.nextInt();

        System.out.println("Index: "+binarySearch(arr, key));
    }
}
