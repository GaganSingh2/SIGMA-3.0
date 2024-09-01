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

    public static int countSetBit(int num){
        int count = 0;
        while (num > 0) {
            if((num & 1) != 0) { //when our LSB is not 0 then count increase.
                count++;
            }
            num = num >> 1;
        }
        return count;
    }

    public static int countSetBitfrom1toRange(int num){
        int count = 0;
        while (num > 0) {
            num &= (num - 1);
            count++;
        }
        return count;
    }

    public static void swapTwoNumber(int num1, int num2){
        //Swap of two number
        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;
        System.out.println("After Swaping-----");
        System.out.println("Num1: "+num1+", Num2: "+num2);
    }

    public static void add1ToInteger(int num){
        int ans = (-~num);//i.e. num+1.
        System.out.println("Result is: "+ans);
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

      
        //Q3)Count the Set Bits in a given number(i.e.:- hume count karna hai ki humare given number ke bit me kiten 1 hai.)
        // System.out.println("Enter the number: ");
        // int num = sc.nextInt();
        // int result = countSetBit(num);
        // System.out.println("Set Bit is "+result+"-times Appeared.");


        //Q4)You are given a number N. Find the total count of set bits for all numbers from 1 to N(both inclusive).
        // System.out.println("Enter the number: ");
        // int num = sc.nextInt();
        // int result = countSetBitfrom1toRange(num);
        // System.out.println(result);


        //Q5) Swap two numbers without using any thirdvariable.
        // System.out.println("Enter the 1st number: ");
        // int num1 = sc.nextInt();
        // System.out.println("Enter the 2nd number: ");
        // int num2 = sc.nextInt();
        // System.out.println("Before Swaping-----");
        // System.out.println("Num1: "+num1+", Num2: "+num2);
        // swapTwoNumber(num1, num2);

        
        //Q6)Add 1 to an integer using Bit Manipulation.(Hint: try using Bitwise NOT Operator).
        // System.out.println("Enter a number: ");
        // int num = sc.nextInt();
        // add1ToInteger(num);


        //Q7) Convert uppercase characters to lowercase using bits.
        // for(char ch='A'; ch<='Z'; ch++){
        //     System.out.println((char)(ch | ' '));
        // }

    }
}
