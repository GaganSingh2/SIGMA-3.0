import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javax.swing.text.Style;

public class test {
    public static void insertionSort(int arr[]){
        for(int i=1; i<arr.length; i++){
            int curr = arr[i];
            int prev = i-1;
            //Finding out the correct position to insert
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev+1] = arr[prev];
                prev--;
            }
            //for insertion
            arr[prev+1] = curr;
        }
    }
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        
    }

    public static boolean canArrange(int[] arr, int k) {
        int [] freq = new int[k];
        for(int num: arr){
            int rem = num % k;
            if(rem < 0){
                rem = rem + k;
            }
            freq[rem]++;
        }
        if(freq[0] % 2 != 0){
            return false;
        }
        for(int i = 1;i <= k / 2;i++){
            if(freq[i] != freq[k-i]) {
                return false;
            }
        }
        return true;
    }

    public static int[] arrayRankTransform(int[] arr) {
        Map<Integer, Integer> valueToRank = new HashMap<>();  // Map to store value-to-rank mapping
        int[] sortedUniqueNumbers = Arrays.stream(arr).distinct().sorted().toArray();  // Remove duplicates and sort
        
        // Assign ranks to sorted unique elements
        for (int i = 0; i < sortedUniqueNumbers.length; i++) {
            valueToRank.put(sortedUniqueNumbers[i], i + 1);
        }

        // Replace each element in the original array with its rank
        for (int i = 0; i < arr.length; i++) {
            arr[i] = valueToRank.get(arr[i]);
        }

        return arr;  // Return the updated array
    }

    //Merge sorting
    public static void mergeSort(int arr[],int si, int ei){
        //Base Case
        if (si>=ei) {
            return;
        }

        //Divide
        int mid = si+(ei-si)/2;

        //Merge sort for left parrt
        mergeSort(arr, si, mid);
        //Merge Sort for right part
        mergeSort(arr, mid+1, ei);

        //for Merging
        merge(arr, si, mid, ei);
    }
    public static void merge(int arr[], int si, int mid, int ei){
        //Create Temparary Array
        int temp[] = new int[ei-si+1];
        int i = si; //iterator for left part
        int j = mid+1; //iterator for right part
        int k = 0; //iterator for temp arr

        //compare the both part & copy the smaller part in temp arr
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
        //remaning left parrt
        while (i<=mid) {
            temp[k++]=arr[i++];
        }
        //remaning right part
        while (j<=ei) {
            temp[k++]=arr[j++];
        }
        //copy the temp to original arr
        for(k=0,i=si; k<temp.length; k++,i++){
            arr[i]=temp[k];
        }
    }

    
    
    public static boolean isSafe(char board[][],int row, int col){
        //Vertical Up
         for(int i=row-1; i>=0; i--){
            if (board[i][col]=='Q') {
                return false;
            }
         }
        //Diagonal Left Up
        for(int i=row-1,j=col-1; i>=0 && j>=0; i--,j--){
            if (board[i][j]=='Q') {
                return false;
            }
        }
        //Diagonal Right Up
        for(int i=row-1,j=col+1; i>=0 && j<board.length; i--,j++){
            if (board[i][j]=='Q') {
                return false;
            }
        }
        return true;
    }
    public static void  printBoard(char board[][]){
        System.out.println("-------Chess Board------");
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void n_Queens(char board[][], int row){
        //Base Case
        if (row==board.length) {
            printBoard(board);
            return;
        }

        for(int j=0; j<board.length; j++){
            if(isSafe(board, row, j)){
                board[row][j] = 'Q';
                n_Queens(board, row+1);
                board[row][j] = 'X';
            }
           
        }
    }
    public static boolean sum(int arr[],int k){
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if ((arr[i]+arr[j])==k) {
                    return true;
                }
            }
        }
        
        return false;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int arr[] = {5,4,1,3,2};
        // insertionSort(arr);
        // printArr(arr);
       

        //Q2)[1497]Check if array pairs are divisible by K.
        // int arr[]={1,2,3,4,5,10,6,7,8,9};
        // System.out.println("Enteer the value of K: ");
        // int k = sc.nextInt();
        // System.out.println(canArrange(arr, k)); 
            
        //Q3)[1331]Given an array of integers arr, replace each element with its rank.
        // int arr[] = {23,43,54,12,4};
        // int res[] = arrayRankTransform(arr);
        // for(int i=0; i<res.length; i++){
        //     System.out.print(res[i]+" ");
        // }

        //----MERGE SORT--
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

        //Q)Place the N-Queens on the chess board
        // System.out.println("ENter the number of Queen: ");
        // int N = sc.nextInt();

        // char board[][] = new char[N][N];
        // for(int i=0; i<N; i++){
        //     for(int j=0; j<N; j++){
        //         board[i][j] = 'X';
        //     }
        // }
        // n_Queens(board, 0);

        //
        // System.out.println("Length: ");
        // int len = sc.nextInt();
        // int arr[] = new int[len];
        // System.out.println("value:");
        // for(int i=0; i<len; i++){
        //     arr[i]=sc.nextInt();
        // }
        // System.out.println("array");
        // for(int i=0; i<len; i++){
        //     System.out.print(arr[i]+" ");
        // }
        // for(int i=0; i<arr.length-1; i++){
            
        //         if(arr[i]<arr[i+1]){
        //             int temp=arr[i+1];
        //             arr[i+1]=arr[i];
        //             arr[i]=temp;
        //         }
            
        // }
        // System.out.println("result");
        // for(int i=0; i<arr.length; i++)
        // {
        //     System.out.print(arr[i]+" ");
        // }

        //Q)
        System.out.println("Enter the length of Array: ");
        int len = sc.nextInt();
        int arr[] = new int[len];
        System.out.println("Enter the value: ");
        for(int i=0; i<len; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array is: ");
        for(int i=0; i<len; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Enter key: ");
        int k = sc.nextInt();
        System.out.println(sum(arr, k));
        
    }
}
