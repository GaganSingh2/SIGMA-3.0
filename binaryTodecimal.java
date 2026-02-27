import java.util.Scanner;

public class binaryTodecimal {

    public static void binToDec(int binNum){
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;
        while (binNum > 0) {
            int lastDigit = binNum%10;
            decNum = decNum + (lastDigit * (int)Math.pow(2,pow));

            pow++;
            binNum = binNum/10;
           
        }
        System.out.println("Decimal of "+myNum+" = "+decNum);
        
    }


    public static void decToBin(int decNum){
        int myNum = decNum;
        int pow = 0;
        int binNum = 0;
        
        while (decNum > 0) {
            int rem = decNum % 2;
            binNum = binNum + (rem * (int)Math.pow(10, pow));

            pow++;
            decNum /= 2;
        }
        System.out.println("Binary of "+myNum+" = "+binNum);
    }

    public static void main(String[] args) {
        
        //Q)Convert From Binary to Decimal
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the Binary number: ");
        // int binNum = sc.nextInt();
        // binToDec(binNum); 


        //Q2) Convert from Decimal to Binary
        System.out.println("Enter the decimal number: ");
        int decNum = sc.nextInt();
        decToBin(decNum);
        
    }
}
