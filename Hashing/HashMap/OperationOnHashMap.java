package Hashing.HashMap;

import java.util.HashMap;

public class OperationOnHashMap {
    public static void main(String[] args) {
        HashMap<String,Integer> player = new HashMap<>();

        //Insertion Operation using {put(key,value)} O(1)
        System.out.println("Insertion Operation----------");
        player.put("Virat", 18);
        player.put("Rohit", 45);
        player.put("Rahul", 1);
        System.out.println(player);

        //Access or Get Operation using {get(key)} O(1)
        System.out.println("Get Operation--------------");
        int jersyNo = player.get("Virat");
        System.out.println("JersyNo: "+jersyNo);
        Integer jersyNo2 = player.get("MS");
        System.out.println("JersyNo: "+jersyNo2);

        //Search Operation ------------------
        System.out.println("Search Operation----------------");
        //For Key using {containsKey(key)} O(1)----
        boolean res = player.containsKey("Virat");
        System.out.println("Virat is persent: "+res);
        boolean res2 = player.containsKey("MS");
        System.out.println("MS is Present: "+res2);

        //For Value using {containsValue(value)} O(1)-----
        boolean res3= player.containsValue(18);
        System.out.println("18 is persent: "+res3);
        boolean res4 = player.containsValue(7);
        System.out.println("7 is Present: "+res4);

        //Find Size---------------
        System.out.println("Find Size-------");
        System.out.println("Size of Map: "+player.size());

        //Remove or Delete Operation----------
        System.out.println("Remove Operation------");
        //Using remove(key) O(1) {remove entry with specified key}
        System.out.println("Player Remove: "+player.remove("Rahul")); //1 means key exist and delete
        System.out.println(player);

        System.out.println("Player Remove: "+player.remove("MS")); //Null means key not exist
        System.out.println(player);
        //Using clear()  {Remove all entrys}
        player.clear();
        System.out.println(player);

        //Check HashMap is Empty or Not
        System.out.println("Check Empty or Not--------------");
        System.out.println("HashMap is Empty: "+player.isEmpty());
    }
}
