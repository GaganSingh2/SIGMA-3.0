import java.util.Scanner;

public class print_subArray {

    public static void printSubArray(int arr[]) {
        int ts = 0;

        // for the find the start point
        for (int i = 0; i < arr.length; i++) {
            int start = i;

            // for find the end point
            for (int j = i; j < arr.length; j++) {
                int end = j;

                // for print the subarray
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ");

                }

                ts++;

                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total SubArray is " + ts);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Print the subArray of the given Array
        System.out.println("Enter the length of Array: ");
        int len = sc.nextInt();

        int arr[] = new int[len];

        System.out.println("Enter the value in Array: ");
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        printSubArray(arr);
    }
}
