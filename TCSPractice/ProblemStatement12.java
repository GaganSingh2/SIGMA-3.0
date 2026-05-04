package TCSPractice;
import java.util.*;
public class ProblemStatement12 {
    public static boolean isPrime(int num){
        if(num<=1) return false;

        for(int i=2; i<=Math.sqrt(num); i++){
            if(num % i==0){
                return false;
            }
        }
        return true;
    }
    public static int sumOfPrimeNum(int n){
        int sum = 0;
        int cnt = 0;
        for(int num=2; cnt<n; num++){
            if(isPrime(num)){
                sum += num;
                cnt++;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumOfPrimeNum(n));
    }
}
