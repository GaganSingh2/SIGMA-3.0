import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Greedy_Algo {
    private static boolean isSorted(int endTime[]) {
        for (int i = 1; i <= endTime.length - 1; i++) {
            if (endTime[i - 1] > endTime[i]) {
                return false;
            }
        }
        return true;
    }
    public static void max_Activity_Selection(int startTime[], int endTime[]) {
        int maxAct = 0;
        ArrayList<Integer> ActPerform = new ArrayList<>();

        // if endTime is sorted----------
        if (isSorted(endTime)) {
            maxAct = 1;
            ActPerform.add(0);
            int lastTime = endTime[0];

            for (int i = 1; i < endTime.length; i++) {
                if (startTime[i] >= lastTime) {
                    maxAct++;
                    ActPerform.add(i);
                    lastTime = endTime[i];
                }
            }
        } 
        // if endTime is not sorted then-----
        else {
            
            int activities[][] = new int[startTime.length][3];
            for (int i = 0; i < startTime.length; i++) {
                activities[i][0] = i;
                activities[i][1] = startTime[i];
                activities[i][2] = endTime[i];
            }

            // it is sorted according to the our condition using Lambda function
            Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

            maxAct = 1;
            ActPerform.add(activities[0][0]);
            int lastEnd = activities[0][2];

            for (int i = 1; i < endTime.length; i++) {
                if (activities[i][1] >= lastEnd) {
                    maxAct++;
                    ActPerform.add(activities[i][0]);
                    lastEnd = activities[i][2];
                }
            }
        }

        System.out.println("Maximum Number of Activity Perform: " + maxAct);

        System.out.print("Activities: ");
        for (int i = 0; i < ActPerform.size(); i++) {
            System.out.print("A" + ActPerform.get(i) + " ");
        }
        System.out.println();
    }

    // Helper function of fractionKnapsack
    private static boolean isSorted(double ratio[]) {
        for (int i = 1; i <= ratio.length - 1; i++) {
            if (ratio[i - 1] < ratio[i]) {
                return false;
            }
        }
        return true;
    }
    public static int fractional_Knapscak_MaxValue(int value[], int weight[], int capacity) {
        int maxValue = 0;

        // // If Array of Ratio is Sorted in Decending
        double ratio[] = new double[value.length];
        for (int i = 0; i < value.length; i++) {
            ratio[i] = value[i] / (double) weight[i];
        }
        if (isSorted(ratio)) {
            for (int i = 0; i < ratio.length; i++) {
                if (capacity >= weight[i]) {
                    maxValue += value[i];
                    capacity -= weight[i];
                } else {
                    maxValue += ratio[i] * capacity;
                    break;
                }
            }
        } // If Array of Ratio is not Sorted
        else {
            double arr[][] = new double[value.length][2];
            for (int i = 0; i < value.length; i++) {
                arr[i][0] = i;
                arr[i][1] = value[i] / (double) weight[i];
            }

            Arrays.sort(arr, Comparator.comparingDouble(o -> o[1]));
            for(int i=0;i<arr.length; i++){
                System.out.println(arr[i][1]);
            }
            for (int i = arr.length - 1; i >= 0; i--) {
                int idx = (int) arr[i][0];
                if (capacity >= weight[idx]) {
                    maxValue += value[idx];
                    capacity -= weight[idx];
                } else {
                    maxValue += arr[i][1] * capacity;
                    break;
                }
            }
        }

        return maxValue;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Q1)--Activity Selection--. you are given n activities with their start and
        // end time. select the maximum number of activity that can be perform by a
        // single person, assuming that a person can only work on a single activity at a
        // time. Activities are sorted according to end time.
        // System.out.println("Enter the length of Start Time & End Time: ");
        // int len = sc.nextInt();
        // int startTime[] = new int[len];
        // int endTime[] = new int[len];
        // System.out.println("Enter the value of Start Time: ");
        // for(int i=0; i<len; i++){
        // startTime[i] = sc.nextInt();
        // }
        // System.out.println("Enter the value of End Time: ");
        // for(int i=0; i<len; i++){
        // endTime[i] = sc.nextInt();
        // }
        // max_Activity_Selection(startTime, endTime);

        // Q2)Fractional Knapscak=> Given the weight and value of N time, put these
        // items in a Knapsack of capacity W to get the maximum total value in the
        // Knapsack.

        System.out.println("Enter the length of Value and Weight: ");
        int len = sc.nextInt();
        int value[] = new int[len];
        int weight[] = new int[len];

        System.out.println("Enter the value: ");
        for (int i = 0; i < len; i++) {
            value[i] = sc.nextInt();
        }
        System.out.println("Enter the weight: ");
        for (int i = 0; i < len; i++) {
            weight[i] = sc.nextInt();
        }

        System.out.println("Enter the total Capacity: ");
        int capacity = sc.nextInt();

        int max_Value = fractional_Knapscak_MaxValue(value, weight, capacity);
        System.out.println("Total Maximum Value: " + max_Value);
    }
}
