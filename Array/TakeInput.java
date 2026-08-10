package Array;

import java.util.Scanner;

public class TakeInput {
    public static int[] takeInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int len = sc.nextInt();

        int arr[] = new int[len];
        System.out.println("Enter Value: ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array: ");
        for(int i=0; i<len; i++){
            System.out.print(arr[i]+" ");
        }System.out.println();

        return arr;
    }
    public static void main(String[] args) {
        
    }
}
