package Array;

public class TrappinRainwater {
    public static int totalTrappedWater(int height[]){
        //Not Trapped any water
        if (height.length == 1 || height.length == 2) {
            return -1;
        }
        int len = height.length;

        //1st Step: find left max boundary-----------
        int leftMaxBoundar[] = new int[len];
        int currLeftmax = height[0];
        leftMaxBoundar[0] = currLeftmax;
        for(int i=1; i<len; i++){
            currLeftmax = Math.max(currLeftmax, height[i]);
            leftMaxBoundar[i] = currLeftmax;
        }
        // PrintArray.printArray(leftMaxBoundar);

        //2nd Step: find right max boundary----------
        int rightMaxBoundary[] = new int[len];
        int currRightMax = height[len-1];
        rightMaxBoundary[len-1] = currRightMax;
        for(int i=len-2; i>=0; i--){
            currRightMax = Math.max(currRightMax, height[i]);
            rightMaxBoundary[i] = currRightMax;
        }
        // PrintArray.printArray(rightMaxBoundary);

        //3rd Step: find Waterlevel and totalTrapped Water----------
        int maxTrappedWater = 0;
        for(int i=0; i<len; i++){
            //Current Water Level 
            int currWaterLevel = Math.min(leftMaxBoundar[i], rightMaxBoundary[i]);

            maxTrappedWater += currWaterLevel - height[i];
        }
        return maxTrappedWater;
    }
    public static void main(String[] args) {
        int height[] = TakeInput.takeInput();

        int maxTrappedWater = totalTrappedWater(height);
        System.out.println("Maximum Trapped Water: "+maxTrappedWater);

    }
}
