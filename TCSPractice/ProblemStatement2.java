package TCSPractice;

import java.util.Scanner;

public class ProblemStatement2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int arr[] = new int[size];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int cnt = 1;
        int lastMax = arr[0];
        for(int i=1; i<arr.length; i++){
            int currVal = arr[i];
            if(currVal>lastMax){
                cnt++;
                lastMax = currVal;
            }
        }
        System.out.println(cnt);
    }
}
