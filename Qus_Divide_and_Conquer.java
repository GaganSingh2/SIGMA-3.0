import java.util.Scanner;

public class Qus_Divide_and_Conquer {

    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static int searchIndex(int arr[], int tar, int si, int ei){

        //Base Case
        if (si<ei) {
            return -1;
        }

        //Kaam
        int mid = si+(ei-si)/2;

        //if mid is target
        if (tar==arr[mid]) {
            return mid;
        }

        //Mid on L1
        if (arr[si]<=arr[mid]) {
            //case a: Left
            if (arr[si]<=tar && tar<=arr[mid]) {
                return searchIndex(arr, tar, si, mid-1);
            }
            //Case b: right
            else{
                
                return searchIndex(arr, tar, mid+1, ei);
            }
        }
        //Mid on L2
        else{
            //Case c: right
            if (arr[mid]<=tar && tar<=arr[ei]) {
                return searchIndex(arr, tar, mid+1, ei);
            }
            //Case d: left
            else{
                return searchIndex(arr, tar, si, mid-1);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Q1)Search in rotated sorted array.=>Sorted,rotated array with distinct number (in ascending order).It is ratated at a pivot point. Find the index of given element.
        System.out.println("Enter the length of Array: ");
        int len = sc.nextInt();

        int arr[] = new int[len];
        System.out.println("ENter the value in Array: ");
        for(int i=0; i<len; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array: ");
        printArr(arr);

        System.out.println("Enter the Target: ");
        int target = sc.nextInt();
        
        int tarIdx = searchIndex(arr, target, 0, arr.length);
        System.out.println("Index: "+tarIdx);
    }
}
