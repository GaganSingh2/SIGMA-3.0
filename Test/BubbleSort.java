package Test;

import java.util.Scanner;

public class BubbleSort {
    public static void bubbleSort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j]>arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
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

        System.out.println("Before Sorting: ");
        for(int val: arr){
            System.out.print(val+" ");
        }System.out.println();

        bubbleSort(arr);
        System.out.println("After Sorting: ");
        for(int val: arr){
            System.out.print(val+" ");
        }
    }
}
