import java.util.Scanner;

public class qus_ofArray {

    public static int trapped_RainWater(int height[]){
        int n = height.length;
        //Calculate the left max boundry - array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i=1; i<n; i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }


        //Calculate the right max boundry - array
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }


        // loop for find the Water Level and Trapped water
        int trappedWater = 0;
        for(int i=0; i<n; i++){
             // WaterLevel = Min(Left max, Right max)
            int WaterLevel = Math.min(leftMax[i], rightMax[i]);

            // Trapped Water = (WaterLevel - height) * width
            trappedWater += WaterLevel - height[i];
        }
        return trappedWater;
       
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Q1) Given n non-negative integer represent an elevation map where the width of each bar is 1. compute how much water it can trap after raining.
        
        System.out.println("ENter the length of Array of Map: ");
        int len = sc.nextInt();

        int height[] = new int[len];

        System.out.println("ENter the height of Bar: ");
        for(int i=0; i<len; i++){
            height[i] = sc.nextInt();
        }

        int total_trapped_Water = trapped_RainWater(height);
        System.out.println("Total Trapped Water is "+total_trapped_Water);

    }
}
