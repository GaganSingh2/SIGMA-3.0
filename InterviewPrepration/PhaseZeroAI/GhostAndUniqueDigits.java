package InterviewPrepration.PhaseZeroAI;

import java.util.Scanner;

public class GhostAndUniqueDigits {
    public static int ghostAndUniqueDigits(int n){
        if (n == 1) {
            return 10;
        }
        if (n > 10) {
            return 0;
        }

        int ans = 9;
        int available = 9;
        for(int i=2; i<=n; i++){
            ans *= available;
            available--;
        }

        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number N: ");
        int n = sc.nextInt();

        int res = ghostAndUniqueDigits(n);
        System.out.println("Total Unique Numbers: "+res);
    }
}

/**
 * Q)Ghost and Unique Digits------
 * Ghost came up to you asking for some help and the problem is really interesting this time. He gave you a number 'N' and asked you to write a program which will give count of all the number 'x' such that 'x' has 'N' digits and all the digits of 'x' are unique.
 *
 * Input: N = 1
 * Output: 10 (All digits are unique)
 * where number(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
 * 
 * 
 * Input: N = 2
 * Output: 81(all digits are unique)
 * where all two digit numbers like 10, 11, 12,........,98,99
 * so totalNumbers = 90
 * but in this totalNumber some numbers are not unique like (11, 22, 33, 44, 55, 66, 77, 88, 99) totalDuplicate = 9
 * final totalUnique = totalNumber - totalDuplicate = 90-9 = 81.
 * 
 * General Formula

For

N=1

10

For

N=2

9×9=81

For

N=3

9×9×8=648

For

N=4

9×9×8×7

For

N=5

9×9×8×7×6

Continue until

N=10

After that answer becomes

0

because only 10 distinct digits exist.
 */