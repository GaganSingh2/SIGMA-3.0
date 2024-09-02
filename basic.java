public class basic {
    class Solution {
        public int[] twoSum(int nums[], int target) {
            int ans[] = new int[2];
            for(int i=0; i<nums.length-1; i++){
                for(int j=1; j<nums.length; j++){
                    if(nums[i]+nums[j]==target){
                        return new int[]{i, j};
                    }
                }
            }
            return new int[]{};//for no solution found
        }
    }
    public static void main(String[] args) {
        // for(int i=0; i<=10; i++){
        //     System.out.println(i);
        // }
        // System.out.println(1%2);
        
    }
} 
