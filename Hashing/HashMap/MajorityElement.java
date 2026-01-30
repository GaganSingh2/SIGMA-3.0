package Hashing.HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class MajorityElement {

    public static void findAllMajorityElement(int nums[]){
        int times = nums.length/3;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int num = nums[i];
           //Using getOrDefault() 
            map.put(num, map.getOrDefault(num, 0)+1);

            //Using get()
            // if(map.containsKey(num)){
            //     map.put(num, map.get(num)+1);
            // }
            // else{
            //     map.put(num, 1);
            // }
        }
        for(Integer k: map.keySet()){
            if (map.get(k)>times) {
                System.out.println("Num: "+k+" -> "+map.get(k)+" Times");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Q)Given an Integer array of size n, find all the element that appear more than (n/2) times.
        System.out.println("Enter the Size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter Value: ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        findAllMajorityElement(arr);
    }
}
