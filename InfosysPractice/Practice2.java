package InfosysPractice;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int nums[] = new int[n+1]; 
        nums[0] = 0;
        nums[1] = 1;
        for(int i=0; i<=n/2; i++){
            nums[i*2] = nums[i];
            if ((i*2)+1 <= n) {
                nums[(i*2)+1] = nums[i]+nums[i+1];
            }
        }

        int max = nums[0];
        for(int i=1; i<n; i++){
            if (nums[i]>max) {
                max = nums[i];
            }
        }
        System.out.println(max);
    }
}
 