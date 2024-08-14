import java.util.Scanner;

public class qus_Of_2_D_Array {

    public static void printArr(int arr[][]){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int largestIn_2_D_Array(int arr[][]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if (largest < arr[i][j]) {
                    largest = arr[i][j];
                }
            }
        }
        return largest;
    }

    public static int smallestIn_2_D_Array(int arr[][]){
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if (smallest>arr[i][j]) {
                    smallest = arr[i][j];
                }
            }
        }
        return smallest;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Q1)Find the largest integer in 2-D array

        // System.out.println("ENter the length of row: ");
        // int row = sc.nextInt();

        // System.out.println("Enter the length of column: ");
        // int col = sc.nextInt();

        // int arr[][] = new int[row][col];

        // System.out.println("ENter the value in 2-D Array: ");
        // for(int i=0; i<row; i++){
        //     for(int j=0; j<col; j++){
        //         arr[i][j] = sc.nextInt();
        //     }
        // }
        
        // printArr(arr);
        
        // int res = largestIn_2_D_Array(arr);
        // System.out.println("Largest integer is "+res);


        //Q2)Find the smallest integer in given 2-D Array

        System.out.println("ENter the length of row: ");
        int row = sc.nextInt();

        System.out.println("Enter the length of column: ");
        int col = sc.nextInt();

        int arr[][] = new int[row][col];

        System.out.println("Enter the value in Array: ");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        printArr(arr);

        int res = smallestIn_2_D_Array(arr);
        System.out.println("Smallest integer is "+res);
           
        //Time Complexity
    }
}
