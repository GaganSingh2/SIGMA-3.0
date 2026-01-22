package Hashing.HashMap;

import java.util.HashMap;
import java.util.Map;

public class IterationOnHashMap {
    public static void main(String[] args) {
        HashMap<String,Integer> player = new HashMap<>();
        player.put("Virat", 18);
        player.put("Rohit", 45);
        player.put("Rahul", 1);
        player.put("MS", 7);
        player.put("Hardik", 11);
        player.put("Gill", 15);

        //1st Way) using entrySet()
        System.out.println("Iterate Using entrySet() method------");
        for(Map.Entry<String,Integer> entry: player.entrySet()){
            System.out.println(entry.getKey()+" = "+entry.getValue());
        }

        //2nd Way) using keySet() and get()
        System.out.println("Iterate Using keySet() & get()-----------");
        for(String key: player.keySet()){
            System.out.println(key+" = "+player.get(key));
        }
    }
}
