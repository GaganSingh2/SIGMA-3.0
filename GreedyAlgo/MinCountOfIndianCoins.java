package GreedyAlgo;

import java.util.Scanner;

public class MinCountOfIndianCoins {
    public static int minCountOfIndianCoins(int totalPrice){
        if (totalPrice<=0) {
            return 0;
        }
        int coins[] = {1,2,5,10,20,50,100,500,2000};

        int countCoins = 0;
        System.out.print("Coins/Notes: ");
        for(int i=coins.length-1; i>=0; i--){
            if(coins[i]<=totalPrice){
                while (coins[i]<=totalPrice) {
                    countCoins++;
                    totalPrice -= coins[i];
                    System.out.print(coins[i]+" ");
                    if(totalPrice<=0){
                        return countCoins;
                    }
                }
            }
            if(totalPrice<=0) break;
        }

        return countCoins;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Total Price: ");
        int price = sc.nextInt();

        int countCoins = minCountOfIndianCoins(price);
        System.out.println();
        System.out.println("Minimum Count of Coins: "+countCoins);
    }
}
