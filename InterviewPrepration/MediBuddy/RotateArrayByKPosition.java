package InterviewPrepration.MediBuddy;

import java.util.Scanner;

public class RotateArrayByKPosition {
    public static void rotate(int si, int ei, int arr[]){
        while (si<ei) {
            int temp = arr[si];
            arr[si] = arr[ei];
            arr[ei] = temp;

            si++;
            ei--;
        }
    }
    public static void rotateArrayByKPosition(int arr[], int k){
        k %= arr.length;

        rotate(0, arr.length-1, arr);
        rotate(0, k-1, arr);
        rotate(k, arr.length-1, arr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size: ");
        int len = sc.nextInt();
        int arr[] = new int[len];

        System.out.println("Enter Value: ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter Postion: ");
        int k = sc.nextInt();

        System.out.println("Before Rotation of "+k+" times: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }System.out.println();

        rotateArrayByKPosition(arr, k);

        System.out.println("After Rotation of "+k+" times: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }System.out.println();
    }
}
