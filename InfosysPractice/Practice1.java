package InfosysPractice;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        //Q) Return the resulting string after removing exactly one occurence of digit from number.
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        char ch = sc.next().charAt(0);
        int max = Integer.MIN_VALUE;

        for(int i=0; i<n.length(); i++){
            if(n.charAt(i)==ch){
                String tmp = n.substring(0, i)+n.substring(i+1);
                int val = Integer.parseInt(tmp);
                if (val>max) {
                    max = val;
                }
            }
        }
        System.out.println(String.valueOf(max));
    }
}
