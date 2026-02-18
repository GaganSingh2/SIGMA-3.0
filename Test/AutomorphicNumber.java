package Test;

import java.util.Scanner;

class AutomorphicNumber {

    public static boolean isAutomorphic(int n){
        if(n<0){
            return false;
        }
        int square = n * n;
        while (n>0) {
            int lastN = n % 10;
            int lastS = square % 10;
            if(lastN != lastS){
                return false;
            }
            n /= 10;
            square /= 10;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        if(isAutomorphic(n)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
/*
the given number is Automorphic 
if the square of the given ends with the original number.
ex: n=5, square = 5 * 5 =>25 (here in 25 is ends 5 i.e n so this is the automorphic) 
ex: n=7, square = 7 * 7 =>49 (here in 49 is not ends with 7 i.e n so this is not the automorphic)
Any negative number is not a Automorphic
 */