package InterviewPrepration.PhaseZeroAI;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.TreeSet;

public class Question9 {
    public static void solve(List<String> parts){
       
        TreeSet<String> set = new TreeSet<>();
        
        ListIterator<String> i = parts.listIterator();
        while (i.hasNext()) {
            //Normalize all words in LowerCase
            String str = i.next().toLowerCase();
            set.add(str);//remove duplicates using TreeSet and sort them 
        }
        for(String s: set){
            System.out.println(s);
        }
    }
    public static void main(String[] args) {
        List<String> parts = Arrays.asList("PhaseZero","phasezero","JavaPart","javapart","PhaseZero","CodePart");
        solve(parts);
    }
}
