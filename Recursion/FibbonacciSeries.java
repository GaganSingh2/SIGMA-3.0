package Recursion;

import java.util.Scanner;

public class FibbonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the series no: ");
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            System.out.print(fibbonacciSeries(i)+" ");
        }
    }

    static int fibbonacciSeries(int n){
        if(n==0) return 0;
        if(n==1) return 1;

        int fib1 = fibbonacciSeries(n-1);
        int fib2 = fibbonacciSeries(n-2);

        //THis is not call tail recursion because fib1 gives ans and fib2 gives ans then add both and  return this sum is called tail recursion
        return fib1+fib2;
    }
    
}
