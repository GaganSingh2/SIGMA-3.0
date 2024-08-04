import java.util.Scanner;

public class strivar_DSA_sheet {

    public static int largestNum(int arr[]){
        int num = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if (num<arr[i]) {
                num = arr[i];
            }
        }
        return num;
    }

    public static int secondLargestNum(int arr[]){
        if (arr.length<2) {
            return -1;
        }

        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if (arr[i]>largest) {
                secondLargest = largest;
                largest = arr[i];
            }
            else if (arr[i]>secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Q1)Find the largest number in given array

        // System.out.println("ENter the length of Array: ");
        // int len = sc.nextInt();

        // int arr[] = new int[len];

        // System.out.println("ENter the value in Array: ");
        // for(int i=0; i<len; i++){
        //     arr[i] =sc.nextInt();
        // }
        // int greatest = largestNum(arr);
        //System.out.println("Largest value is "+greatest);


        //Q2) Find the second largeest number in given array
        System.out.println("Enter the length of Array: ");
        int len = sc.nextInt();

        int arr[] = new int[len];

        System.out.println("Enter the value in Array: ");
        for(int i=0; i<len; i++){
            arr[i] = sc.nextInt();
        }
        int num = secondLargestNum(arr);
        System.out.println("Second Largest is "+num);
    }
}