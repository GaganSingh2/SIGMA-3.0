package TCSPractice;

import java.util.Scanner;

public class ProblemStatement11 {
    public static int nonRepetiveELement(int arr[]){
        int res = arr[0];
        for(int i=1; i<arr.length; i++){
            res = res ^ arr[i];
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(nonRepetiveELement(arr));

    }
}
