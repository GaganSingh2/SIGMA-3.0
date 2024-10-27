import java.util.*;

public class BackTracking {
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void changeArr(int arr[], int i, int val) {
        // Base Case
        if (i == arr.length) {
            printArr(arr);
            return;
        }

        arr[i] = val;
        changeArr(arr, i + 1, val + 1);
        arr[i] = arr[i] - 2;
    }

    public static void subSets(String str, String newStr, int i) {
        // Base Case
        if (i == str.length()) {
            if (newStr.length() == 0) {
                System.out.println("Sub-Sets: NULL");
            } else {
                System.out.println("Sub-Sets: " + newStr);
            }
            return;
        }

        // If Yes
        subSets(str, newStr + str.charAt(i), i + 1);

        // If No
        subSets(str, newStr, i + 1);
    }

    public static void findPermutation(String str, String ans) {
        // Base Case
        if (str.length() == 0) {
            System.out.println(ans);

            return;
        }

        //Recursion
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            // Remove the Current character in String
            String NewStr = str.substring(0, i) + str.substring(i + 1);
            findPermutation(NewStr, ans + curr);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("ENter the length of Array: ");
        // int len = sc.nextInt();

        // int arr[] = new int[len];
        // changeArr(arr, 0, 1);
        // printArr(arr);

        // Q1)Find Subsets of the given String.
        // System.out.print("Enter the String: ");
        // String str = sc.nextLine();

        // subSets(str, "", 0);

        // Time Complexity: O(n*2^n).
        // Space Complexity: O(n).

        // Q2)Find Permutation of the given String.
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        System.out.println("Permutation: ");
        findPermutation(str, "");

    }
}