import java.util.Scanner;

public class reverseOfArray {

    public static void reverse_Array(int arr[]){
        int start = 0;
        int end = arr.length - 1;
        while (start<end) {
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;

            start++;
            end--;
        }
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Find the Reverse of Given Array
        System.out.println("Enter the length of Array: ");
        int len = sc.nextInt();

        int arr[] = new int[len];

        System.out.println("ENter the value in Array: ");
        for(int i=0; i<len; i++){
            arr[i] = sc.nextInt();
        }

        reverse_Array(arr);
        System.out.println("After the Reverse of Given Array: ");
        for(int i=0; i<len; i++){
            System.out.println(arr[i]+" ");
        }

        //Time Complexity:- O(n).
        //Space Complexity:-

    }
}
