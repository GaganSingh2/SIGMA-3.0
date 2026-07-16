package InterviewPrepration.PhaseZeroAI;

import java.util.TreeMap;

public class Question10 {
    public static void solve(String[] words){
        TreeMap<String, Integer> map = new TreeMap<>();
        int mostRepeat = 0;
        for(String str: words){
            map.put(str, map.getOrDefault(str, 0)+1);
            mostRepeat = Math.max(mostRepeat, map.get(str));
        }
        System.out.println("Unique Words: ");
        System.out.println(map.keySet());
        System.out.println("Frequency Of Each Word: ");
        for(String s: map.keySet()){
            System.out.println(s+" -> "+map.get(s));
        }
        System.out.println("Most Repeated Words: ");
        for(String s: map.keySet()){
            if (map.get(s)==mostRepeat) {
                System.out.print(s+" ");
            }
        }
    }
    public static void main(String[] args) {
        String[] words = {"PhaseZero","Java","Developer","PhaseZero","Code","Code"};
        solve(words);

    }
}
