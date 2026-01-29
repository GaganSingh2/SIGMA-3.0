package Hashing.HashMap;

import java.util.*;

public class TreeMapOperation {
    
    public static void main(String[] args) {
        Map<String,Integer> tm = new TreeMap<>();

        //Its used inside Red-Black Tree(for Maintain the Sorted order of Key)

        //Put Operation O(log n) (because insert node into Red-Black Tree and tree rebalance itself if neeeded!)
        System.out.println("put() Operation-----------");
        tm.put("India", 100);
        tm.put("China", 299);
        tm.put("Nepal", 30);
        tm.put("Indonasia", 20);
        System.out.println(tm);

        //Get Operation O(log n)(Binary Search used in Tree)
        System.out.println("Get() Operation-----------");
        System.out.println("Value Of India: "+tm.get("India"));
         System.out.println("Value Of NewZeland: "+tm.get("NewZeland"));


         //remove() Operation O(log n) {remove node and rebalance tree again}
         System.out.println("Remove() Operation--------");
         tm.remove("Nepal");
         System.out.println(tm);

    }
}
