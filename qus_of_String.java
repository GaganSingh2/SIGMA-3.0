import java.util.Arrays;
import java.util.Scanner;

public class qus_of_String {

    public static boolean checkPalindrome(String str) {
        int n = str.length();
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static float getShortestPath(String path) {
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);
            // North
            if (dir == 'N') {
                y++;
            }
            // South
            else if (dir == 'S') {
                y--;
            }
            // West
            else if (dir == 'W') {
                x--;
            }
            // East
            else {
                x++;
            }
        }
        int x2 = x * x;
        int y2 = y * y;
        return (float) Math.sqrt(x2 + y2);

    }

    public static String largestString(String fruit[]) {
        String largest = fruit[0];
        for (int i = 1; i < fruit.length; i++) {
            if (largest.compareToIgnoreCase(fruit[i]) < 0) {
                largest = fruit[i];
            }
        }
        System.out.println();
        return largest;
    }

    public static String toupperCase(String letter) {
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(letter.charAt(0));
        sb.append(ch);

        for (int i = 1; i < letter.length(); i++) {
            if (letter.charAt(i) == ' ' && i < letter.length() - 1) {
                sb.append(letter.charAt(i));
                i++;
                sb.append(Character.toUpperCase(letter.charAt(i)));
            } else {
                sb.append(letter.charAt(i));
            }
        }
        return sb.toString();
    }

    public static String toCompress(String str) {
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            int count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if (count > 1) {
                sb.append(count);
            }
        }
        return sb.toString();
    }

    public static int lowercaseVowelsOccurred(String let) {
        int count = 0;
        for (int i = 0; i < let.length(); i++) {
            if (let.charAt(i) == 'a') {
                count++;
            } else if (let.charAt(i) == 'e') {
                count++;
            } else if (let.charAt(i) == 'i') {
                count++;
            } else if (let.charAt(i) == 'o') {
                count++;
            } else if (let.charAt(i) == 'u') {
                count++;
            }
        }
        return count;
    }

    public static boolean isAnagram(String str1, String str2) {
        // Convert Strings to lowercase. Why? so thatwe don't have to check separately  for lower & uppercase.
        
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        boolean res = true;
        // first check- if the length are the same of both string
        if (str1.length() == str2.length()) {
            // Convert Strings into char array
            char str1charArray[] = str1.toCharArray();
            char str2charArray[] = str2.toCharArray();
            // Sort the char array
            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);
            // if the sorted char arrays are same or identical then the strings are anagram
            res = Arrays.equals(str1charArray, str2charArray);
        } else {
            // case when the length are not equal
            res = false;
        }
        return res;
    }


    public static boolean isPalindrome(String str){
        // Convert the string to lowercase and remove non-alphanumeric characters
        String cleanString = str.toLowerCase().replaceAll("[^a-zA-Z0-9]","");
        //Compare character from both ends of the string
        int left = 0, right = cleanString.length()-1;
        while (left<right) {
            if (cleanString.charAt(left)!=cleanString.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        System.out.println("After removing all Non-numeric Character: "+cleanString);
        return true;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Q1)Check if a String is a Palindrome
        // System.out.println("Enter the String: ");
        // String str = sc.nextLine();
        // boolean res = checkPalindrome(str);
        // if (res==true) {
        // System.out.println(str+" is a Palindrome");
        // }
        // else{
        // System.out.println(str+" is not a palindrome");
        // }
        // Time Complexity:- O(n)

        // Q2) Given a route containing 4 direction (E,W,N,S), find the shortest path to
        // reach destination
        // System.out.println("Enter the Path: ");
        // String path = sc.nextLine();

        // float res = getShortestPath(path);
        // System.out.println("Shortest Path is "+res);

        // Q3)For a given set of String. print the largest string.
        // System.out.println("Enter the length of Array: ");
        // int len = sc.nextInt();
        // String fruit[] = new String[len];

        // System.out.println("Enter the fruit name: ");
        // for(int i=0; i<len; i++){
        // fruit[i] = sc.nextLine();
        // }
        // System.out.print("Fruits is: ");
        // for(int i=0; i<len; i++){
        // System.out.print(fruit[i]+" ,");
        // }

        // String res = largestString(fruit);
        // System.out.println("Largest String is: "+res);

        // Q4) For a given String convert each the first letter of each word to
        // uppercase

        // System.out.println("ENter the String: ");
        // String letter = sc.nextLine();
        // System.out.println("Before Converting: "+letter);

        // System.out.println("After Converting: ");
        // System.out.print(toupperCase(letter));

        // Q5) Find the String Compression.ex:-"aaabbcccdd":-"a3b2c3d2"
        // String str = "aaabbcccdd";
        // System.out.println("Before Compression: "+str);
        // System.out.println("After COmpression: "+toCompress(str));
        // Time Complexity = O(n)

        // Q6) Count how many times lowercase vowels occurred in a string entered by the
        // user.
        // System.out.println("Enter the String: ");
        // String let = sc.nextLine();
        // System.out.println("String is: "+let);
        // int res = lowercaseVowelsOccurred(let);
        // System.out.println("Vowels in Strings are "+res+"times occurred.");

        // Q7) Determine if 2 Strings areanagramsof each other.ex:- race and care
        // character is equal or not.

        // System.out.println("Enter the first String: ");
        // String str1 = sc.nextLine();
        // System.out.println("ENter the second String: ");
        // String str2 = sc.nextLine();
        // boolean result = isAnagram(str1, str2);
        // if (result == true) {
        //     System.out.println(str1 + " and " + str2 + " are both Anagram.");
        // } else {
        //     System.out.println(str1 + " and " + str2 + " are not Anagram");
        // }


        //Q8) A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.Given a string s, return true if it is a palindrome, or false otherwise.
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        System.out.println("String is: "+str);
        boolean res = isPalindrome(str);
        if (res==true) {
            System.out.print("It is a palindrome");
        }
        else{
            System.out.println("It is not a palindrome");
        }

    

    }
}
