package Queue;

import java.util.PriorityQueue;
import java.util.Scanner;

public class ConnectNRopesWithMinCost {

    public static int minimumCostOfConnectRopes(int arr[], int n){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0; i<n; i++){
            pq.add(arr[i]);
        }

        int totalCost = 0;
        while(pq.size()>1){
            int fir = pq.poll();
            int sec = pq.poll();
            int cost = fir+sec;
            totalCost += cost;
            pq.add(cost);
        }
        return totalCost;
    }
    public static void main(String[] args) {
        //Q)Given are N ropes of different lengths, the task is to connect these ropes into one rope with minimum cost, such that the cost to connect two ropes is equal to the sum of their length.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int len = sc.nextInt();
        System.out.println("Enter the num of Ropes: ");
        int n = sc.nextInt();

        int arr[] = new int[len];
        System.out.println("Enter the value: ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int res = minimumCostOfConnectRopes(arr, n);
        System.out.println("Minimum Cost: "+res);
    }
}

// in Priority queue : small value automatically come at the top 
/*
1)Insert all rope length into Priority Queue
2)while size>1:
    a)remove two small ropes
    b)add their sum to total cost and add in totalcost
    c)insert the back into priority queue
3)return totalCost
 */