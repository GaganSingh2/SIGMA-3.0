package SortingAlgorithms;

import java.util.Scanner;

public class InsertionSort {
    public static void insertionSort(int arr[]){

        //Sorting in Ascending Order
        for(int i=1; i<arr.length; i++){
            int curr = arr[i];
            int prev = i-1;
            
            //Finding out the correct position in left of currELement to Insert the currELement
            while (prev >=0 && arr[prev]>curr) {
                arr[prev+1] = arr[prev];
                prev--;
            }

            //Insert the currElement at correct position
            arr[prev+1] = curr; //
        }

        //Print the Ascending Order
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }System.out.println();


        //Sorting in Descending Order--------------------
        for(int i=1; i<arr.length; i++){
            int curr = arr[i];
            int prev = i-1;
            
            //Finding out the correct position in left of currELement to Insert the currELement
            while (prev >=0 && arr[prev]<curr) {
                arr[prev+1] = arr[prev];
                prev--;
            }

            //Insert the currElement at correct position
            arr[prev+1] = curr; //
        }

        //Print the Descending Order
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

        insertionSort(arr);

    }
}
