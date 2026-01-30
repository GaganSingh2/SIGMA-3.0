import java.util.Scanner;

public class MinimumValueInRotateArray {
    public static int minValue(int arr[]){
        int si = 0;
        int ei = arr.length-1;
        // int val = Integer.MAX_VALUE;
        while (si<ei) {
            int mid = si + (ei-si)/2;
            if(arr[mid]>arr[ei]){
                si = mid+1;
            }
            else{
                ei = mid;
            }
        }
        return arr[si];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 153 Q
        int arr[] = {3,4,5,-1,1,2};
        System.out.println(minValue(arr));
    }
}
