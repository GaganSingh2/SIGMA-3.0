import java.util.Scanner;

import javax.swing.text.Style;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Q)Given number is prime or not.
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        if (num==2) {
            System.out.println(num+" is a prime number");
        }
        else{
            boolean isPrime = true;
            for(int i=2; i<=num-1;i++){
                if (num%i==0) {
                    isPrime = false;
                }
                
            }
            if (isPrime==true) {
                System.out.println(num+" is a prime number");
            }
            else{
                System.out.println(num+" is not a prime number");
            }
        }

        //Q2) CHeck the given integer is palindrome or not
    }
}
