package Queue;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

class Job {

    char id;
    int deadline;
    int profit;
    
    Job(char id, int deadline, int profit){
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }
}
public class JobSequencingProblem {
    public static void main(String[] args) {
        //Q)We have an array of jobs where every job has a deadline and associated profit if the job is finished before the deadline. It is also given that every job takes a single unit of time,so the minimum possible deadline for any job is 1. Maximize the total profit if only one job can be scheduled at a time.

        List<Job> job = new ArrayList<>();
        job.add(new Job('a',4,20));
        job.add(new Job('b',1,10));
        job.add(new Job('c',1,40));
        job.add(new Job('d',1,30));

        //Step2: Sort the jobs based on deadline(Descending)
        job.sort((j1,j2)->j2.deadline-j1.deadline);

        //Step3: PriorityQueue as Max-Heap (based on profit)(Desecending Order)
        PriorityQueue<Job> pq = new PriorityQueue<>((j1,j2)->j2.profit-j1.profit);

        //Step4: Find maximum Deadline
        int maxDeadline = job.get(0).deadline;
    

        int idx = 0;
        int totalProfit = 0;
        List<Character> seq = new ArrayList<>();

        //Step5: Process time slots
        for(int time = maxDeadline; time>=1; time--){
            //Add Eligible jobs
           
            while (idx<job.size() && job.get(idx).deadline==time) {
                pq.add(job.get(idx));
                idx++;
            }

            //Pick most profitable job
            if(!pq.isEmpty()){
                Job bestJob = pq.poll();
                seq.add(bestJob.id);
                totalProfit += bestJob.profit;
            }
        }
        System.out.println("Job Sequence: "+seq);
        System.out.println("Total Profit: "+totalProfit);
    }
}
