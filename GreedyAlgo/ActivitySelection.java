package GreedyAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ActivitySelection {
    public static void cntActivity(int st[],int et[]){
        int maxAct = 0;
        ArrayList<Integer> idx = new ArrayList<>();

        //If EndTime is Already Sorted------
        // maxAct = 1;
        // idx.add(0);
        // int lastEnd = et[0];

        // for(int i=1; i<et.length; i++){
        //     if(st[i]>=lastEnd){
        //         maxAct++;
        //         idx.add(i);
        //         lastEnd = et[i];
        //     }
        // }
        // System.out.println("Total Activity Selected: "+maxAct);
        // for(int i=0; i<idx.size(); i++){
        //     System.out.print("A"+idx.get(i)+" ");
        // }

        // If EndTime is Not Sorted
        int task[][] = new int[st.length][3];
        for(int i=0; i<et.length; i++){
            task[i][0] = i;
            task[i][1] = st[i];
            task[i][2] = et[i];
        }
        Arrays.sort(task,Comparator.comparingDouble(o -> o[2]));
        for(int i=0; i<et.length; i++){
            // task[i][0] = i;
            // task[i][1] = st[i];
            System.out.println(task[i][2]+" ");
        }
        maxAct = 1;
        idx.add(task[0][0]);
        int lastEnd = task[0][2];
        for(int i=1; i<et.length; i++){
            if(task[i][1]>=lastEnd){
                maxAct++;
                idx.add(task[i][0]);
                lastEnd = task[i][2];
            }
        }
        System.out.println("Total Activity Selected: "+maxAct);
        for(int i=0; i<idx.size(); i++){
            System.out.print("A"+idx.get(i)+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Activity: ");
        int len = sc.nextInt();
        int st[] = new int[len];
        System.out.println("Enter the Start Time: ");
        for(int i=0; i<len; i++){
            st[i] = sc.nextInt();
        }
        int et[] = new int[len];
        System.out.println("Enter the End Time: ");
        for(int i=0; i<len; i++){
            et[i] = sc.nextInt();
        }
        cntActivity(st,et);
    }
}
