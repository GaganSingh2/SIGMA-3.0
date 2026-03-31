package GreedyAlgo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class JobSequencingProblem {
    static class Job{
        int deadline;
        int profit;
        char id;

        public Job(int deadline, int profit, char id){
            this.deadline = deadline;
            this.profit = profit;
            this.id = id;
        }
    }

    public static int maximumProfit(ArrayList<Job> jobs){
        //Sort the jobs based on the Profit (Descending Ordr)
        Collections.sort(jobs, (a,b)->b.profit-a.profit);

        StringBuilder sb = new StringBuilder("");
        int time = 0, maxProfit = 0;
        for(int i=0; i<jobs.size(); i++){
            if(time<jobs.get(i).deadline){
                sb.append(jobs.get(i).id);
                maxProfit += jobs.get(i).profit;
                time++;
            }
        }
        System.out.println("Job Sequence: "+sb.toString());
        return maxProfit;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length: ");
        int len = sc.nextInt();

        int deadline[] = new int[len];
        int profit[] = new int[len];

        System.out.println("Enter the DeadLine: ");
        for(int i=0; i<len; i++){
            deadline[i] = sc.nextInt();
        }

        System.out.println("Enter the Profit: ");
        for(int i=0; i<len; i++){
            profit[i] = sc.nextInt();
        }

        System.out.println("DeadLine: ");
        for(int i=0; i<len; i++){
            System.out.print(deadline[i]+" ");
        }System.out.println();

        System.out.println("Profit: ");
        for(int i=0; i<len; i++){
            System.out.print(profit[i]+" ");
        }System.out.println();


        ArrayList<Job> jobs = new ArrayList<>();
        int num = 65; //'A'
        for(int i=0; i<len; i++){
            jobs.add(new Job(deadline[i], profit[i], (char)num));
            num++;
        }
        
        int res = maximumProfit(jobs);
        System.out.println("Maximum Profit: "+res);
    }
}
