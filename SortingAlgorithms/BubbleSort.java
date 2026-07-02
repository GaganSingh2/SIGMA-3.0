package SortingAlgorithms;

import java.util.Scanner;

public class BubbleSort {

    public static void bubbleSort(int arr[]){
        //Ascending Order SOrting---------------
        for(int i=0; i<arr.length-1; i++){
            boolean swap = false;
            for(int j=0; j<arr.length-1-i; j++){
                if (arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    swap = true; //means array is not sorted
                }
            }

            //means array is already sorted bcz any swaping not happend in last iteration
            if (!swap) {
                break;
            }
        }

        System.out.println("After Sorting Ascending Order: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }System.out.println();

        //Descending Order Sorting----------------
        for(int i=0; i<arr.length-1; i++){
            boolean swap = false;
            for(int j=0; j<arr.length-1-i; j++){
                if (arr[j]<arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    swap = true;
                }
            }
            if (!swap) {
                break;//means array is already sorted bcz any swaping not happend in last iteration 
            }
        }

        System.out.println("After Sorting Descending Order: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size: ");
        int len = sc.nextInt();

        int arr[] = new int[len];
        System.out.println("Enter Value: ");
        for(int i=0; i<len; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Before Sorting: ");
        for(int i=0; i<len; i++){
            System.out.print(arr[i]+" ");
        }System.out.println();

        bubbleSort(arr);
    }
}
