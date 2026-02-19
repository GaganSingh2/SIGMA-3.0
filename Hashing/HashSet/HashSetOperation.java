package Hashing.HashSet;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetOperation {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        //Add The Key
        System.out.println("Add Operation------");
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);
        set.add(null);
        set.add(50); //Not allow duplicate (it not showing any error but here again 50 is not inserted bcz 50 is already exist)
        System.out.println(set);

        //Remove The Kye
        System.out.println("Remove Operation--------");
        set.remove(20);
        System.out.println(set);

        //Contains Key
        System.out.println("Contains Key-----------");
        System.out.println("30 is present: "+set.contains(30));
        System.out.println("20 is Present: "+set.contains(20));

        //Check The SIze of Key
        System.out.println("Check SIze---------");
        System.out.println("SIze: "+set.size());

        //Display ALl the Key
        System.out.println("Display All Key--------");
        System.out.println("Using Iterator Interface:");
        Iterator ite = set.iterator();
        while (ite.hasNext()) {
            System.out.println("Key: "+ite.next());
        }

        System.out.println("Using Advanced Loop: ");
        for(Integer key: set){
            System.out.println("Key: "+key);
        }

        //Clear The HashSet
        System.out.println("Clear The HashSet--------");
        set.clear();
        System.out.println("Size: "+set.size());
    }
}
