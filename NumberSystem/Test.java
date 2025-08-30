package NumberSystem;
import java.util.Scanner;
public class Test {
    static void longestWord(String str){
        String str2[] = str.split(" ");
        String res = "";
        int len = Integer.MIN_VALUE;
        for(int i=0; i<str2.length; i++){
            if(len<str2[i].length()){
                len = str2[i].length();
                res = str2[i];
            }
        }
        System.out.println(res);
    }
    public static void main(String[] args) {
        //Q1)Longest Word in the String
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        longestWord(str);
    }
}
