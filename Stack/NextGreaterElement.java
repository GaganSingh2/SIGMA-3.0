import java.util.Stack;
import java.util.Scanner;
public class NextGreaterElement {

    
    //Using NestedLoop TC:O(n^2) SC:O(n)
    public static void nextGreaterElementRightUsingLoop(int nums[]){
        int res[] = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            boolean flag = false;
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]<nums[j]){
                    res[i] = nums[j];
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                res[i] = -1;
            }
        }

        System.out.println("Next Greater: ");
        for(int ele: res){
            System.out.print(ele+" ");
        }
    }

    //Using Stack TC:O(n) and SC:O(n)
    private static int[] nextGreaterElementRight(int nums[]){
        int nextGreater[] = new int[nums.length];

        Stack<Integer> tmp = new Stack<>();

        for(int i=nums.length-1; i>=0; i--){
            int currValue = nums[i];
            while (!tmp.isEmpty() && nums[tmp.peek()]<=currValue) {
                tmp.pop();
            }
            if(tmp.isEmpty()){
                nextGreater[i] = -1; //Greater value is not exist for currValue
            }
            else{
                nextGreater[i] = nums[tmp.peek()]; //Greater value is exist for currValue
            }
            tmp.push(i);
        }
        return nextGreater;
    } 



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size: ");
        int size = sc.nextInt();
        int nums[] = new int[size];
        System.out.println("Enter the Value: ");
        for(int i=0; i<nums.length; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("Before Inserting NextGreater: ");
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i]+" ");
        }System.out.println();
        // nextGreaterElementRightUsingLoop(nums); 
        int res[] = nextGreaterElementRight(nums);
        System.out.println("After Inserting NextGreater: ");
        for(int i=0; i<res.length; i++){
            System.out.print(res[i]+" ");
        }System.out.println();
    }
        /*Qus Ask on this topic: 
         * Next Greater Right (Loop i=n-1 to 0 and inner loop check: nums[idx.peek()] <= nums[i])
         * Next Greater Left (Loop i=0 to n-1 and inner loop check: nums[idx.peek()] <= nums[i])
         * Next Smaller Right (Loop i=n-1 to 0 and inner loop check: nums[idx.peek()] >= nums[i])
         * Next Smaller Left (Loop i=0 to n-1 and inner loop check: nums[idx.peek()] >= nums[i])
         */
    
}
