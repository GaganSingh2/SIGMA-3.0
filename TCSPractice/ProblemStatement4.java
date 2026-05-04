package TCSPractice;

import java.util.Scanner;

public class ProblemStatement4 {
    public static int remainMonkeyOnTree(int n, int k, int j, int m, int p){
        if(k==0 || j==0) return n;

        int totalMonkeyEatBanana = m / k;
        int rem_Banana = m % k;
        if (rem_Banana != 0) {
            totalMonkeyEatBanana++;
        }

        int totalMonkeyEatPeanuts = p / j;
        int rem_peanut = p % j;
        if (rem_peanut != 0) {
            totalMonkeyEatPeanuts++;
        }
        
        int leftMonkey = n - (totalMonkeyEatBanana + totalMonkeyEatPeanuts);

        

        return Math.max(leftMonkey, 0); //to avoid negative 
    }
    public static void main(String[] args) {
        // Q)Find how many monkeys are remain uneaten the bananas and peanuts.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //no of monkeys
        int k = sc.nextInt(); //no of eatable bananas by single monkey
        int j = sc.nextInt(); //no of peanuts bananas by single monkey
        int m = sc.nextInt(); //total no of bananas
        int p = sc.nextInt(); //total no of peanuts
        System.out.println(remainMonkeyOnTree(n, k, j, m, p));
    }
}
