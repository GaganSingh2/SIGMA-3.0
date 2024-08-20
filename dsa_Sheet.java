import java.util.Arrays;
import java.util.Scanner;

public class dsa_Sheet {
    public static boolean isPalindrome(String str){
        //Convert all the string in lowercase and replace all non-numeric character
        String cleanString = str.toLowerCase().replaceAll("[^a-zA-Z0-9]","");
        //compare the both string from left to right
        int left = 0, right = cleanString.length()-1;
        while (left<right) {
            if (cleanString.charAt(left)!=cleanString.charAt(right)) {
                return false;//it is not a palindrome
            }
            left++;
            right--;
        }
        return true;
    }

    public static boolean isAnagram(String str1, String str2){
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        boolean res = true;
        //check the length is same in both string
        if (str1.length()==str2.length()) {
            //Convert String into array
            char str1charArray[] = str1.toCharArray();
            char str2charArray[] = str2.toCharArray();
            //sort the charArray
            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);
            //check the character are same iin array
            res = Arrays.equals(str1charArray, str2charArray);
        } 
        else{
            //if the length is not equal
            res = false;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          
        //--------Topic:-STRING------
        //Q1)[125]FInd the given String is Pailndrome or not

        // System.out.println("Enter the String: ");
        // String str = sc.nextLine();
        // System.out.println("String is: "+str);
        // boolean res = isPalindrome(str);
        // if (res==true) {
        //     System.out.println("It is a Palindrome");
        // }
        // else{
        //     System.out.println("It is not a Palindrome");
        // }

        //Q2)Find the given String is Anagram or not
        System.out.println("Enter the String: ");
        String str1 = sc.nextLine();
        System.out.println("Enter the String: ");
        String str2 = sc.nextLine();
        boolean result = isAnagram(str1, str2);
        if (result==true) {
            System.out.println("It is a Anagram");
        }
        else{
            System.out.println("It is not a Anagram");
        }

    }
}
