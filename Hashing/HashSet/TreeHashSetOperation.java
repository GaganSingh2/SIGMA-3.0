package Hashing.HashSet;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeHashSetOperation {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        
        //Add Key Operation(Arrange in Sorted Order)
        System.out.println("Add Operation---------");
        set.add("Virat");
        set.add("MS");
        set.add("Rohit");
        set.add("Hardik");
        set.add("Rahul");
        // set.add(null); //Null not allow
        System.out.println(set);

        //Remove key Operation
        System.out.println("Remove Operation---------");
        set.remove("Rahul");
        System.out.println(set);

        //Contains key Operation
        System.out.println("Contains key Operation--------");
        System.out.println("Virat is Present: "+set.contains("Virat"));
        System.out.println("Rahul is Present: "+set.contains("Rahul"));

        //Size check
        System.out.println("Size Check------");
        System.out.println("Size: "+set.size());

        //Display Operation
        System.out.println("Display Operation-------");
        System.out.println("Using Iterator interface:");
        Iterator ite = set.iterator();
        while (ite.hasNext()) {
            System.out.println("Key: "+ite.next());
        }
        System.out.println("Using Advanced for Loop: ");
        for(String player: set){
            System.out.println("Key: "+player);
        }

        //Clear The TreeSet
        System.out.println("Clear Operation---------");
        set.clear();
        System.out.println("Size: "+set.size());
    }
}
