import java.util.Scanner;



public class bit_Wise_Operator {

    public static int get_ith_bit(int num, int pos){
        int bit_mask = (1<<pos);
        if ((num & bit_mask)==0) {
            return 0;
        }
        else{
            return 1;
        }
    }

    public static int set_ith_bit(int num, int pos){
        int bit_mask = (1<<pos);
        int res = (num | bit_mask);
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //---------BINARY AND(&)-----------
        /* Each bit in the result is set to 1 only if the corresponding bits in both input numbers are 1. Otherwise, the bit in the result is set to 0. in this program 1stly we convert the both number in binary number and then perform the AND operation */

        // System.out.println("Enter the first number: ");
        // int num1 = sc.nextInt();
        // System.out.println("ENter the second number: ");
        // int num2 = sc.nextInt();

        // int result = (num1 & num2);
        // System.out.println("Result is: "+result);

 
        //------------BINARY OR(|)----------
        /*Each bit in the result is set to 1 if at least one of the corresponding bits in the input numbers is 1. */

        // System.out.println("ENter the first number: ");
        // int num1 = sc.nextInt();
        // System.out.println("Enter the second number: ");
        // int num2 = sc.nextInt();

        // int result = (num1 | num2);
        // System.out.println("Result is: "+result);


        //-----------BINARY XOR(^)----------
        /* Each bit in the result is set to 1 if the corresponding bits in the input numbers are different. */

        // System.out.println("ENter the first number: ");
        // int num1 = sc.nextInt();
        // System.out.println("Enter the second number: ");
        // int num2 = sc.nextInt();

        // int result = (num1^num2);
        // System.out.println("Result is: "+result);


        //----------BINARY ONE's COMPLEMENT----------
        /*Binary One's Complement is a bitwise operation that inverts all the bits of a binary number. It essentially changes all 0s to 1s and all 1s to 0s. */

        // System.out.println("Enter first number: ");
        // int num1 = sc.nextInt();

        // int result = (~num1);
        // System.out.println("Result is: "+result);


        //----------BINARY LEFT SHIFT(<<)---------
        /*Binary Left Shift is a bitwise operation that shifts all bits of a number to the left by a specified number of positions. The vacated positions on the right are filled with 0s. ex:- a<<b */

        // System.out.println("Enter the value of A: ");
        // int a = sc.nextInt();
        // System.out.println("Enter the value of B: ");
        // int b = sc.nextInt();

        // int result = (a<<b);
        // System.out.println("Result is: "+result);


        //----------BINARY RIGHT SHIFT(>>)---------
        /*Binary Right Shift is a bitwise operation that shifts all bits of a number to the right by a specified number of positions. Opposite of BINARY LEFT SHIFT EX:- a>>b */

        // System.out.println("Enter the value of A: ");
        // int a = sc.nextInt();
        // System.out.println("Enter the value of B: ");
        // int b = sc.nextInt();

        // int result = (a>>b);
        // System.out.println("Result is: "+result);


        //-----------OPERATION ON BIT-MANIPULATION--------
        /*a) Get ith bit:- Getting the ith Bit refers to extracting the value of the ith bit from a binary number. The least significant bit is considered the 0th bit, so the ith bit is the bit at position i from the right. Approach:- n & (1<<i) */

        // System.out.println("Enter the Number: ");
        // int num = sc.nextInt();
        // System.out.println("Enter the value of Position: ");
        // int pos = sc.nextInt();
        // int res = get_ith_bit(num, pos);
        // System.out.println(res+" is Position on "+pos+"th");

        
        /*b) Set ith bit:- Setting the ith Bit refers to modifying a specific bit in a binary number to 1. The least significant bit is considered the 0th bit, so the ith bit is the bit at position i from the right.*/

        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        System.out.println("Enter the value of Position: ");
        int pos = sc.nextInt();
        int result = set_ith_bit(num, pos);
        System.out.println("Result is: "+result);
    }
}
