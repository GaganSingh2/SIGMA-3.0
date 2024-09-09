import java.util.Scanner;

public class QusOfRecursion {
    public static void printDec(int num){
        if (num==1) {
            System.out.print(num);
            return;
        }
        System.out.print(num+" ");
        printDec(num-1);
    }

    public static void printInc(int num){
        if (num==1) {
            System.out.print(num+" ");
            return;
        }
        printInc(num-1);
        System.out.print(num+" ");
    }


    public static int fact(int num){
        if (num==0) {
            return 1;
        }
        int fnm1 = fact(num-1);//fnm1 means ye ak variable hai 
        int fn = num * fnm1;
        return fn;
    }

    public static int sumOfNnaturalnum(int num){
        if (num==1) {
            return 1;
        }
        int snm1 = sumOfNnaturalnum(num-1);
        int sum = num + snm1;
        return sum;
    }

    public static int fibonacci(int num){
        if (num==0) {
            return 0;
        }
        if (num==1) {
            return 1;
        }
        int fnm1 = fibonacci(num-1);
        int fnm2 = fibonacci(num-2);
        int sum = fnm1 + fnm2;
        return sum;

    }

    public static boolean isSorted(int arr[], int i){
        //Base case
        if (i==arr.length-1) {
            return true;
        }
        if (arr[i]>arr[i+1]) {
            return false;
        }
        return isSorted(arr, i+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Q1) Print numbers from n to 1 (Decreasing order).
        // System.out.println("Enter Max value: ");
        // int num = sc.nextInt();
        // printDec(num);

        //Q2)Print numbers from 1 to n(Increasing order)
        // System.out.println("Enter Number: ");
        // int num = sc.nextInt();
        // printInc(num);

        //Q3)Print a factorial of a number.
        // System.out.println("Enter a number: ");
        // int num = sc.nextInt();
        // int res = fact(num);
        // System.out.println("Factorial: "+res);

        //Time Complexity:- O(n).
        //Space Complexity:- O(n).

        //Q4) print sum of first n natural numbers.
        // System.out.println("ENter a number: ");
        // int num = sc.nextInt();
        // int res = sumOfNnaturalnum(num);
        // System.out.println("Sum: "+res);

        //Time Complexity:- O(n).
        //Space Complexity:- O(n).

        //Q5)Print Nth fibonacci number.
        // System.out.println("Enter a Number: ");
        // int num = sc.nextInt();
        // int res = fibonacci(num);
        // System.out.println("Result: "+res);

        //Time COmplexity:- O(2^n)
        //Space Complexity:- O(n).

        //Q6)Check if the given array is sorted or not.
        System.out.println("Enter the length of Array: ");
        int len = sc.nextInt();

        int arr[] = new int[len];
        System.out.println("Ennter the value in Array: ");
        for(int i=0; i<len; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Array: ");
        for(int i=0; i<len; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        boolean res = isSorted(arr, 0);
        if (res==true) {
            System.out.println("Array is Sorted.");
        }
        else{
            System.out.println("Array is not Sorted.");
        }
    }
}
