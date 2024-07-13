import java.util.Scanner;
import java.util.*;
public class prime_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Q)CHeck if a number is prime or not
        System.out.println("Enter your number: ");
        int num = sc.nextInt();

        if (num==2) {
            System.out.println(num+" is a prime number");
        }
        else{
            boolean isPrime = true;
            //for(int i=2; i<=num-1; i++)
            for(int i=2; i<=Math.sqrt(num); i++){ // ye square root likhne ka tarika hai num ka
                if (num%i==0) {
                    isPrime = false;
                }

            }
            if ( isPrime==true) {
                System.out.println(num+" is a prime number");
            }
            else{
                System.out.println(num+" is not a prime number");
            }
        }
    }
}
