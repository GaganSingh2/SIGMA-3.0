package Queue;
import java.util.*;

public class MargeTwoSortedArrayUsingQueue {

    static void mergeTwoSortedArray(int arr1[], int arr2[]){
        int len = arr1.length + arr2.length;
        int res[] = new int[len];
        int si1 = 0, si2 = 0;
        int idx = 0;
        while (si1<arr1.length && si2<arr2.length) {
            if(arr1[si1]<arr2[si2]){
                res[idx] = arr1[si1];
                si1++;
            }
            else{
                res[idx] = arr2[si2];
                si2++;
            }
            idx++;
        }
        //Remaining element of arr1
        while (si1<arr1.length) {
            res[idx++] = arr1[si1++];
        }
        //Remaining element of arr2
        while (si2<arr2.length) {
            res[idx++] = arr2[si2++];
        }

        for(int ele: res){
            System.out.print(ele+" ");
        }
    }
    public static void main(String[] args) {
        
        int arr1[] = {2,6,8};
        int arr2[] = {3,4,7,9};
        mergeTwoSortedArray(arr1, arr2);
    }
}