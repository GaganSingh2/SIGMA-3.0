import java.util.Scanner;
import java.util.*;
public class CodingNinza {
    public static int square(int num){
        int squ = 0;
        num = Math.abs(num);
        for(int i=0; i<num; i++){
            squ += num;
        }
        return squ;
    }

    public static boolean canBeSumisEven(int val){
        if (val%2==0 && val>=4) {
            return true;
        }
        return false;
    }

    public static double power(int val, int pow){
        double res = Math.pow(val, pow);
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Q1)Given an integer ‘N’, you are supposed to return the square of the given integer without using multiplication (*), division (/) or power function (pow()).
        // System.out.println("Enter the Number: ");
        // int num = sc.nextInt();
        
        // int res = square(num);
        // System.out.println("Sqaure of "+num+" is: "+res);

        //Time Complexity: O(n)
        //Space Complexity: O(1)

        //Q2)You are given a positive integer ‘N’. You have to check whether ‘N’ can be represented as a sum of two even numbers or not.

        // System.out.println("Enter the value: ");
        // int val = sc.nextInt();
        // boolean res = canBeSumisEven(val);
        // if(res==true){
        //     System.out.println("The "+val+" represent as a sum of Two even numbers");
        // }
        // else{
        //     System.out.println("The "+val+" does not represent as a sum of Two even numbers");
        // }

        //Time Complexity: O(n)
        //Space Complexity: O(1)

        //Q2)Find the power of the given value
        System.out.println("Enter the value: ");
        int val = sc.nextInt();
        System.out.println("Enter the time's of power: ");
        int pow = sc.nextInt();
        double res = power(val, pow);
        System.out.println("Result is: "+res);
    }
}
