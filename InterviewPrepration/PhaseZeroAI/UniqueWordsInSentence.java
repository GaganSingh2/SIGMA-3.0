package InterviewPrepration.PhaseZeroAI;

import java.util.HashSet;
import java.util.Scanner;

public class UniqueWordsInSentence {
    public static void uniqueWordsInSentence(String str){
        String[] words = str.split("\\s+");
        HashSet<String> set = new HashSet<>();
        for(String s: words){
            if (set.contains(s)) {
                System.out.println(s);
            }
            set.add(s);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.nextLine();
        uniqueWordsInSentence(str);
    }
}
