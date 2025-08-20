package Recursion;

public class NthFibboUsingFromula {
    public static void main(String[] args) {
       for (int i = 0; i <= 7; i++) {
            System.out.print(fibboUsingFormula(i) + " ");
        }System.out.println();

        System.out.println("----------------");
        System.out.println(fibboUsingFormula(100));
    }

    static long fibboUsingFormula(int n) { // TC: O(1.6180)^n
        double phi = (1 + Math.sqrt(5)) / 2;
        return (long) ((Math.pow(phi, n) ) / Math.sqrt(5));
    }
}
