import java.util.*;

public class function_qus {

    public static int multiply(int a, int b) {
        int product = a * b;
        return product;
    }

    public static int factorial(int num) {
        int fac = 1;
        for (int i = 1; i <= num; i++) {
            fac *= i;
        }
        return fac;
    }

    public static int binCoeff(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n - r);

        int binCoeff = fact_n / (fact_r * fact_nmr);
        return binCoeff;
    }

    public static int table(int num) {
        int gen = 1;
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + num * i);
        }
        return gen;
    }

    public static boolean isPrime(int num) {
        // Corner case for 2
        if (num == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void PrimesInRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) { // true
                System.out.print(i + " ");

            }
        }
        System.out.println();

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Q1)find the product of a and b(multiply)
        // int prod = multiply(5,8);
        // System.out.println("Product is "+prod);

        // Q2) Find the factorial of a given number
        // int fact = factorial(5);
        // System.out.println("Factorial is "+fact);

        // Q3) find the binomial coefficient: n!/r!(n-r)!

        // int binomial = binCoeff(5, 2);
        // System.out.println("Bionomial Coefficent is "+binomial);

        // Q3) Find the table of the given number
        // int gen = table(5);

        // Q4)FInd the givenn number is prime or not
        // System.out.println("ENter the number: ");
        // int num = sc.nextInt();
        // boolean result = isPrime(num);
        // if (result) {
        // System.out.println(num+" is a Prime number");
        // }
        // else{
        // System.out.println(num+" is not a Prime number");
        // }

        // Q5)print the all primes in range(n)
        System.out.println("Enter the range: ");
        int n = sc.nextInt();
        PrimesInRange(n);

    }
}
