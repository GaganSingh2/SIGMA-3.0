package TCSPractice;

import java.util.Arrays;
import java.util.Scanner;

public class ProblemStatement10 {
    public static int totalOpt(int p, int q, int r){
        if (p==q && q==r && p==r) {
            return 0;
        }
        int tmpArr[] = {p,q,r};
        int cntOpt = 0;
        Arrays.sort(tmpArr);
        while (true) {
            tmpArr[0] += 1;
            tmpArr[1] += 1;
            tmpArr[2] -= 1;
            cntOpt++;

            if (tmpArr[0]==tmpArr[1] && tmpArr[1]==tmpArr[2]) {
                return cntOpt;
            }
            Arrays.sort(tmpArr);
            if (tmpArr[0]==tmpArr[1] && tmpArr[1]+1==tmpArr[2] ||
                tmpArr[1]==tmpArr[2] && tmpArr[0]+1==tmpArr[1]
            ) {
                return -1;
            }
        }
    }
    public static void main(String[] args) {
        //Q)Find after how many operations this all 3 values are eaquals if not posible then return -1.
         Scanner sc = new Scanner(System.in);
         int p = sc.nextInt();
         int q = sc.nextInt();
         int r = sc.nextInt();
        System.out.println(totalOpt(p, q, r));

    }
}
