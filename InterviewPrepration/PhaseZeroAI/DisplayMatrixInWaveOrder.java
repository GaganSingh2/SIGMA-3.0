package InterviewPrepration.PhaseZeroAI;

import java.util.Scanner;

public class DisplayMatrixInWaveOrder {
    public static void displayMatrixInWaveOrder(int arr[][]){
        System.out.println("Wave Order: ");
        for(int i=0; i<arr.length; i++){
            if(i % 2 == 0){
                for(int j=0; j<arr[0].length; j++){
                    System.out.print(arr[j][i]+" ");
                }
            }
            else{
                for(int j=arr[0].length-1; j>=0; j--){
                    System.out.print(arr[j][i]+" ");
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length: ");
        int len = sc.nextInt();
        int arr[][] = new int[len][len];
        System.out.println("Enter Value: ");
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix: ");
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        displayMatrixInWaveOrder(arr);
    }
}
