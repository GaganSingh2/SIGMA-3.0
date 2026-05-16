package InfosysPractice;

import java.util.*;

public class practice6 {
    public static boolean allDigitSame(int m, int b){
        Set<Integer> digits = new HashSet<>();
        int tmp = m;
        while (tmp>0) {
            digits.add(tmp % b);
            tmp /= b;
        }
        return digits.size() == 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        
        int minBase = 2;

        for(int b=minBase; b<m; b++){
            if (allDigitSame(m, b)) {
                System.out.println(b);
                break;
            }
        }
    }
}
