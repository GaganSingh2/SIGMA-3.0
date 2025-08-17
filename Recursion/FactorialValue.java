package Recursion;

import java.util.Scanner;

public class FactorialValue {
    static int facto(int num){
        
        if(num==1){
            return 1;
        }
        return num * facto(num-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the NUmber: ");
        int num = sc.nextInt();
        int res = facto(num);
        System.out.println(res);
    }
}
