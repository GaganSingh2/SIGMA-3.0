public class Recursion_Test {
    public static void printInc(int n){
        if(n==1){
            System.out.print(1+" ");
            return;
        }
        
        printInc(n-1);
        System.out.print(n+" ");
    }

    public static void printDec(int n){
        if(n==1){
            System.out.print(1+" ");
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }

    public static int factorial(int val){
        if(val==1 || val==0){
            return 1;
        }
        int fn_1 = factorial(val-1);
        int fn = val * fn_1;
        return fn;
    }

    public static int fibonacci(int val){
        if(val==0){
            return 0;
        }
        if(val==1){
            return 1;
        }
        int fn_1 = fibonacci(val-1);
        int fn_2 = fibonacci(val-2);
        int res = fn_1 + fn_2;
        return res;
    }

    public static int power(int val,int pow){
        if (pow==0){
            return 1;
        } 
        int pnbm = power(val, pow-1);
        int res = val * pnbm;
        return res;
    }
    public static void main(String[] args) {
        printInc(10);
        System.out.println();
        printDec(10);

        System.out.println();
        int res = factorial(5);
        System.out.println("Factorial of 5 is: "+res);
        System.out.println();
        // fibonacci(5);
        System.out.println("Fibonacci of 5 is: ");
        for(int i=0; i<5; i++){
            System.out.print(fibonacci(i)+" ");
        }

        System.out.println();
        int res3 = power(2,4);
        System.out.println("2 to the power of 4 is: "+res3);
    }
}
