package GreedyAlgo;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Arrays;

public class MaxLengthOfChain {

    public static int maxLengthOfChain(int startVal[],int endVal[]){
        if (startVal.length==1) {
            return 1;
        }
        int pairs[][] = new int[startVal.length][2];
        for(int i=0; i<startVal.length; i++){
            pairs[i][0] = startVal[i];
            pairs[i][1] = endVal[i];
        }

        Arrays.sort(pairs, Comparator.comparingDouble(o->o[1]));
        int maxLength = 0;


        maxLength = 1;
        int endValueOfPrevChain = pairs[0][1];
        for(int i=0; i<startVal.length; i++){
            if(pairs[i][0]>=endValueOfPrevChain){
                maxLength++;
                endValueOfPrevChain = pairs[i][1];
            }
        }

        return maxLength;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length: ");
        int len = sc.nextInt();

        int startVal[] = new int[len];
        int endVal[] = new int[len];
        
        System.out.println("Enter the StartValue: ");
        for(int i=0; i<len; i++){
            startVal[i] = sc.nextInt();
        }

        System.out.println("Enter the EndValue: ");
        for(int i=0; i<len; i++){
            endVal[i] = sc.nextInt();
        }

         System.out.println("StartValue: ");
        for(int i=0; i<len; i++){
            System.out.print(startVal[i]+" ");
        }System.out.println();
        System.out.println("End Value: ");
        for(int i=0; i<len; i++){
            System.out.print(endVal[i]+" ");
        }System.out.println();

        int res = maxLengthOfChain(startVal, endVal);
        System.out.println("Maximum Length Of Chain in pair: "+res);
    }
}
