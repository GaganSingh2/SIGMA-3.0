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

    public static void printSpiral(int matrix[][]){
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;
        

        while (startRow<=endRow && startCol<=endCol) {
            //Print-Top
            for(int j=startCol; j<=endCol; j++){
                System.out.print(matrix[startRow][j]+" ");
            }

            //Print-Right
            for(int i=startRow+1; i<=endRow; i++){
                System.out.print(matrix[i][endCol]+" ");
            }

            //Print-Bottom
            for(int j=endCol-1; j>=startCol; j--){
                if (startRow==endRow) {
                    break;
                }
                System.out.print(matrix[endRow][j]+" ");
            }

            //Print-Left
            for(int i=endRow-1; i>=startCol+1; i--){
                if (startCol==endCol) {
                    break;
                }
                System.out.print(matrix[i][startCol]+" ");
            }
            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
        System.out.println();
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

        // System.out.println("ENter the length of row: ");
        // int row = sc.nextInt();

        // System.out.println("Enter the length of column: ");
        // int col = sc.nextInt();

        // int arr[][] = new int[row][col];

        // System.out.println("Enter the value in Array: ");
        // for(int i=0; i<row; i++){
        //     for(int j=0; j<col; j++){
        //         arr[i][j] = sc.nextInt();
        //     }
        // }
        // printArr(arr);

        // int res = smallestIn_2_D_Array(arr);
        // System.out.println("Smallest integer is "+res);
           
        //Time Complexity

        //Print the each element in present in spiral matrix
        System.out.println("Enter the length of row: ");
        int row = sc.nextInt();

        System.out.println("Enter the length of column: ");
        int col = sc.nextInt();

        int matrix[][] = new int[row][col];

        System.out.println("ENter the value in Matrix Array: ");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        printArr(matrix);
        printSpiral(matrix);
        
        //this question is the asking in the google, oracle,amazon etc. DSA interviews.

    }
}
