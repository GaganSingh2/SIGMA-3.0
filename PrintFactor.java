import java.util.Scanner;

public class PrintFactor {
    public static boolean isPrime(int v){
        
        for(int i=2; i<=Math.sqrt(v); i++){
            if(v % i==0){
                return false;   
            }
        }
        return true;
    }

    public static void printFactor(int val){
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter Starting value: ");
        // int n = sc.nextInt();
        int n = 2;
        while (val > 1) {
            if (isPrime(n)) {
                if (val % n==0) {
                    System.out.print(n+" ");
                    val = val / n;
                }
                else{
                    n++;
                }
            }
            else{
                n++;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value: ");
        int val = sc.nextInt();
        printFactor(val);
    }
}
