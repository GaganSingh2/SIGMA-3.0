package InterviewPrepration.ThinkCare;

import java.util.Scanner;

public class MoveAllZerosToEnd {
    public static  void moveAllZerosToEnd(int arr[]){
        int left = 0;
        for(int right=0; right<arr.length; right++){
            if(arr[right] != 0){
                int temp = arr[right];
                arr[right] = arr[left];
                arr[left] = temp;
                left++;
            }
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void moveAllZerosToFirst(int arr[]){
        int right = arr.length-1;
        for(int left=arr.length-1; left>=0; left--){
            if (arr[left] != 0) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                right--;
            }
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }System.out.println();
        // moveAllZerosToEnd(arr);
        moveAllZerosToFirst(arr);
    }
}
