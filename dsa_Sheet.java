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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          
        //--------Topic:-STRING------
        //Q1)[125]FInd the given String is Pailndrome or not
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        System.out.println("String is: "+str);
        boolean res = isPalindrome(str);
        if (res==true) {
            System.out.println("It is a Palindrome");
        }
        else{
            System.out.println("It is not a Palindrome");
        }
    }
}
