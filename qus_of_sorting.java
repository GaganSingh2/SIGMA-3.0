import java.util.Scanner;

public class qus_of_sorting {

    public static void bubble_Sort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1-i; j++){
                if (arr[j]<arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
     
    //Helper function for print the sorted array
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void selectionSort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int minPos = i;
            for(int j=i+1; j<arr.length; j++){
                if (arr[minPos]<arr[j]) {
                    minPos = j;
                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void insertionSort(int arr[]){
        for(int i=1; i<arr.length; i++){
            int curr = arr[i];
            int prev = i-1;
            //Finding out the correct position to insert
            while (prev >= 0 && arr[prev] < curr) {
                arr[prev+1] = arr[prev];
                prev--;
            }
            //for insertion
            arr[prev+1] = curr;
        }
    }

    public static void countingSort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }

        //for count the frequency
        int count[] = new int[largest+1];
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }

        //for sorting
        int j=0;
        for(int i=count.length-1; i>=0; i--){
            while (count[i]>0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
        
       
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Q) Use the following sorting algorithm to sot an array in DESCENDING order.
        //a) Bubble Sort

        // System.out.println("Enter the length of Array: ");
        // int len = sc.nextInt();

        // int arr[] = new int[len];

        // System.out.println("Enter the value in Array: ");
        // for(int i=0; i<len; i++){
        //     arr[i] = sc.nextInt();
        // }
        // bubble_Sort(arr);
        // printArr(arr);

        //b)Selection Sort 

        // System.out.println("Enter the lenght of Array: ");
        // int len = sc.nextInt();

        // int arr[] = new int[len];

        // System.out.println("Enter the value in Array: ");
        // for(int i=0; i<len; i++){
        //     arr[i] = sc.nextInt();
        // }
        // selectionSort(arr);
        // printArr(arr);

        //c)Insertion Sort

        // System.out.println("Enter the length of Array: ");
        // int len = sc.nextInt();

        // int arr[] = new int[len];

        // System.out.println("Enter the value in Array: ");
        // for(int i=0; i<len; i++){
        //     arr[i] = sc.nextInt();
        // }
        // insertionSort(arr);
        // printArr(arr);


        //Counting Sort
        System.out.println("Enter the length of Array: ");
        int len = sc.nextInt();

        int arr[] = new int[len];

        System.out.println("ENter the value in Array: ");
        for(int i=0; i<len; i++){
            arr[i] = sc.nextInt();
        }
        countingSort(arr);
        printArr(arr);
    }
}
