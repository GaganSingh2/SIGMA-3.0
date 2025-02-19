import java.util.Scanner;
import java.util.*;
public class CodingNinza {
    public static int square(int num){
        int squ = 0;
        num = Math.abs(num);
        for(int i=0; i<num; i++){
            squ += num;
        }
        return squ;
    }

    public static boolean canBeSumisEven(int val){
        if (val%2==0 && val>=4) {
            return true;
        }
        return false;
    }

    public static double power(int val, int pow){
        double res = Math.pow(val, pow);
        return res;
    }

    public static String reverseStatement(String statement){
        //remove the extra spaces
        statement = statement.trim();

        //divide the string into singal words
        String[] words = statement.split("\\s+");

        //reversse the string using StringBuilder
        StringBuilder reverse = new StringBuilder();
        for(int i=words.length-1; i>=0; i--){
            reverse.append(words[i]);
            if (i != 0) {
                reverse.append(" ");
            }
        }
        return reverse.toString();
    }

    public static String revString(String str){
       // String cleanString = str.replaceAll("[^a-zA-Z0-9]", "");
        StringBuilder sb = new StringBuilder();
        for(int i=str.length()-1; i>=0; i--){
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    public static int toggleKBits(int num, int k){
        int mask = (1<<k)-1;
        int result = num ^ mask;
        return result;
    }

    public static ArrayList<Integer> absDiff(ArrayList<Integer> arr, int n) {
            // Write your code here.
            ArrayList<Integer> even = new ArrayList<>();
            ArrayList<Integer> odd = new ArrayList<>();
    
            ArrayList<Integer> diff = new ArrayList<>();
            
            //System.out.print(even.get(0));
            int i=0;
            while(i<arr.size()){
                if(i % 2 == 0){
                    even.add(arr.get(i));   //17,18
                }
                else{
                    odd.add(arr.get(i));    //6,8
                }
                i++;
            }
        
            int k=2;
            if(even.size()==0){
                diff.add(0);
            }
            else if(even.size()==1){
                diff.add(even.get(0));
            }
            else{
                int reev = Math.abs(even.get(0)-even.get(1));
                if(even.size()>2){
                    while(k<even.size()){
                        reev = Math.abs(reev - even.get(k));
                        k++;
                    }
                }
            
                diff.add(reev);
            }
    
            int j=2;
            if(odd.size()==0){
                diff.add(0);
            }
            else if(odd.size()==1){
                diff.add(odd.get(0));
            }
            else{
                int reod = Math.abs(odd.get(0)-odd.get(1));
                if(odd.size()>2){
                    while(j<=odd.size()-1){
                        reod = Math.abs(reod - odd.get(j));
                         j++;
                    }
                }
            
                diff.add(reod);
            }
            
            return diff;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Q1)Given an integer ‘N’, you are supposed to return the square of the given integer without using multiplication (*), division (/) or power function (pow()).
        // System.out.println("Enter the Number: ");
        // int num = sc.nextInt();
        
        // int res = square(num);
        // System.out.println("Sqaure of "+num+" is: "+res);

        //Time Complexity: O(n)
        //Space Complexity: O(1)

        //Q2)You are given a positive integer ‘N’. You have to check whether ‘N’ can be represented as a sum of two even numbers or not.

        // System.out.println("Enter the value: ");
        // int val = sc.nextInt();
        // boolean res = canBeSumisEven(val);
        // if(res==true){
        //     System.out.println("The "+val+" represent as a sum of Two even numbers");
        // }
        // else{
        //     System.out.println("The "+val+" does not represent as a sum of Two even numbers");
        // }

        //Time Complexity: O(n)
        //Space Complexity: O(1)

        //Q2)Find the power of the given value
        // System.out.println("Enter the value: ");
        // int val = sc.nextInt();
        // System.out.println("Enter the time's of power: ");
        // int pow = sc.nextInt();
        // double res = power(val, pow);
        // System.out.println("Result is: "+res);

        //Q3)You are given a string 'str' of length 'N'.Your task is to reverse the original string word by word.
        // System.out.println("Enter the Statement: ");
        // String statement = sc.nextLine();

        // String revString = reverseStatement(statement);

        // System.out.println("Reverse Statement: "+revString);

        //Q)You are given a string 'STR'. The string contains [a-z] [A-Z] [0-9] [special characters]. You have to find the reverse of the string.For example:If the given string is: STR = "abcde". You have to print the string "edcba".

        // System.out.println("Enter the String: ");
        // String str = sc.nextLine();
        // String res = revString(str);
        // System.out.println("Reverse String is:"+res);

        //Q)You are given a 32-bit integer ‘N’. Your task is to toggle the rightmost ‘K’ bits in the given integer and return the new integer.For Example :If ‘N’ = 12 and ‘K’ = 2:The binary representation of 12 is ‘1100’, after toggling rightmost 2 bits, it becomes ‘1111’ i.e. 15. Hence, the answer is 15. 
        
        // System.out.println("Enter the value: ");
        // int num = sc.nextInt();
        // System.out.println("Enter the value of K: ");
        // int k = sc.nextInt();
        // int res = toggleKBits(num, k);
        // System.out.println("After Toggling: "+res);

        //Q)You are given an array/list 'ARR' consisting of 'N' non - negative integers. Your task is to return the running absolute difference of the elements at even and odd index positions separately.The index of the first element in the array is considered to be zero that is 0 - based indexing is considered for calculating the parity of the index.
        System.out.println("Enter the lenght: ");
        int len = sc.nextInt();
        int arr[] = new int[len];
        System.out.println("Enter the value: ");
        for(int i=0; i<len; i++){
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> list = new ArrayList<>();
        //System.out.println("Array: ");
        for(int i=0; i<len; i++){
            list.add(arr[i]);
        }
        System.out.println("Array: ");
        for(int i=0; i<len; i++){
            System.out.print(list.get(i)+" ");
        }

        ArrayList<Integer> result = new ArrayList<>();
        result = absDiff(result, len);
        System.out.println("Final Result: ");
        for(int i=0; i<result.size(); i++){
            System.out.print(result.get(i)+" ");
        }

    }
}
