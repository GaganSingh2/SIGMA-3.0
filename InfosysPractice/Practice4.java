package InfosysPractice;

import java.util.*;
import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> li = new ArrayList<>();
        for(int i=0; i<n; i++){
            li.add(sc.nextInt());
        }

        int ans = 0;
        Collections.sort(li);
        while (!li.isEmpty()) {
            if (!li.get(0).equals(li.get(li.size()-1))) {
                li.remove(li.size()-1);
                if (!li.isEmpty()) {
                    li.remove(0);
                    ans++;
                }
                
            }
            else{
                li.remove(0);
                ans++;
            }
        }
        System.out.println(ans);
    }
}
