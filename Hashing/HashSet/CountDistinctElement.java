package Hashing.HashSet;

import java.util.HashSet;
import java.util.Scanner;

public class CountDistinctElement {
    public static int countDistinctElement(int nums[]){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++){
                set.add(nums[i]);
            
        }
        return set.size();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();

        int nums[] = new int[size];

        System.out.println("Enter Value: ");
        for(int i=0; i<size; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("Value: ");
        for(int val: nums){
            System.out.print(val+" ");
        }System.out.println();

        int count = countDistinctElement(nums);
        System.out.println("Count of Distinct Element: "+count);
    }
}

/*
nums = {4,3,2,1,2,3,5}
ans = 5 (bcz 4,3,2,1,5 is uniue)
 */