import java.util.*;
public class BackTracking {
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void changeArr(int arr[],int i, int val){
        //Base Case
        if(i==arr.length){
            printArr(arr);
            return;
        }
        
        arr[i] = val;
        changeArr(arr, i+1, val+1);
        arr[i] = arr[i]-2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the length of Array: ");
        int len = sc.nextInt();

        int arr[] = new int[len];
        changeArr(arr, 0, 1);
        printArr(arr);

    }
}