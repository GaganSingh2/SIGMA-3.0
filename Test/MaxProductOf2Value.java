package Test;

import java.util.Arrays;
import java.util.Scanner;

public class MaxProductOf2Value {
    public static int maxProductUsingSorting(int arr[]){
        Arrays.sort(arr);

        int max1 = arr[0] * arr[1];
        int max2 = arr[arr.length-1] *  arr[arr.length-2];
        return Math.max(max1, max2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length: ");
        int len = sc.nextInt();

        int arr[] = new int[len];
        System.out.println("Enter Value: ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }System.out.println();

        System.out.println("Maximum Product Using Sorting: "+maxProductUsingSorting(arr));
    }
}
