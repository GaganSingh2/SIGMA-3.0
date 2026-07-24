package InterviewPrepration.VerifoneIndiaPvtLtd;

import java.util.Scanner;

public class RotateArray {
    public static void rotateArrayUsingModulo(int arr[], int k){
        //formula: index = (k+i) % arr.length
        int n = arr.length;
        for(int i=0; i<n; i++){
            int idx = (k + i) % n;
            System.out.print(arr[idx]+" ");
        }System.out.println();

        /*
        arr[] = {1,2,3,4,5}, k = 3

        i=0 → (3+0)%5 = 3 → 4
        i=1 → (3+1)%5 = 4 → 5
        i=2 → (3+2)%5 = 0 → 1
        i=3 → (3+3)%5 = 1 → 2
        i=4 → (3+4)%5 = 2 → 3

        output = {4,5,1,2,3}
        */
    }

    private static void rotate(int si, int ei, int arr[]){
        while(si < ei){
            int temp = arr[si];
            arr[si] = arr[ei];
            arr[ei] = temp;
            si++;
            ei--;
        }
    }
    public static void rotateArrayUsingKthRotationApproach(int arr[], int k){
        k %= arr.length;
        rotate(0, k-1, arr);
        rotate(k, arr.length-1, arr);
        rotate(0, arr.length-1, arr);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }System.out.println();

        /*
        arr = {1,2,3,4,5}, k = 3
        Step1: rotate(0, k-1) => {3,2,1,4,5}
        step2: rotate(k, arr.length-1) => {3,2,1,5,4}
        step3: rotate(0, arr.length-1) => {4,5,1,2,3}
         */
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter Size: ");
       int len = sc.nextInt();

       int arr[] = new int[len];

       System.out.println("Enter value: ");
       for(int i=0; i<len; i++){
            arr[i] = sc.nextInt();
       }
       System.out.println("Before Rotation: ");
       for(int i=0; i<len; i++){
            System.out.print(arr[i]+" ");
       }System.out.println();

       System.out.println("Enter Kth Value: ");
       int k = sc.nextInt();
       
       //Approach-1: using Modulo-------------
    //    rotateArrayUsingModulo(arr, k);

       //Approach-2: using kth Rotation Apporach------------
       rotateArrayUsingKthRotationApproach(arr, k);

    }
}
