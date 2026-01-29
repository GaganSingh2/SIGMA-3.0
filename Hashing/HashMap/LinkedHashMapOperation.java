package Hashing.HashMap;

import java.util.*;
public class LinkedHashMapOperation {
    
    public static void main(String[] args) {
        Map<Integer,String> lhm = new LinkedHashMap<>();

        //Put Operation O(1)
        System.out.println("Put Operation--------");
        lhm.put(1, "Core Java");
        lhm.put(2, "Spring");
        lhm.put(3, "Hibernate");
        lhm.put(4, "Servlet");
        System.out.println(lhm);

        //Get Operation O(1)
        System.out.println("Get Operation----------");
        System.out.println("Value of 3: "+lhm.get(3));
        System.out.println("Value of 1: "+lhm.get(1));
        System.out.println("Value of 5: "+lhm.get(5));

        //Remove Operation (Delete Key-value)
        System.out.println("Remove Operation---------");
        lhm.remove(4);
        lhm.remove(5);
        System.out.println(lhm);


        //KeySet Operation
        System.out.println("keySet() Operation--------");
        for(Integer k: lhm.keySet()){
            System.out.println(k);
        }

        //values() Operation
        System.out.println("values() Operation---------");
        for(String val: lhm.values()){
            System.out.println(val);
        }

        //entrySet() Operation (Print key-value and Maintain Order)
        System.out.println("entrySet() Operation(Key-value)----------------");
        for(Map.Entry<Integer,String> e: lhm.entrySet()){
            System.out.println(e.getKey()+" -> "+e.getValue());
        }
    }
}
