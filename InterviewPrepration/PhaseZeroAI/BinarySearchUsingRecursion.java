package InterviewPrepration.PhaseZeroAI;

public class BinarySearchUsingRecursion {
    public static int val(int arr[], int key, int si, int ei){
        if (si>ei) {
            return -1;
        }
        int mid = si + (ei - si)/2;
        if(arr[mid] == key){
            return mid;
        }
        else if(arr[mid]>key){
            return val(arr,key, si, mid-1);
        }
        else{
            return val(arr, key, mid+1, ei);
        }
    }
    public static void main(String[] args) {
        int key = -4;
        int arr[] = {1,2,3,4,5,6,7,8};
        System.out.println(val(arr, key, 0, arr.length-1));
    }
}
