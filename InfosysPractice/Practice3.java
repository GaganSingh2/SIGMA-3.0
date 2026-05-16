package InfosysPractice;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        int max = 0;
        for(int start=0; start<n; start++){
            int res[] = new int[n];
            for(int i=0; i<n; i++){
                res[i] = arr[(start+i)%n];
            }
            int ans = 0;
            int total = 0;
            for(int val: res){
                ans ^= val;
                total += ans;
            }
            max = Math.max(max, total);

            for(int i=0; i<n; i++){
                res[i] = arr[(start-i+n)%n];
            }
            ans = 0;
             total = 0;
            for(int val: res){
                ans ^= val;
                total += ans;
            }
            max = Math.max(max, total);
        }
        System.out.println(max);
    }
}
