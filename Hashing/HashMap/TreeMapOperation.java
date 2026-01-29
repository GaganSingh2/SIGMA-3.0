package Hashing.HashMap;

import java.util.*;

public class TreeMapOperation {

    public static void main(String[] args) {
        TreeMap<String, Integer> tm = new TreeMap<>();

        // Its used inside Red-Black Tree(for Maintain the Sorted order of Key)

        // Put Operation O(log n) (because insert node into Red-Black Tree and tree
        // rebalance itself if neeeded!)
        System.out.println("put() Operation-----------");
        tm.put("India", 100);
        tm.put("China", 299);
        tm.put("Nepal", 30);
        tm.put("Indonasia", 20);
        System.out.println(tm);

        // Get Operation O(log n)(Binary Search used in Tree)
        System.out.println("Get() Operation-----------");
        System.out.println("Value Of India: " + tm.get("India"));
        System.out.println("Value Of NewZeland: " + tm.get("NewZeland"));

        // remove() Operation O(log n) {remove node and rebalance tree again}
        System.out.println("Remove() Operation--------");
        tm.remove("Nepal");
        System.out.println(tm);

        // entrySet() Operation O(n) {print key-value}
        System.out.println("entrySet() Operation------");
        for (Map.Entry<String, Integer> e : tm.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }

        // Custome Sorting using Comparator
        System.out.println("Custome Sorting using Comparator--------");
        Map<Integer, String> descMap = new TreeMap<>((a, b) -> b - a);

        descMap.put(1, "A");
        descMap.put(3, "C");
        descMap.put(2, "B");

        System.out.println(descMap);

        //Special TreeMap methods------------------
        //firstKey/lastKey
        System.out.println("FirstKey/LastKey Opration--------");
        System.out.println("FirstKey: "+tm.firstKey());
        System.out.println("LastKey: "+tm.lastKey());

        //higherKey/lowerKey
        System.out.println("HigherKey/LowerKey Operation-----------------");
        System.out.println("HigherKey: "+tm.higherKey("China")); //Just After the key present return
        System.out.println("LowerKey: "+tm.lowerKey("India")); //Just Before the key present return

        //subMap/headMap/tailMap
        System.out.println("subMap/headMap/tailMap Opretaion---------------");
        System.out.println("SubMap: "+tm.subMap("China", "Indonasia")); //from china to before indonasia whatever present return

        System.out.println("Head Map: "+tm.headMap("Indonasia")); //just before whatever node present return(Exclude the give key)

        System.out.println("TailMap: "+tm.tailMap("China"));//just after whatever node present return(include the give key)

    }
}
