import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javax.swing.text.Style;

public class test {
    public static void insertionSort(int arr[]){
        for(int i=1; i<arr.length; i++){
            int curr = arr[i];
            int prev = i-1;
            //Finding out the correct position to insert
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev+1] = arr[prev];
                prev--;
            }
            //for insertion
            arr[prev+1] = curr;
        }
    }
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        
    }

    public static boolean canArrange(int[] arr, int k) {
        int [] freq = new int[k];
        for(int num: arr){
            int rem = num % k;
            if(rem < 0){
                rem = rem + k;
            }
            freq[rem]++;
        }
        if(freq[0] % 2 != 0){
            return false;
        }
        for(int i = 1;i <= k / 2;i++){
            if(freq[i] != freq[k-i]) {
                return false;
            }
        }
        return true;
    }

    public static int[] arrayRankTransform(int[] arr) {
        Map<Integer, Integer> valueToRank = new HashMap<>();  // Map to store value-to-rank mapping
        int[] sortedUniqueNumbers = Arrays.stream(arr).distinct().sorted().toArray();  // Remove duplicates and sort
        
        // Assign ranks to sorted unique elements
        for (int i = 0; i < sortedUniqueNumbers.length; i++) {
            valueToRank.put(sortedUniqueNumbers[i], i + 1);
        }

        // Replace each element in the original array with its rank
        for (int i = 0; i < arr.length; i++) {
            arr[i] = valueToRank.get(arr[i]);
        }

        return arr;  // Return the updated array
    }

    //Merge sorting
    public static void mergeSort(int arr[],int si, int ei){
        //Base Case
        if (si>=ei) {
            return;
        }

        //Divide
        int mid = si+(ei-si)/2;

        //Merge sort for left parrt
        mergeSort(arr, si, mid);
        //Merge Sort for right part
        mergeSort(arr, mid+1, ei);

        //for Merging
        merge(arr, si, mid, ei);
    }
    public static void merge(int arr[], int si, int mid, int ei){
        //Create Temparary Array
        int temp[] = new int[ei-si+1];
        int i = si; //iterator for left part
        int j = mid+1; //iterator for right part
        int k = 0; //iterator for temp arr

        //compare the both part & copy the smaller part in temp arr
        while (i<=mid && j<=ei) {
            if (arr[i]<arr[j]) {
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        //remaning left parrt
        while (i<=mid) {
            temp[k++]=arr[i++];
        }
        //remaning right part
        while (j<=ei) {
            temp[k++]=arr[j++];
        }
        //copy the temp to original arr
        for(k=0,i=si; k<temp.length; k++,i++){
            arr[i]=temp[k];
        }
    }

    
    
    public static boolean isSafe(char board[][],int row, int col){
        //Vertical Up
         for(int i=row-1; i>=0; i--){
            if (board[i][col]=='Q') {
                return false;
            }
         }
        //Diagonal Left Up
        for(int i=row-1,j=col-1; i>=0 && j>=0; i--,j--){
            if (board[i][j]=='Q') {
                return false;
            }
        }
        //Diagonal Right Up
        for(int i=row-1,j=col+1; i>=0 && j<board.length; i--,j++){
            if (board[i][j]=='Q') {
                return false;
            }
        }
        return true;
    }
    public static void  printBoard(char board[][]){
        System.out.println("-------Chess Board------");
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void n_Queens(char board[][], int row){
        //Base Case
        if (row==board.length) {
            printBoard(board);
            return;
        }

        for(int j=0; j<board.length; j++){
            if(isSafe(board, row, j)){
                board[row][j] = 'Q';
                n_Queens(board, row+1);
                board[row][j] = 'X';
            }
           
        }
    }
    public static boolean sum(int arr[],int k){
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if ((arr[i]+arr[j])==k) {
                    return true;
                }
            }
        }
        
        return false;
    }
    
    public static boolean isPalindrome(String str){
        int i=0; 
        int j=str.length()-1;
        while (i<j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;  
            }
            i++;
            j--;
        }
        return true;
    }

    public static void factorial(int num){
        if (num==0) {
            System.out.print(1);
            return;
        }
        BigInteger res = BigInteger.ONE;
        while (num>0) {
            res = res.multiply(BigInteger.valueOf(num));
            num--;
        }
        System.out.println("Result is: "+res);
    }
    public static String isRight(int arr[]){
        int len = arr.length;
        String res = "EVEN";
        Arrays.sort(arr);
        int diff = arr[0]-arr[len-1];
        if (diff % 2==0) {
            return res;
        }
        else{
            res = "ODD";
        }
        return res;
    }
    public static int findMajority(int[] arr, int n) {
		// Write your code here.
		if(arr.length == 1){
			return arr[0];
		}
	    int count = 0;
		for(int i=0; i<=n-1; i++){
			for(int j=i+1; j<n; j++){
				if(arr[i]==arr[j]){
					count++;
				}
			}
			if(Math.floor(n/2)<=count){
				return arr[i];
			}
			else{
                count =0;
			} 
		}
		
		return -1;
	}

    public static int maxBeauty(int nums[],int k){
        Arrays.sort(nums);
        int len = nums.length;
        int left = 0;
        int maxbeauty = 0;

        for(int right=0; right<len; right++){
            while (nums[right]-nums[left]>2*k) {
                left++;
            }
            maxbeauty = Math.max(maxbeauty, right-left+1);
        }
        return maxbeauty;
    }

    public static void printPattern(int n){
        for(int i=1; i<=n; i++){
            //space
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //stars
            for(int k=1; k<=2*i-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void swap(int arr1[],int arr2[]){
        arr1[0] = arr1[0]+arr2[0];
        arr2[0] = arr1[0]-arr2[0];
        arr1[0] = arr1[0]-arr2[0];
        System.out.println("After Swaping:");
        System.out.println("1st Value: "+arr1[0]);
        System.out.println("2nd Value: "+arr2[0]);
    }

    public static int minimumSumPair(int arr1[],int arr2[]){
        int len = arr1.length;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int res = 0;
        int i = 0;
        int j = 0;
        while (i<len) {
            res += Math.abs(arr1[i]-arr2[j]);
            i++;
            j++;
        }
        return res;
    }

    public static boolean oneSegment(String str){
        if(str.contains("01")){
            return false;
        }
        return true;
    }

    public static boolean isPeriodic(String s) {
        // Write your code here.
        int len = s.length();
        
        for(int period=1; period<=len/2; period++){
            if(len % period == 0){
                String subString = s.substring(0,period);
                StringBuilder repeat = new StringBuilder();
                for(int i=0; i<len/period; i++){
                    repeat.append(subString);
                }
                if(repeat.toString().equals(s)){
                    return true;
                }
            }
        }
        return false;
    }

    public static int isSorted(int arr[]){
        for(int i=1; i<arr.length; i++){
            if(arr[i]<arr[i-1]){
                return 0;
            }
        }
        return 1;
    }

    
    public static int missingNumber(int arr[]) {
            // code here
            int n = arr.length+1;
            Arrays.sort(arr);
            int sum = n*(n+1)/2;
            int ans=0;
            for(int i=0; i<n-1; i++){
                ans += arr[i];
            }
            
            return sum-ans;
        
    }

    public static boolean oddOrEven(int value){
        int bitMask = 1;

        if((value & bitMask)==0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int arr[] = {5,4,1,3,2};
        // insertionSort(arr);
        // printArr(arr);
       

        //Q2)[1497]Check if array pairs are divisible by K.
        // int arr[]={1,2,3,4,5,10,6,7,8,9};
        // System.out.println("Enteer the value of K: ");
        // int k = sc.nextInt();
        // System.out.println(canArrange(arr, k)); 
            
        //Q3)[1331]Given an array of integers arr, replace each element with its rank.
        // int arr[] = {23,43,54,12,4};
        // int res[] = arrayRankTransform(arr);
        // for(int i=0; i<res.length; i++){
        //     System.out.print(res[i]+" ");
        // }

        //----MERGE SORT--
        // System.out.println("Enter the length of Array: ");
        // int len = sc.nextInt();
        // int arr[] = new int[len];
        // System.out.println("Enter the value in Array: ");
        // for(int i=0; i<len; i++){
        //     arr[i] = sc.nextInt();
        // }
        // System.out.println("Before Sorted Array: ");
        // printArr(arr);
        // mergeSort(arr, 0, arr.length-1);
        // System.out.println("After Sorted Array: ");
        // printArr(arr);

        //Q)Place the N-Queens on the chess board
        // System.out.println("ENter the number of Queen: ");
        // int N = sc.nextInt();

        // char board[][] = new char[N][N];
        // for(int i=0; i<N; i++){
        //     for(int j=0; j<N; j++){
        //         board[i][j] = 'X';
        //     }
        // }
        // n_Queens(board, 0);

        //
        // System.out.println("Length: ");
        // int len = sc.nextInt();
        // int arr[] = new int[len];
        // System.out.println("value:");
        // for(int i=0; i<len; i++){
        //     arr[i]=sc.nextInt();
        // }
        // System.out.println("array");
        // for(int i=0; i<len; i++){
        //     System.out.print(arr[i]+" ");
        // }
        // for(int i=0; i<arr.length-1; i++){
            
        //         if(arr[i]<arr[i+1]){
        //             int temp=arr[i+1];
        //             arr[i+1]=arr[i];
        //             arr[i]=temp;
        //         }
            
        // }
        // System.out.println("result");
        // for(int i=0; i<arr.length; i++)
        // {
        //     System.out.print(arr[i]+" ");
        // }

        //Q)
        // System.out.println("Enter the length of Array: ");
        // int len = sc.nextInt();
        // int arr[] = new int[len];
        // System.out.println("Enter the value: ");
        // for(int i=0; i<len; i++){
        //     arr[i] = sc.nextInt();
        // }
        // System.out.println("Array is: ");
        // for(int i=0; i<len; i++){
        //     System.out.print(arr[i]+" ");
        // }
        // System.out.println();
        // System.out.println("Enter key: ");
        // int k = sc.nextInt();
        // System.out.println(sum(arr, k));

        //Q)Check a Palindrome
        // System.out.println("Entre the String: ");
        // String str = sc.nextLine();
        // System.out.println("String is: "+str);
        // boolean res = isPalindrome(str);
        // System.out.println("Result is: "+res);

        //Time Complexit:- O(logn)
        //System.out.println(24);

        //Q) Find Factorial for BigInteger
        // System.out.println("Enter the number: "); 
        // int num = sc.nextInt();
        // factorial(num);

        //Q)Find the biggest diff in two value and return EVEN if diff is even and ODD if diff is odd
        // System.out.println("Enter the length: ");
        // int len = sc.nextInt();
        // int arr[] = new int[len];
        // System.out.println("Enter the value: ");
        // for(int i=0; i<arr.length; i++){
        //     arr[i] = sc.nextInt();
        // }
        // System.out.println("Array: ");
        // for(int i=0; i<arr.length; i++){
        //     System.out.print(arr[i]+" ");
        // }System.out.println();
        // String res = isRight(arr);
        // System.out.println("Result: "+res);

        //Q) Swap the value without using 3rd variable

        // System.out.println("Enter the 1st value: ");
        // int a = sc.nextInt();
        // System.out.println("Enter the 2nd value: ");
        // int b = sc.nextInt();

        
        // System.out.println("Val1: "+ ((a+b)-a)); 
        // System.out.println("Val2: "+((a+b)-b));

        //Q) FInd majority element
        //  System.out.println("ENter the length: ");
        //  int len = sc.nextInt();
        //  int arr[] = new int[len];
        //  System.out.println("Enter the value in Array: ");
        //  for(int i=0; i<len; i++){
        //     arr[i] = sc.nextInt();
        //  }
        //  System.out.println("Array: ");
        //  for(int i=0; i<len; i++){
        //     System.out.print(arr[i]+" ");
        //  }
        //  System.out.println();
        //  int res = findMajority(arr, len);
        //  System.out.println("Majority Element: "+res);

         //Time Complexity:

         //Q) Maximum beauty of an array after applying the operation
        //  System.out.println("ENter the lenght: ");
        //  int len = sc.nextInt();
        //  int arr[] = new int[len];
        //  System.out.println("Enter the value in Array: ");
        //  for(int i=0; i<len; i++){
        //     arr[i] = sc.nextInt();
        //  }
        //  System.out.println("Array: ");
        //  for(int i=0; i<len; i++){
        //     System.out.print(arr[i]+" ");
        //  }System.out.println();
        //  System.out.println("Enter the value of K: ");
        //  int k = sc.nextInt();

        //  System.out.println("Result: "+maxBeauty(arr, k));

         //Time Complexity:
         //Space Complexity:

         //Q)Print the pattern
        //  System.out.println("ENter the number of Line: ");
        //  int n = sc.nextInt();
        //  printPattern(n);

        //Q)Swap the number using array
        // int arr1[] = new int[1];
        // int arr2[] = new int[1];
        // System.out.println("Enter the 1st value: ");
        // arr1[0] = sc.nextInt();
        // System.out.println("Enter the 2nd value: ");
        // arr2[0] = sc.nextInt();
        // System.out.println("Before Swapping: ");
        // System.out.println("1st Value: "+arr1[0]);
        // System.out.println("2nd Value: "+arr2[0]);
        // swap(arr1, arr2);

        //Time Complexity:
        //Space Complexity:

        //Q)Minimum sum of pairing in two same size of array
        // System.out.println("ENter the lenght: ");
        //  int len = sc.nextInt();

        //  int arr1[] = new int[len];
        //  int arr2[] = new int[len];

        //  System.out.println("Enter the value in 1st Array: ");
        //  for(int i=0; i<len; i++){
        //     arr1[i] = sc.nextInt();
        //  }
        //  System.out.println("Enter the value in 2nd Array: ");
        //  for(int i=0; i<len; i++){
        //     arr2[i] = sc.nextInt();
        //  }

        //  System.out.println("1st Array: ");
        //  for(int i=0; i<len; i++){
        //     System.out.print(arr1[i]+" ");
        //  }System.out.println();

        //  System.out.println("2nd Array: ");
        //  for(int i=0; i<len; i++){
        //     System.out.print(arr2[i]+" ");
        //  }System.out.println();

        //  int res = minimumSumPair(arr1, arr2);
        //  System.out.println("Minimum Sum: "+res);

         //Time Complexit: O(log n)
         //Space Complexity: O(1)
         
         //Q)You are given a binary string ‘STR’, containing only zeroes and ones. This string does not contain any leading zero.Your task is to determine if this string contains at most one contiguous segment of ones.
        //  System.out.println("Enter the String in 0 & 1: ");
        //  String str = sc.nextLine();
        //  boolean res = oneSegment(str);

        //  System.out.println("Result is: "+res);

         //Time Complexity: O(n)
         //Space Complexity: O(1)

         //Q) Check the given string is periodic or not(Periodic means the given string can repeate less then time of our size)
        //  System.out.println("ENter the String: ");
        //  String str = new String();
        //  Boolean res = isPeriodic(str);
        //  System.out.println("Result: "+res);

         //Time Complexity: O(n)
         //Space Complexity: O(1)

         //Q)You have been given an array ‘a’ of ‘n’ non-negative integers.You have to check whether the given array is sorted in the non-decreasing order or not.Your task is to return 1 if the given array is sorted. Else, return 0.
        //  System.out.println("ENter the lenght: ");
        //  int len = sc.nextInt();
        //  int arr[] = new int[len];
        //  System.out.println("Enter the value in Array: ");
        //  for(int i=0; i<len; i++){
        //     arr[i] = sc.nextInt();
        //  }
        //  System.out.println("Array: ");
        //  for(int i=0; i<len; i++){
        //     System.out.print(arr[i]+" ");
        //  }System.out.println();

        //  int res = isSorted(arr);
        //  System.out.println("Result is: "+res);

         //Time Complexity: O(n)
         //Space COmplexity: O(1)

         //Q)Create a array and  check the missing number(1 to n)
        //  System.out.println("ENter the lenght: ");
        //  int len = sc.nextInt();
        //  int arr[] = new int[len];
        //  System.out.println("Enter the value in Array: ");
        //  for(int i=0; i<len; i++){
        //     arr[i] = sc.nextInt();
        //  }
        //  System.out.println("Array: ");
        //  for(int i=0; i<len; i++){
        //     System.out.print(arr[i]+" ");
        //  }System.out.println();

        //  int res = missingNumber(arr);
        //  System.out.println("VAlue is: "+res);

         //Time COmplexity:O(n)
         //Space COmplexity:O(1)

         //Q)Given value is odd or even in Bit-Manipulation
         System.out.println("ENter the Value: ");
         int value = sc.nextInt();

         boolean res = oddOrEven(value);
        if (res==true) {
            System.out.println(+value+" is Even");
        }
        else{
            System.out.println(+value+" is Odd");
        }
    }
}
