import java.util.Scanner;

public class GFG_Qus {
    
    public static int posRightMostSet(int num1, int num2){
        //if both value are same
        if(num1 == num2){
            return -1;
        }
        //firstly find the Exor of both number
        int value = num1 ^ num2;
        //Isolate the rightmost bit using Value & (-Value)
        int rightmostset = value & (-value);

        int pos = 1;
        //find the position 
        while ((rightmostset >>= 1) != 0) {
            pos++;
        }
        return pos;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Q1) Given two numbers m and n. The task is to find the position of the rightmost different bit in the binary representation of numbers. If both m and n are the same then return -1 in this case.
        System.out.println("ENter the Fisrt Value: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the Second Value: ");
        int num2 = sc.nextInt();
        int position = posRightMostSet(num1, num2);
        System.out.println("Postion of the Set Bit: "+position);
    }
}
