package InterviewPrepration.PhaseZeroAI;

import java.util.Scanner;

public class SortTheBinaryArray {
    public static void sortArrayAscending(int arr[]){
        int right = arr.length-1;
        for(int left=arr.length-1; left>=0; left--){
            if (arr[left] != 0) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                right--;
            }
        }
        System.out.println("After Sorting In Ascending: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

     public static void sortArrayDescending(int arr[]){
        int left = 0;
        for(int right=0; right<arr.length; right++){
            if (arr[right] != 0) {
                int temp = arr[right];
                arr[right] = arr[left];
                arr[left] = temp;
                left++;
            }
        }
        System.out.println("After Sorting in Descending: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length: ");
        int len = sc.nextInt();
        int arr[] = new int[len];
        System.out.println("Enter Value: ");
        for(int i=0; i<len; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Before Sorting: ");
        for(int i=0; i<len; i++){
            System.out.print(arr[i]+" ");
        }

        // sortArrayAscending(arr);
        sortArrayDescending(arr);
    }
}
