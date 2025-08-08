import java.util.Stack;
import java.util.Scanner;
public class NextGreaterElement {

    private static int[] nextGreaterElement(int nums[]){
        Stack<Integer> idx = new Stack<>();

        int nextGrtEle[] = new int[nums.length];
        for(int i=nums.length-1; i>=0; i--){
            while (!idx.isEmpty() && nums[idx.peek()] <= nums[i]) {
                idx.pop();
            }
            if(idx.isEmpty()){
                nextGrtEle[i] = -1;
            }
            else{
                nextGrtEle[i] = nums[idx.peek()];
            }
            idx.push(i);
        }
        return nextGrtEle;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int len = sc.nextInt();

        int arr[] = new int[len];
        System.err.println("Enter the value: ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }System.out.println();

        int res[] = nextGreaterElement(arr);
        System.out.println("After Inserting Next Greater Elements: ");
        for(int i=0; i<res.length; i++){
            System.out.print(res[i]+" ");
        }System.out.println();
    }
}
