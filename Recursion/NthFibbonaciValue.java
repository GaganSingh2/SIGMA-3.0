package Recursion;

import java.util.Scanner;

public class NthFibbonaciValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Nth Position: ");
        int nth = sc.nextInt();

        int val = nthFibbonaciValue(nth);
        System.out.println(nth+" Fibbonacci Value is: "+val);
    }

    static int nthFibbonaciValue(int nth){
        if(nth==0) return 0;
        if(nth==1) return 1;

        int fib1 = nthFibbonaciValue(nth-1);
        int fib2 = nthFibbonaciValue(nth-2);

        return fib1 + fib2;
    }
}
