package TCSPractice;

import java.util.Scanner;

public class ProblemStatement2 {
    public static void main(String[] args) {
        // Q)Given an integer aary arr of size n the task is to find the count of elements whose value is greater than all of its previous elemenets. Note: 1st element of array should be considered in the count of the result. for ex,arr[] = {7,4,8,2,9} as 7 is the first element, it will consider in result, 8 and 9 are also elements that are greater than all of its previous element, so answer is 3.
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int arr[] = new int[size];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int cnt = 1;
        int lastMax = arr[0];
        for(int i=1; i<arr.length; i++){
            int currVal = arr[i];
            if(currVal>lastMax){
                cnt++;
                lastMax = currVal;
            }
        }
        System.out.println(cnt);
    }
}
