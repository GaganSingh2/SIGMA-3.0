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

        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        String res = revString(str);
        System.out.println("Reverse String is:"+res);
    }
}
