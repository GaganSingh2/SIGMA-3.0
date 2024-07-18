import java.util.Scanner;
import java.util.*;

public class qus_of_function {

    public static float avg(float num1, float num2, float num3){
        float result = (num1+num2+num3)/3;
        return result;
    }


    public static boolean isEven(int num){
        //boolean ans = num;
        if (num%2==0) {
            return true;
        }
        else{
            return false;
        }
    }


    public static int isPalindrome(int num){
        int rev=0;
        while (num>0) {
            int lastdigit = num % 10;
            rev = (rev*10)+lastdigit;
            num /= 10;
        }

        return rev;
    }


    public static int sumOfDigit(int num){
        int sum = 0;
        while (num>0) {
            int lastdigit = num%10;
            sum += lastdigit;

            num /= 10;

        }
        return sum;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        //Q1) write a java method to compute the average of three number
        // System.out.println("Enter the first num: ");
        // float a = sc.nextFloat();
        // System.out.println("ENter the second num: ");
        // float b = sc.nextFloat();
        // System.out.println("ENter the third num: ");
        // float c = sc.nextFloat();
        
        // float average = avg(a, b, c);
        // System.out.println("Avg of the given number is "+average);


        //Q2) Write a method named isEven that accept an int argument. the method should return true if the argument is even, or false otherwise. Also write a program to test your method.

        // System.out.println("Enter the number: ");
        // int num = sc.nextInt();
        // if (isEven(num)) {
        //     System.out.println("Number is Even");
        // }
        // else{
        //     System.out.println("Number is Odd");
        // }


        //Q3) Write a java program to check if a number is a palindrome or not.
        // System.out.println("Enter the number: ");
        // int val = sc.nextInt();
        // int ans = isPalindrome(val);
        // if (ans==val) {
        //     System.out.println(val+" is a palindrome");
        // }
        // else{
        //     System.out.println(val+" not a palindrome");
        // }


       //Q4) Write a java method to compute the sum of the digits in an integer.

       System.out.println("Enter the digits: ");
       int digit = sc.nextInt();
       int result = sumOfDigit(digit);
       System.out.println(result);

    }
}
