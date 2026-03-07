package GreedyAlgo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class FractionalKnapsack {
    public static int maximumTotalValue(int weight[], int value[], int capacity){
        double ratio[][] = new double[weight.length][2];
        for(int i=0; i<weight.length; i++){
            ratio[i][0] = i;
            if(weight[i]==0){ //here we handle infinity case bcz if we divide value>0/weight==0 so he gives infinity
                //so here storing value as inifinity we store the 1.7976931348623157E308(Double.MAX_VALUE)
                ratio[i][1] = Double.MAX_VALUE;
            }
            else{
                ratio[i][1] = (double)value[i] / weight[i];
            }
        }
        //SOrt in Increasing/Ascending Order(4,5,6....)
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int totalValue = 0;
        for(int i=weight.length-1; i>=0; i--){
            System.out.println(ratio[i][1]);
            //if the capacity is greater than or eqaul to the currWeight so we add the total currValue in totalValue and then decrease the capacity by currWeight
            int idx = (int)ratio[i][0];
            if(capacity>=weight[idx]){
                totalValue += value[idx];
                capacity -= weight[idx];
            }
            else{//otherwise, we multiply the currRatio and capacity then add into the totalValue and then we don't have any capacity so break the loop and return the result
                totalValue += ratio[i][1]*capacity;
                break;
            }
        }
        return totalValue;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length: ");
        int len = sc.nextInt();

        int value[] = new int[len];
        int weight[] = new int[len];
        System.out.println("Enter Value: ");
        for(int i=0; i<len; i++){
            value[i] = sc.nextInt();
        }
        System.out.println("Enter Weight: ");
        for(int i=0; i<len; i++){
            weight[i] = sc.nextInt();
        }
        System.out.print("Weight: ");
        for(int i=0; i<len; i++){
            System.out.print(weight[i]+" ");
        }System.out.println();
        System.out.print("Value: ");
        for(int i=0; i<len; i++){
            System.out.print(value[i]+" ");
        }System.out.println();

        System.out.println("Enter the Capacity: ");
        int capacity = sc.nextInt();

        System.out.println("Maximum Total Value: "+maximumTotalValue(weight, value, capacity));
    }
}
