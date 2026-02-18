package Test;

import java.util.Scanner;

public class OctalToBinary {

    public static long toBinary(int n){
        if (n<0) {
            return -1;
        }
        long binary = 0;
        long place = 1;
        while (n>0) {
            int digit = n % 10;
            if (digit>7) {
                return -1;
            }
           
            for(int i=0; i<3; i++){
                int lastD = digit % 2;
                binary += lastD * place;
                place *= 10;
                digit /= 2;
            }
            n /= 10;
        }
        
        return binary;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Octal: ");
        int n = sc.nextInt();
        long binary = toBinary(n);
        if(binary == -1){
            System.out.println("Invalid Octal");

        }
        else{
            System.out.println(binary);
        }
    }
}
