package InterviewPrepration.PhaseZeroAI;

import java.util.HashMap;
import java.util.Scanner;

public class FrequencyOfEachWordInSentence {
    public static void freqOfEachWord(String str){
        String[] temp = str.split("\\s+"); //split based on whitespace
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0; i<temp.length; i++){
            map.put(temp[i], map.getOrDefault(temp[i], 0)+1);
        }
        for(String k: map.keySet()){
            System.out.println("Key: "+k+" -> Count: "+map.get(k));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Sentence: ");
        String str = sc.nextLine();
        freqOfEachWord(str);
    }
}
