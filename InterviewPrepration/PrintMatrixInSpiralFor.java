package InterviewPrepration;

import java.util.Scanner;

public class PrintMatrixInSpiralFor {
    public static void create2_D_Array(int arr[][]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value: ");
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("2-D Array: ");
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void printSpiralMatrix(int arr[][]){
        int startRow = 0, endRow = arr.length-1;
        int startCol = 0, endCol = arr[0].length-1;

        while (startCol<=endCol && startRow<=endRow) {
            //Print Top Row(startCol -> endCol and startRow(fix))
            for(int j=startCol; j<=endCol; j++){
                System.out.print(arr[startRow][j]+" ");
            }

            //print Right Column(startRow+1 -> endRow and endCol(fix))
            for(int i=startRow+1; i<=endRow; i++){
                System.out.print(arr[i][endCol]+" ");
            }

            //print Bottom Row(endCol-1 -> startCol and endRow(fix))
            for(int j=endCol-1; j>=startCol; j--){
                if (startRow == endRow) {
                    break; //bcz this value is already print using Top Row
                }
                System.out.print(arr[endRow][j]+" ");
            }

            //print Left Column (endRow-1 -> startRow+1 and startCol(fix))
            for(int i=endRow-1; i>=startRow+1; i--){
                if (startCol == endCol) {
                    break;//bcz this value is already print using Right Column
                }
                System.out.print(arr[i][startCol]+" ");
            }

            startCol++;
            endCol--;
            startRow++;
            endRow--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Row: ");
        int row = sc.nextInt();

        System.out.println("Enter Column: ");
        int col = sc.nextInt();

        int arr[][] = new int[row][col];

        create2_D_Array(arr);

        printSpiralMatrix(arr);
    }
}
