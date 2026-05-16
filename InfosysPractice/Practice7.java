package InfosysPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Practice7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        List<Integer> ans = new ArrayList<>();
        for(int i=0; i<t; i++){
            String a = sc.next();
            String b = sc.next();
            int fir = Integer.parseInt(a,2);
            int sec = Integer.parseInt(b,2);
            int tmp = fir + sec;
            ans.add(tmp);
        }
        int max = ans.get(0);
        for(int i=1; i<ans.size(); i++){
            if (max<ans.get(i)) {
                max = ans.get(i);
            }
        }
        System.out.println(ans);
        System.out.println("MaxVal: "+max);
        System.out.println("Binary: "+Integer.toBinaryString(max));
    }
}
