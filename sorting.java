import java.util.Scanner;

public class sorting {

    public static void bubble_Sort(int arr[]){
        for(int term=0; term<arr.length-1; term++){
            
            for(int j=0; j<arr.length-1-term; j++){
                if (arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    
                }
            }
            
        }
        
        // for(int i=0; i<arr.length; i++){
        //     System.out.print(arr[i]+" ");
        // }
        // System.out.println();
    }
      //Helper function of bubble_sort to print the sorted array
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //---------BUBBLE SORT---------
        System.out.println("Enter the length of Array: ");
        int len = sc.nextInt();

        int arr[] = new int[len];

        System.out.println("ENter the value in Array: ");
        for(int i=0; i<len; i++){
            arr[i] = sc.nextInt();
        }
        bubble_Sort(arr);
        printArr(arr);

        //Time Complexity :- O(n^2)
    }
}
