package InterviewPrepration.PhaseZeroAI;

public class LongestLengthOfContiguousSubArray {
    public static void maxLength(int arr[]) {
        int currLen = 1;
        int maxLen = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1] + 1) {
                currLen++;
                // System.out.println(currLen);
            } else {

                currLen = 1;
            }

            maxLen = Math.max(maxLen, currLen);

        }

        System.out.println(maxLen);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 1, 2, 1, 2, 3, 6, 4, 5 };
        maxLength(arr);
    }
}
