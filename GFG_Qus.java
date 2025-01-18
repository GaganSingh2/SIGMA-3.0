import java.util.Arrays;
import java.util.Scanner;

public class GFG_Qus {
    
    public static int posRightMostSet(int num1, int num2){
        //if both value are same
        if(num1 == num2){
            return -1;
        }
        //firstly find the Exor of both number
        int value = num1 ^ num2;
        //Isolate the rightmost bit using Value & (-Value)
        int rightmostset = value & (-value);

        int pos = 1;
        //find the position 
        while ((rightmostset >>= 1) != 0) {
            pos++;
        }
        return pos;
    }

    public static boolean findIndexOfKey(int arr[][],int key){
        int row = 0;
        int col = arr[0].length-1;
        while (row<arr.length && col>=0) {
            if (key == arr[row][col]) {
                return true;
            }
            else if(key < arr[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        return false;
    }

    public static boolean isAnagram(String str1, String str2){
        boolean res = false;
        //Convert the uppercase into lowercases
        String str1L = str1.toLowerCase();
        String str2L = str2.toLowerCase();

        //CHeck the length is same or not
        if (str1L.length() == str2L.length()) {
            //convert the string into char array
            char str1charArray[] = str1L.toCharArray();
            char str2charArray[] = str2L.toCharArray();

            //sort the array
            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);

            //check the equal
            if (Arrays.equals(str1charArray, str2charArray)) {
                res = true;
            }
        }
        return res;
    }

    public static int[] productExceptItself(int nums[]){
        int len = nums.length;

        int result[] =new int[len];
        
        for(int i=0; i<len; i++){
            int Product = 1;
            for(int j=0; j<len; j++){
                if (i==j) {
                    continue;
                }
                Product *= nums[j];
            }
            result[i] = Product;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Q1) Given two numbers m and n. The task is to find the position of the rightmost different bit in the binary representation of numbers. If both m and n are the same then return -1 in this case.
        // System.out.println("ENter the Fisrt Value: ");
        // int num1 = sc.nextInt();
        // System.out.println("Enter the Second Value: ");
        // int num2 = sc.nextInt();
        // int position = posRightMostSet(num1, num2);
        // System.out.println("Postion of the Set Bit: "+position);

        //Q2)Find key in the given sorted 2-D Array
        // System.out.println("Enter the length of 2-D Array: ");
        // int row = sc.nextInt();
        // int col = sc.nextInt();

        // int arr[][] = new int[row][col];
        // System.out.println("Enter the VAlue in Array: ");
        // for(int i=0; i<row; i++){
        //     for(int j=0; j<col; j++){
        //         arr[i][j] = sc.nextInt();
        //     }
        // }
        // System.out.println("Array: ");
        // for(int i=0; i<row; i++){
        //     for(int j=0; j<col; j++){
        //         System.out.print(arr[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        // System.out.println("ENter the Key: ");
        // int key = sc.nextInt();
        // boolean res = findIndexOfKey(arr, key);
        // System.out.println(res);

        //Time Complexity: O(n+m)

        //Q3)Find the given String is Anagram or not
        // System.out.println("Enter the 1st String: ");
        // String str1 = sc.nextLine();
        // System.out.println("Enter the 2nd String: ");
        // String str2 = sc.nextLine();

        // boolean res = isAnagram(str1, str2);
        // System.out.println("Given String is Anagram: "+res);

        //Q4)Product Array Except itself
        System.out.println("Enter the length of Array: ");
        int len = sc.nextInt();

        int nums[] = new int[len];

        System.out.println("Enter the Value: ");
        for(int i=0; i<len; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("Array: ");
        for(int i=0; i<len; i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
        int result[] = productExceptItself(nums);
        System.out.println("Prduct Array: ");
        for(int i=0; i<len; i++){
            System.out.print(result[i]+" ");
        }
    }
}
