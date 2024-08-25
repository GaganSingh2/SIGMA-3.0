import java.util.Scanner;

public class qus_of_BitManipulation {

    public static void evenOrOdd(int n){
        int bitMask = 1;
        if ((n & bitMask)==0) {
            System.out.println(n+" is Even Number.");
        }
        else{
            System.out.println(n+" is Odd Number.");
        }
    }

    public static boolean isPower(int num){
        boolean res = false;
        if ((num & (num-1))==0) {
            res = true;
        }
        else{
            res = false;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Q1)Find tthe given number is Even or Odd.
        // System.out.println("Enter the value of N: "); 
        // int n = sc.nextInt();
        // evenOrOdd(n);

        //Q2) Check if a number is Power of 2 or not.
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        boolean result = isPower(num);
        if (result==true) {
            System.out.println(num+" is Power of 2.");
        }
        else{
            System.out.println(num+" is not Power of 2.");
        }
    }
}
