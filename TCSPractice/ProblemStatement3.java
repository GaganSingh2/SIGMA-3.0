package TCSPractice;

import java.util.HashMap;
import java.util.Scanner;

public class ProblemStatement3 {

    public static void isOddColor(char[] ballon){
        HashMap<Character,Integer> freq = new HashMap<>();
        for(int i=0; i<ballon.length; i++){
            char ch  = ballon[i];
            freq.put(ch, freq.getOrDefault(ch, 0)+1);
        }
        for(char c: freq.keySet()){
            if (freq.get(c) % 2 != 0) {
                System.out.println(c);
                return;
            }

        }
        System.out.println("All are even");
    }
    public static void main(String[] args) {
        // Q)Here some ballon colors are given u have to print the ballon colors who comes first in odd Frequency, if all colors Frequency is even then print "All are even".
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        char[] ballon = new char[size];

        for(int i=0; i<size; i++){
            ballon[i] = sc.next().charAt(0);
        }

        for(int i=0; i<size; i++){
            System.out.print(ballon[i]+" ");
        }System.out.println();    
        
        isOddColor(ballon);
    }
}
