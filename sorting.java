import java.util.Scanner;

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
        System.out.println("Enter the length in Array: ");
        int len = sc.nextInt();

        int arr[] = new int[len];

        System.out.println("Enter the value in Array: ");
        for(int i=0; i<len; i++){
            arr[i] = sc.nextInt();
        }
        insertionSort(arr);
        printArr(arr);
    }
}
