package Hashing.HashMap;

import java.util.HashMap;
import java.util.Scanner;

class CountSubArrayWithSumIsK {

    public static int countSubArrayWithSumIsK(int arr[], int k){
        int sum = 0, count = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        //Initialize the map with (0,1)
        map.put(sum, 1);
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
            //check if sum-k is already present means already subarray count present
            if(map.containsKey(sum-k)){
                count += map.get(sum-k);
            } 
            map.put(sum, map.getOrDefault(sum, 0)+1);
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length: ");
        int len = sc.nextInt();
        int arr[] = new int[len];
        System.out.println("Enter Value: ");
        for(int i=0; i<len; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Value: ");
        for(int v: arr){
            System.out.print(v+" ");
        }System.out.println();

        System.out.println("Enter the Value of K: ");
        int k = sc.nextInt();
        System.out.println("Count of Sub-Array: "+countSubArrayWithSumIsK(arr, k));
    }
    
}