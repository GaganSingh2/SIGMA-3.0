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

    public static int clear_ith_bit(int num, int pos){
        int bit_mask = ~(1<<pos);
        int res = (num & bit_mask);
        return res;
    }
     
    public static int update_ith_bit(int num, int pos, int updateBit){
        //1st Approach
        // if (updateBit==0) {
        //     return clear_ith_bit(num, pos);
        // }
        // else{
        //     return set_ith_bit(num, pos);
        // }

        //2nd Approach
        num = clear_ith_bit(num, pos);
        int bit_mask = updateBit<<pos;
        return num | bit_mask;
    }

    public static int clear_last_i_bits(int num, int pos){
        int bit_mask = ((~0)<<pos); //yaha hum (~0) ya  -1 use kar sakte hai
        int res = num & bit_mask;
        return res;
    }

    public static int clear_bits_of_range(int num, int i, int j){
        int a = ((~0)<<(j+1));
        int b = ((1<<i)-1);
        int bit_mask = a | b;
        int res = num & bit_mask;
        return res;
    }

    public static int fastExpo(int num, int pow){
        int ans = 1;
    
        while (pow>0) {
            if((pow & 1) != 0) {
                ans *= num;   
            }
            num = num * num;
            pow = pow>>1;
        }
        return ans;
    }

    public static int modularExponentiation(int num, int pow, int mod){
        int ans = 1;
        while (pow>0) {
            if ((pow & 1)!=0) {
                ans = (ans*num)%mod;
            }
            num = (num*num)%mod;
            pow >>= 1;
        }
        return ans;
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

        // System.out.println("Enter the number: ");
        // int num = sc.nextInt();
        // System.out.println("Enter the value of Position: ");
        // int pos = sc.nextInt();
        // int result = set_ith_bit(num, pos);
        // System.out.println("Result is: "+result);


        /*c) Clear ith bit:- Clearing the ith Bit refers to setting a specific bit in a binary number to 0. The least significant bit is considered the 0th bit, so the ith bit is the bit at position i from the right. */

        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        System.out.println("Enter the Position: ");
        int pos = sc.nextInt();
        int result = clear_ith_bit(num, pos);
        System.out.println("Result is: "+result);


        /*d) Update ith Bit:- Updating the ith Bit refers to modifying a specific bit in a binary number to a desired value. The least significant bit is considered the 0th bit, so the ith bit is the bit at position i from the right.  */

        // System.out.println("Enter the number: ");
        // int num = sc.nextInt();
        // System.out.println("Enter the Position: ");
        // int pos = sc.nextInt();
        // System.out.println("Enter the Updation Bit: ");
        // int UpdateBit = sc.nextInt();
        // int res = update_ith_bit(num, pos, UpdateBit);
        // System.out.println("Result is: "+res);


        /*e) Clear last i bits:- To clear the last i bits of a number, you can perform a bitwise AND operation with a mask that has all bits except the last i bits set to 1. This will effectively clear the least significant i bits of the number to 0. */

        // System.out.println("Enter the Number: ");
        // int num = sc.nextInt();
        // System.out.println("Enter the Position: ");
        // int pos = sc.nextInt();
        // int result = clear_last_i_bits(num, pos);
        // System.out.println("Result is: "+result);


        /*f) Clear Range Of Bits:-To clear a range of bits from a number, you can perform a bitwise AND operation with a mask that has all bits except the desired range set to 1. This effectively clears the bits within the specified range of given start and end to 0 while preserveing the other bits.*/

        // System.out.println("Enter the number: ");
        // int num = sc.nextInt();
        // System.out.println("Enter the Start-Point: ");
        // int i = sc.nextInt();
        // System.out.println("Enter the End-Point: ");
        // int j = sc.nextInt();
        // int result = clear_bits_of_range(num, i, j);
        // System.out.println("Result is: "+result);


        //-----Fast Exponantiation(means find the power of number in less time)----
        // System.out.println("ENter the number: ");
        // int num = sc.nextInt();
        // System.out.println("Enter the Power: ");
        // int pow = sc.nextInt();
        // int result = fastExpo(num, pow);
        // System.out.println("Result is: "+result);


        //----Modular Exponentiation-----
        // System.out.println("Enter the number: ");
        // int num = sc.nextInt();
        // System.out.println("ENter the Power: ");
        // int pow = sc.nextInt();
        // System.out.println("Enter the Modular: ");
        // int mod = sc.nextInt();
        // int result = modularExponentiation(num, pow, mod);
        // System.out.println("Result is: "+result);
    }
}
