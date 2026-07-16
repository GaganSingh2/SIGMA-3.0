package InterviewPrepration.PhaseZeroAI;

public class KadaneAlgoForMaxSumInSubArray {
    public static int maxSum(int arr[]){
        int currSum = 0;
        int maxS = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            currSum += arr[i];
            maxS = Math.max(maxS, currSum);
            if (currSum < 0) {
                currSum = 0;
            }
        }
        return maxS;
    }
    public static void main(String[] args) {
        int arr[] = {-13,-102,-5,-2,-2,-9,-1,-9,-3,-32};
        System.out.println(maxSum(arr));
    }
}
