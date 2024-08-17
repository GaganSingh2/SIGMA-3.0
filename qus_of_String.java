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
        System.out.println("Enter the Path: "); 
        String path = sc.nextLine();

        float res = getShortestPath(path);
        System.out.println("Shortest Path is "+res);


    }
}
