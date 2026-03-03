package GreedyAlgo;

import java.util.Scanner;

public class ActivitySelection {
    public static int countMaximumActivitiesPerformBySinglePerson(int startTime[], int endTime[]){
        
        int activitiesCount = 0;

        //1st Activity complete
        activitiesCount = 1; //we take each time first activity bcz first activity ends too early so after that we have too much time to complete other activity
        int prevActivityEndTime = endTime[0]; //endtime of first activity
        System.out.print("Activities Completed: A"+0);
        for(int i=1; i<startTime.length; i++){
            //if startTime of new Activity don't overlap of endTime of prevComplete Activity means we can complete this activity
            if(startTime[i]>=prevActivityEndTime){
                //so increase the activityCount by 1
                activitiesCount++;
                prevActivityEndTime = endTime[i]; //store the endTime of completedActivity
                System.out.print(", A"+i);
            }
        }System.out.println();
        return activitiesCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Q)you are given n activities with their start and end times. Select maximum numbers of activities that can be performed by a single person, assumning that a person can only work on a single actitvity at a time.
        //Activities are already sorted according to end time---------- 
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

        int count = countMaximumActivitiesPerformBySinglePerson(startTime, endTime);
        System.out.println("Total Acititvties: "+count);
    }
}
