import java.util.*;
public class function_qus {

    public static int multiply(int a, int b){
        int product = a*b;
        return product;
    }

    public static int factorial(int num){
        int fac=1;
        for(int i=1; i<=num; i++){
            fac *= i; 
        }
        return fac;
    }

    public static int binCoeff(int n, int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);

        int binCoeff = fact_n / (fact_r * fact_nmr);
        return binCoeff;
    }

    public static int table(int num){
        int gen = 1;
        for(int i=1; i<=10; i++){
            System.out.println(num+" x "+i+" = "+num*i);
        }
        return gen;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        //Q1)find the product of a and b(multiply)
        // int prod = multiply(5,8);
        // System.out.println("Product is "+prod);

        //Q2) Find the factorial of a given number
        // int fact = factorial(5);
        // System.out.println("Factorial is "+fact);

        //Q3) find the binomial coefficient: n!/r!(n-r)!

        // int binomial = binCoeff(5, 2);
        // System.out.println("Bionomial Coefficent is "+binomial);


        //Q3) Find the table of the given number
        int gen = table(5);
        

    }
}
 