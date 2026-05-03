package TCSPractice;

import java.util.Scanner;

public class ProblemStatement1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int cntStar = 0, cntHash = 0;

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='*'){
                cntStar++;
            }
            else{
                cntHash++;
            }
        }

        if(cntStar>cntHash) System.out.println(1);
        else if(cntHash>cntStar) System.out.println(-1);
        else System.out.println(0);
    }
}
