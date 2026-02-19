package Hashing.HashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;
public class LinkedHashSetOperation {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();

        //Add Key Operation
        System.out.println("Add Operation--------------");
        set.add("Virat");
        set.add("MS");
        set.add("Rohit");
        set.add("Hardik");
        set.add("Rahul");
        System.out.println(set);

        //Remove Key Operation
        System.out.println("Remove Operation---------");
        set.remove("Rahul");
        System.out.println(set);

        //Contains Key Operation
        System.out.println("Contains Key Operation-------");
        System.out.println("Virat is Present: "+set.contains("Virat"));
        System.out.println("Rahul is Present: "+set.contains("Rahul"));

        //Size Check operation
        System.out.println("Size Check---------");
        System.out.println("Size: "+set.size());

        //Display All Key
        System.out.println("Display All Key----------");
        System.out.println("Using Iterator interface-------");
        Iterator ite = set.iterator();
        while (ite.hasNext()) {
            System.out.println("Key: "+ite.next());
        }
        System.out.println("Using Advanced For Loop-------");
        for(String player: set){
            System.out.println("Key: "+player);
        }

        //CLear LinkedHashSet
        System.out.println("Clear LinkedHashSet-----------");
        set.clear();
        System.out.println("Size: "+set.size());

    }
}
