package Recursion;

import java.util.Scanner;

public class SumOfNNatural {
    static int sumOfNNatural(int n){
        if(n==1){
            return 1;
        }
        return n + sumOfNNatural(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Range: ");
        int n = sc.nextInt();
        int res = sumOfNNatural(n);
        System.out.println(res);
    }
}
