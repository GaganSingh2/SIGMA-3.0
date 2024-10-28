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

    
    public static int gridWays(int i, int j, int n, int m){
        //Base Case
        if (i==n-1 && j==m-1) { //yaha starting point hi ending point hai
            return 1;
        }
        else if (i==n || j==m) { //jab row ya column boundry cross karne lage tab 
            return 0;
        }

        int w1 = gridWays(i+1, j, n, m);
        int w2 = gridWays(i, j+1, n, m);
        return w1 + w2;
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
        // System.out.println("Enter the String: ");
        // String str = sc.nextLine();
        // System.out.println("Permutation: ");
        // findPermutation(str, "");

        //Time Complexit: O(n*n!)

        //Q3)Find the number of ways to reach from(0,0) to (N-1,M-1) in NxM grid.
        System.out.println("Enter the number of Row: ");
        int n = sc.nextInt();
        System.out.println("Enter the number of Column: ");
        int m = sc.nextInt();

        int res = gridWays(0, 0, n, m);
        System.out.println("Total Ways: "+res);

    }
}