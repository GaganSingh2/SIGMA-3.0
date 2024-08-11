import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

public class sorting {

    public static void bubble_Sort(int arr[]){
        for(int term=0; term<arr.length-1; term++){
            int swap=0;
            for(int j=0; j<arr.length-1-term; j++){
                if (arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap++;
                }
            }
           System.out.println(swap); 
        }
    }
      //Helper function to print the sorted array
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        
    }

    public static void selectionSort(int arr[]){
        for(int turn=0; turn<arr.length-1; turn++){
            int minPos = turn;
            for(int j=turn+1; j<arr.length; j++){
                if (arr[minPos]>arr[j]) {
                    minPos = j;
                }
            }
            //SWAPING
            int temp = arr[minPos];
            arr[minPos] = arr[turn];
            arr[turn] = temp;
        }
    }


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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //---------BUBBLE SORT---------
        /*In the Bubble sort we compare the first two element and swap them when the first element is greater than the second element theis steps going until when the array is sorted. */

        // System.out.println("Enter the length of Array: ");
        // int len = sc.nextInt();

        // int arr[] = new int[len];

        // System.out.println("ENter the value in Array: ");
        // for(int i=0; i<len; i++){
        //     arr[i] = sc.nextInt();
        // }
        // bubble_Sort(arr);
        // printArr(arr);

        //Time Complexity :- O(n^2)


        //---------SELECTION SORT---------
        /*Pick the smallest integer and put the beginning. find the minimum element and swap with the first element. */
        // System.out.println("Enter the length of Array: ");
        // int len = sc.nextInt();

        // int arr[] = new int[len];

        // System.out.println("ENter the value in Array: ");
        // for(int i=0; i<len; i++){
        //     arr[i] = sc.nextInt();
        // }

        // selectionSort(arr);
        // printArr(arr);


        //----------INSERTION SORT----------
        /*Insertion sort is a simple sorting algorithm that build the sorted array one item at a time. we assume the 0th index is already sorted */

        // System.out.println("Enter the length in Array: ");
        // int len = sc.nextInt();

        // int arr[] = new int[len];

        // System.out.println("Enter the value in Array: ");
        // for(int i=0; i<len; i++){
        //     arr[i] = sc.nextInt();
        // }
        // insertionSort(arr);
        // printArr(arr);
        //Time Complexity:- O(n^2)


        //---------Inbuilt sorting method---------
        // System.out.println("Enter the length of Array: ");
        // int len = sc.nextInt();

        // int arr[] = new int[len];

        // System.out.println("Enter the value in Array: ");
        // for(int i=0; i<len; i++){
        //     arr[i] = sc.nextInt();
        // }

        // Arrays.sort(arr); //Arrays.sort() is a inbuilt function to sort the array
        // printArr(arr);

       // Arrays.sort(arr,0,3); //Arrays.sort(arr[],starting index,last index) iss inbuilt function ke help se hum apne array ke jisss index tak sort karana chahe kara sakte hai. last index jo hum likhte hai o count nhi hota hai usse ak kam index tak array sort hota hai
        //printArr(arr);
        //Time Complexity:- O(n logn). it is a less than of O(n^2)

        
        //-----Inbuilt sorting method for reverse order------
        System.out.println("Enter the length of Array: ");
        int len = sc.nextInt();

        Integer arr[] = new Integer[len]; //yaha humne int ke jagah pe Integer iss liye likha hai kyuki yaha jo reverseOrder function hai oh sirf objects pe kaam karta hai

        System.out.println("Enter the value in Array: ");
        for(Integer i=0; i<len; i++){
            arr[i] = sc.nextInt();
        }

        // Arrays.sort(arr,Collections.reverseOrder()); //ye jo function hai iske help se hum apne array ko decending order me sort karke print karwa skate hai

        Arrays.sort(arr, 0, 4, Collections.reverseOrder()); // yaha humne 

        System.out.println("After Sorting in reverse order: ");
        for(Integer i=0; i<len; i++){
            System.out.println(arr[i]+" ");
        }

    }
}
