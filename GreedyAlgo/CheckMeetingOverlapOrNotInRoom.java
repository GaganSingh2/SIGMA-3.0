package GreedyAlgo;

import java.util.Arrays;

public class CheckMeetingOverlapOrNotInRoom {
    //If startTime is already sorted then this is work otherwise it will give wrong output
    public static boolean checkOverlapOrNotIfStartTimeIsSorted(int interval[][]){
        int endTime = interval[0][1];
        for(int i=1; i<interval.length; i++){
            //if endTime is greater of startTime of next event means time overlaps so all events not operate properly
            if (endTime > interval[i][0]) {
                return false;
            }
            endTime = interval[i][1];//update endTime with current event
        }
         //if endTime is less than of startTime of next event means time not overlaps i.e. all events operate properly
        return true;
    }

    //If startTime is not sorted then first of all sort the startTime
    public static boolean checkOverlapOrNotIfStartTimeIsNotSorted(int interval[][]){
        //Sort the Intervals Based on the StartTime(bcz sorts by start time because you need to know whether the next meeting starts before the previous meeting ends.)
        Arrays.sort(interval, (a,b)->a[0]-b[0]);
        int endTime = interval[0][1];
        for(int i=1; i<interval.length; i++){
            //if endTime is greater of startTime of next event means time overlaps so all events not operate properly
            if (endTime > interval[i][0]) {
                return false;
            }
            endTime = interval[i][1];//update endTime with current event.
        }
        //if endTime is less than of startTime of next event means time not overlaps i.e. all events operate properly
        return true;
    }

    public static void main(String[] args) {
        //if start time already sorted----------
        int interval1[][] = {{1,3},{4,6},{7,8}};
        boolean res1 = checkOverlapOrNotIfStartTimeIsSorted(interval1);
        System.out.println("Meeting Operate Properly: "+res1);

        int interval2[][] = {{1,4},{2,5},{6,8}};
        boolean res2 = checkOverlapOrNotIfStartTimeIsSorted(interval2);
        System.out.println("Meeting Operate Properly: "+res2);

        //if start time not sorted----------
        int interval3[][] = {{1,3},{4,6},{7,8}};
        boolean res3 = checkOverlapOrNotIfStartTimeIsSorted(interval3);
        System.out.println("Meeting Operate Properly: "+res3);

        int interval4[][] = {{1,4},{2,5},{6,8}};
        boolean res4 = checkOverlapOrNotIfStartTimeIsSorted(interval4);
        System.out.println("Meeting Operate Properly: "+res4);
    }
}

/**
 * Q)A College has only one seminar hall. multiple students clubs want to book the hall for their events. 
 * You are given an array of intervals where each interval represents the start time and end time of an event.
 * Determine whether all events can be accommodated in the seminar hall without any scheduling conflict.
 * 
 * Example:
 *Input: 
 [[1,3],[4,6],[7,8]]
 Output: True (bcz all ending time is less than the starting time of next event)

 Input:
 [[1,4],[2,5],[6,8]]
 Output: False (bcz ending time (4) is not less than the starting time (2))
 */