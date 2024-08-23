import java.util.Scanner;



public class bit_Wise_Operator {
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

        System.out.println("Enter the value of A: ");
        int a = sc.nextInt();
        System.out.println("Enter the value of B: ");
        int b = sc.nextInt();

        int result = (a>>b);
        System.out.println("Result is: "+result);
    }
}
