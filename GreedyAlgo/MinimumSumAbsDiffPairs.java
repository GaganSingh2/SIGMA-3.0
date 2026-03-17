package GreedyAlgo;
import java.util.Arrays;
import java.util.Scanner;
public class MinimumSumAbsDiffPairs {

    public static int minimumSumAbsDiffPairs(int arr1[], int arr2[]){
        int minDiff = 0;
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for(int i=0; i<arr1.length; i++){
            minDiff += Math.abs(arr1[i]-arr2[i]);
        }
        return minDiff;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length: ");
        int len = sc.nextInt();

        int arr1[] = new int[len];
        int arr2[] = new int[len];

        System.out.println("Enter Value in Array1: ");
        for(int i=0; i<arr1.length; i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter Value in Array2: ");
        for(int i=0; i<arr2.length; i++){
            arr2[i] = sc.nextInt();
        }

        System.out.println("Array1: ");
        for(int i=0; i<arr1.length; i++){
            System.out.print(arr1[i]+" ");
        }System.out.println();
        System.out.println("Array2: ");
        for(int i=0; i<arr2.length; i++){
            System.out.print(arr2[i]+" ");
        }System.out.println();


        int minDiff = minimumSumAbsDiffPairs(arr1, arr2);
        System.out.println("Minimum Sum of Absolute Differnce Pairs: "+minDiff);
    }
}