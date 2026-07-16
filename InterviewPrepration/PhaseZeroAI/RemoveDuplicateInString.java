package InterviewPrepration.PhaseZeroAI;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicateInString {
    public static void removeDuplicate(String str){
        String[] words = str.split("\\s+");
        LinkedHashSet<String> set = new LinkedHashSet<>();
        for(String s: words){
            set.add(s);
        }
        System.out.println(set);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.nextLine();
        removeDuplicate(str);
    }
}
