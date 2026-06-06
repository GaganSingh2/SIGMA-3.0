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


    public static int maxProductWithoutSorting(int arr[]){
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for(int num: arr){
            //two largest number of array
            if (num>max1) {
                max2 = max1;
                max1 = num;
            }
            else if(num>max2){
                max2 = num;
            }

            //two smallest number of array
            if (num<min1) {
                min2 = min1;
                min1 = num;
            }
            else if(num<min2){
                min2 = num;
            }
        }

        return Math.max(max1*max2, min1*min2);
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

        System.out.println("Maximum Product Without Using Sorting: "+maxProductWithoutSorting(arr));
    }
}
