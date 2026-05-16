package InfosysPractice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Practice5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int exp = sc.nextInt();

        int[] p = new int[n];
        int[] b = new int[n];
        for(int i=0; i<n; i++){
            p[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            b[i] = sc.nextInt();
        }
        List<int[]> li = new ArrayList<>();
        for(int i=0; i<n; i++){
            li.add(new int[]{p[i], b[i]});
        }
        li.sort(Comparator.comparingInt(x->x[0]));
        int ans = 0;
        for(int[]pair: li){
            int pow = pair[0];
            int bonus = pair[1];
            if (pow>exp) {
                break;
            }
            else{
                exp += bonus;
                ans++;
            }
        }
        System.out.println(ans);
    }
}
