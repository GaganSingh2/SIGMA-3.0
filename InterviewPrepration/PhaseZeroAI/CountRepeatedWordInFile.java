package InterviewPrepration.PhaseZeroAI;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class CountRepeatedWordInFile {
    public static void count() throws FileNotFoundException{
        File file = new File("E:\\SIGMA 3.0\\JAVA_Programming\\SIGMA-3.0\\InterviewPrepration\\PhaseZeroAI\\sample.txt");
        Scanner sc = new Scanner(file);

        HashMap<String, Integer> map = new HashMap<>();
        while (sc.hasNext()) {
            String str = sc.next();
            map.put(str, map.getOrDefault(str, 0)+1);
        }

        int repeat = 0;
        for(String k: map.keySet()){
            if (map.get(k)>1) {
                repeat++;
                System.out.println(k+" repeated "+map.get(k)+" times");
            }
        }
        System.out.println("Total Repeated Word: "+repeat);
    }
    public static void main(String[] args) {
        try{
            count();
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
