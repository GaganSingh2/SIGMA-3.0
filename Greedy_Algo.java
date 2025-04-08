import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Greedy_Algo {
    public static void max_Activity_Selection(int startTime[], int endTime[]){
        int maxAct = 0;
        ArrayList<Integer> ActPerform = new ArrayList<>();

        //if endTime is sorted
        // maxAct = 1;
        // ActPerform.add(0);
        // int lastTime = endTime[0];

        // for(int i=1; i<endTime.length; i++){
        //     if (startTime[i]>=lastTime) {
        //         maxAct++;
        //         ActPerform.add(i);
        //         lastTime = endTime[i];
        //     }
        // }

        //if endTime is not sorted then
        int activities[][] = new int[startTime.length][3];
        for(int i=0; i<activities.length; i++){
            activities[i][0] = i;
            activities[i][1] = startTime[i];
            activities[i][2] =endTime[i];
        }

        // it is sorting according to the our condition
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));
        maxAct = 1;
        ActPerform.add(activities[0][0]);
        int lastEnd = activities[0][2];

        for(int i=1; i<activities.length; i++){
            if(activities[i][1]>=lastEnd){
                maxAct++;
                ActPerform.add(activities[i][0]);
                lastEnd = activities[i][2];
            }
        }

        System.out.println("Maximum Number of Activity Perform: "+maxAct);
        
        System.out.print("Activities: ");
        for(int i=0; i<ActPerform.size(); i++){
            System.out.print("A"+ActPerform.get(i)+" ");
        }System.out.println();
    }
    public static void main(String[] args) {
        // Q1)--Activity Selection--. you are given n activities with their start and end time. select the maximum number of activity that can be perform by a single person, assuming that a person can only work on a single activity at a time. Activities are sorted according to end time.
        int startTime[] = {1,3,0,5,8,5};
        int endTime[] = {2,4,6,7,9,9};
        
        max_Activity_Selection(startTime, endTime);

    }
}
