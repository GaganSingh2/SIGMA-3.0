import java.util.Scanner;

public class Divide_and_Conquer {
    
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    //----MERGE SORRT----
    public static void mergeSort(int arr[], int si, int ei){
        //Base Case
        if (si>ei || si==ei) {
            return;
        }

        //Divide Array
        int mid = si + (ei-si)/2;

        //Merge Sort for left part
        mergeSort(arr, si, mid);
        //Merge Sort for Right part
        mergeSort(arr, mid+1, ei);

        //For Merging 
        merge(arr, si, mid, ei);
    }
    public static void merge(int arr[], int si, int mid, int ei){
        int temp[] = new int[ei-si+1];
        int i = si; //iterator for left part
        int j = mid+1; //iterator for right part
        int k = 0; //iterator for temp arr

        //for compare the both part & insert the smaller value in temp arr
        while (i<=mid && j<=ei) {
            if (arr[i]<arr[j]) {
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        //remaning left part
        while (i<=mid) {
            temp[k++]=arr[i++];
        }
        //remaning right part
        while (j<=ei) {
            temp[k++]=arr[j++];
        }
        //Copy temp to original arr
        for(k=0, i=si; k<temp.length; k++, i++){
            arr[i] = temp[k];
        }
    }

    //----QUICK SORT---
    public static void quickSort(int arr[], int si, int ei){
        //Base Case
        if (si>=ei) {
            return;
        }

        //pivot Element->last element
        int pIdx = partition(arr,si,ei);

        //Quick sort for left part
        quickSort(arr, si, pIdx-1);
        //Quick sort for right part
        quickSort(arr, pIdx+1, ei);
    }
    public static int partition(int arr[],int si, int ei){
        int pivot = arr[ei];
        int i = si-1; //to make place for element smaller than pivot
        for(int j=si; j<ei; j++){
            if (arr[j]<= pivot) {
                i++;
                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        //adjust the pivot to right pos  
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //----MERGE SORT------
        // System.out.println("Enter the length of Array: ");
        // int len = sc.nextInt();

        // int arr[] = new int[len];
        // System.out.println("Enter the value in Array: ");
        // for(int i=0; i<len; i++){
        //     arr[i] = sc.nextInt();
        // }
        // System.out.println("Before Sorted Array: ");
        // printArr(arr);
        // mergeSort(arr, 0, arr.length-1);
        // System.out.println("After Sorted Array: ");
        // printArr(arr);

        //Time Complexity: O(nlogn)
        //Space Complexity: O(n)

        //------QUICK SORT-----
        System.out.println("Enter the length of Array: ");
        int len = sc.nextInt();

        int arr[] = new int[len];
        System.out.println("Enter the value in Array: ");
        for(int i=0; i<len; i++){
            arr[i] = sc.nextInt(); 
        }
        System.out.println("Before Sorted the Array: ");
        printArr(arr);
        quickSort(arr, 0, arr.length-1);
        System.out.println("After Sorted the Array: ");
        printArr(arr);

        //Time Complexity: O(nlogn)
        //Space COmplexity: O(1)
    }
}
