import java.util.Scanner;

public class qus_ofArray {

    public static int trapped_RainWater(int height[]) {
        int n = height.length;
        // Calculate the leftMax boundary - Array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        // Calculate the right Max boundry - Array
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        int trapped_water = 0;
        // Loop for find the WaterLevel and Trapped Water
        for (int i = 0; i < n; i++) {
            // Water Level = min(leftMax bound, RightMax bound)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            // trapped water += WaterLevel - height[i]
            trapped_water += waterLevel - height[i];
        }

        return trapped_water;

    }

    public static int buyAndSellStock(int price[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < price.length; i++) {
            if (buyPrice < price[i]) { // For Profit
                int profit = price[i] - buyPrice; // TOday's profit
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = price[i];
            }
        }

        return maxProfit;
    }

    public static boolean atLeastTwice(int num[]) {

        for (int i = 0; i < num.length - 1; i++) {
            for (int j = i + 1; j < num.length; j++) {

                if (num[i] == num[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Q1) Given n non-negative integer represent an elevation map where the width
        // of each bar is 1. compute how much water it can trap after raining.

        /*
         * System.out.println("Enter the length of Array of map: ");
         * int len = sc.nextInt();
         * 
         * int height[] = new int[len];
         * 
         * System.out.println("Enter the Heights in Array of Map: ");
         * for(int i=0; i<len; i++){
         * height[i] = sc.nextInt();
         * }
         * int total_TrappedWater = trapped_RainWater(height);
         * System.out.println("Total Trapped Water is "+total_TrappedWater);
         */

        // Time Complexity is O(n).

        // Q2)You are given an array prices where prices[i] is the price of a given
        // stock on the ith day.You want to maximize your profit by choosing a single
        // day to buy one stock and choosing a different day in the future to sell that
        // stock.Return the maximum profit you can achieve from this transaction. If you
        // cannot achieve any profit, return 0.

        // System.out.println("ENter the length of Array of Price: ");
        // int len = sc.nextInt();

        // int price[] = new int[len];

        // System.out.println("Enter the Price in Array: ");
        // for (int i = 0; i < len; i++) {
        // price[i] = sc.nextInt();
        // }

        // int max_profit = buyAndSellStock(price);
        // System.out.println("Maximum Profit is " + max_profit);

        // Time Complexity is O(n).

        // Q3)Given an integer array nums, return true if any value appears at least
        // twice in the array, and return false if every element is distinct.

        System.out.println("Enter the length of Array: ");
        int len = sc.nextInt();

        int num[] = new int[len];

        System.out.println("ENter the value in Array: ");
        for (int i = 0; i < len; i++) {
            num[i] = sc.nextInt();
        }
        boolean ans = atLeastTwice(num);
        if (ans == true) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        
    }
}
