package GreedyAlgo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ActivitySelection {
    //Activities are already sorted according to end time---------- 
    public static int countMaximumActivitiesPerformBySinglePersonEndTimeSorted(int startTime[], int endTime[]){
        
        int activitiesCount = 0;

        //1st Activity complete
        activitiesCount = 1; //we take each time first activity bcz first activity ends too early so after that we have too much time to complete other activity
        int prevActivityEndTime = endTime[0]; //endtime of first activity
        System.out.print("Activities Completed: A"+0);
        for(int i=1; i<startTime.length; i++){
            //if startTime of new Activity is lessThan of endTime of prevComplete Activity means here time is non-overlap to each other so we can complete this activity
            if(startTime[i]>=prevActivityEndTime){
                //so increase the activityCount by 1
                activitiesCount++;
                prevActivityEndTime  = endTime[i]; //store the endTime of completedActivity
                System.out.print(", A"+i);
            }
        }System.out.println();
        return activitiesCount;
    }

    //Activities are not sorted according to end time---------- 
    public static int countMaximumActivitiesPerformBySinglePersonEndTimeNotSorted(int startTime[], int endTime[]){
        //Sorting
        //we store here index in 2-d array bcz after sorting the endTime our whole 2-D array is fliped so when we try to print which task is complete then we use stored index value 
        int activities[][] = new int[startTime.length][3];
        for(int i=0; i<startTime.length; i++){
            activities[i][0] = i;
            activities[i][1] = startTime[i];
            activities[i][2] = endTime[i];  
        }    
        
        //Sort the EndTime by using Lambda Function
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));
        
        int activitiesCount = 0;

        //first Activity complete by default 
        activitiesCount = 1;
        int prevActivityEndTime = activities[0][2];
        System.out.print("Activity Completed: A"+activities[0][0]);
        for(int i=0; i<startTime.length; i++){
            if(activities[i][1]>=prevActivityEndTime){
                activitiesCount++;
                prevActivityEndTime = activities[i][2];
                System.out.print(", A"+activities[i][0]);
            }
        }System.out.println();

        return activitiesCount;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Q)you are given n activities with their start and end times. Select maximum numbers of activities that can be performed by a single person, assumning that a person can only work on a single actitvity at a time.
        
        System.out.println("Enter the length: ");
        int len = sc.nextInt();
        int startTime[] = new int[len];
        int endTime[] = new int[len];

        System.out.println("Enter the Start Time: ");
        for(int i=0; i<len; i++){
            startTime[i]  = sc.nextInt();
        }
        System.out.println("Enter the End Time(Sorted): ");
        for(int i=0; i<len; i++){
            endTime[i]  = sc.nextInt();
        }

        System.out.println("Start Time: ");
        for(int v: startTime){
            System.out.print(v+" ");
        }System.out.println();
        System.out.println("End Time: ");
        for(int v: endTime){
            System.out.print(v+" ");
        }System.out.println();

        //End Time Sorted
        int count = countMaximumActivitiesPerformBySinglePersonEndTimeSorted (startTime, endTime);
        System.out.println("Total Acititvties: "+count);


        //End Time not Sorted
        int cnt = countMaximumActivitiesPerformBySinglePersonEndTimeNotSorted(startTime, endTime);
        System.out.println("Total Activities: "+cnt);
    }
}
