package Recursion;

import java.util.Scanner;

public class CreateArray {
    static void createArray(int arr[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value: ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
    }
    static void printArray(int arr[]){
        System.out.println("Array: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
