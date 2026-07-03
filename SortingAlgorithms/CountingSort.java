package SortingAlgorithms;

import java.util.Scanner;

public class CountingSort {

    public static void countingSort(int arr[]){
        int maxEle = arr[0];
        for(int i=1; i<arr.length; i++){
            maxEle = Math.max(maxEle, arr[i]);
        }

        int temp[] = new int[maxEle+1];
        for(int i=0; i<arr.length; i++){
            temp[arr[i]-0]++;
        }
        int idx = 0;
        for(int i=0; i<temp.length; i++){
            while (temp[i]>0) {
                arr[idx] = i;
                idx++;
                temp[i]--;
            }
        }

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
        countingSort(arr);
    }
}
