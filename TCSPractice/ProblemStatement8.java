package TCSPractice;

import java.util.Scanner;

public class ProblemStatement8 {
    public static int totalFullParkingInRow(int parking[][]){
        int rowNum = -1;
        int tmpOne = 0;
        for(int i=0; i<parking[0].length; i++){
            int cntOne = 0;
            for(int j=0; j<parking.length; j++){
                if (parking[i][j]==1) {
                    cntOne++;
                }
            }
            if (cntOne>tmpOne) {
                rowNum = i;
                tmpOne = cntOne;
            }
            
        }
        return rowNum+1;
    }
    public static void main(String[] args) {
        // Q)A parking lot in a mall has RxC number of parking space. each parking space will either be empty(0) or full(1). the status(0/1) of a parking space is represent as the element of matrix. the task is to find index of the row(R) in the parking lot that has the most of the parking space full(1)
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        int parking[][] = new int[row][col];
        for(int i=0; i<parking[0].length; i++){
            for(int j=0; j<parking.length; j++){
                parking[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<parking[0].length; i++){
            for(int j=0; j<parking.length; j++){
                System.out.print(parking[i][j]+" ");
            }System.out.println();
        }
        
        System.out.println(totalFullParkingInRow(parking));
    }
}
