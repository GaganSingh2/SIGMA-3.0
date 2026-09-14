package SortingAlgorithms;

import java.util.Scanner;

import Array.PrintArray;
import Array.TakeInput;

public class MergeSortAscendingOrder {
    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1]; // temp array to store sorted part

        int i = si; // iterator for left part
        int j = mid + 1; // iterator for right part
        int k = 0; // iterator for temp array

        // Merge the sorted left part and right part in single array.
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        //for remaining left part
        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }

        //for remaining right part.
        while (j <= ei) {
            temp[k] = arr[j];
            j++;
            k++;
        }

        //copy temp array to original array
        for(k=0, i=si; k<temp.length; k++,i++){
            arr[i] = temp[k];
        }
    }

    public static void mergeSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;
        mergeSort(arr, si, mid); // left Part
        mergeSort(arr, mid+1, ei); // right Part
        merge(arr, si, mid, ei);
    }

    public static void main(String[] args) {
        int arr[] = TakeInput.takeInput();
        mergeSort(arr, 0, arr.length-1);
        System.out.println("After Sorting: ");
        PrintArray.printArray(arr);
    }
}
