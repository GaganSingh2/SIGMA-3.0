import java.util.Scanner;

public class qus_of_String {

    public static boolean checkPalindrome(String str){
        int n = str.length();
        for(int i=0; i<str.length()/2; i++){
            if (str.charAt(i)!=str.charAt(n-1-i)) {
                return false;
            }
        }
        return true;
    }


    public static float getShortestPath(String path){
        int x = 0, y = 0;
        for(int i=0; i<path.length(); i++){
            char dir = path.charAt(i);
            //North
            if (dir=='N') {
                y++;
            }
            //South
            else if (dir=='S') {
                y--;
            }
            //West
            else if (dir=='W') {
                x--;
            }
            //East
            else{
                x++;
            }
        }
        int x2 = x*x;
        int y2 = y*y;
        return (float)Math.sqrt(x2+y2);
        
    }


    public static String largestString(String fruit[]){
        String largest = fruit[0];
        for(int i=1; i<fruit.length; i++){
            if (largest.compareToIgnoreCase(fruit[i])<0) {
                largest = fruit[i];
            }
        }
        System.out.println();
        return largest;
    }

    public static String toupperCase(String letter){
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(letter.charAt(0));
        sb.append(ch);

        for(int i=1; i<letter.length(); i++){
            if (letter.charAt(i)==' ' && i<letter.length()-1) {
              sb.append(letter.charAt(i));
              i++;
              sb.append(Character.toUpperCase(letter.charAt(i)));  
            }
            else{
                sb.append(letter.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Q1)Check if a String is a Palindrome
        // System.out.println("Enter the String: ");
        // String str = sc.nextLine(); 
        // boolean res = checkPalindrome(str);
        // if (res==true) {
        //     System.out.println(str+" is a Palindrome");
        // }
        // else{
        //     System.out.println(str+" is not a palindrome");
        // }
        //Time Complexity:- O(n)


        //Q2) Given a route containing 4 direction (E,W,N,S), find the shortest path to reach destination
        // System.out.println("Enter the Path: "); 
        // String path = sc.nextLine();

        // float res = getShortestPath(path);
        // System.out.println("Shortest Path is "+res);


        //Q3)For a given set of String. print the largest string.
        // System.out.println("Enter the length of Array: "); 
        // int len = sc.nextInt();
        // String fruit[] = new String[len];

        // System.out.println("Enter the fruit name: ");
        // for(int i=0; i<len; i++){
        //     fruit[i] = sc.nextLine();
        // }
        // System.out.print("Fruits is: ");
        // for(int i=0; i<len; i++){
        //     System.out.print(fruit[i]+" ,");
        // }       
       
        // String res = largestString(fruit);
        // System.out.println("Largest String is: "+res);


        //Q4) For a given String convert each the first letter of each word to uppercase

        System.out.println("ENter the String: ");
        String letter = sc.nextLine();
        System.out.println("Before Converting: "+letter);

        System.out.println("After Converting: ");
        System.out.print(toupperCase(letter));
    }
}
