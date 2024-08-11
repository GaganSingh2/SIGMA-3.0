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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {5,4,1,3,2};
        insertionSort(arr);
        printArr(arr);
       

        //Q2) CHeck the given integer is palindrome or not
    }
}
