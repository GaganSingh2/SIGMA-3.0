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

        System.out.println("ENter the first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();

        int result = (num1^num2);
        System.out.println("Result is: "+result);
    }
}
