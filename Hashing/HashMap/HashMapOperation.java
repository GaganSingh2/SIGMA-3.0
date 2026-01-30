package Hashing.HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapOperation {
    
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();

        //Put Operation(Update)
        System.out.println("Put Operation----------");
        map.put("Java",1);
        map.put("Spring", 2);
        map.put("Hibernate", 3);
        System.out.println(map);
        System.out.println("Update Opration---------");
        map.put("Spring-Boot", 1);
        System.out.println(map);

        //Get Operation(fetch value using key)
        System.out.println("Get Operation------------");
        System.out.println("Value Of Java: "+map.get("Java"));
        System.out.println("Value of C++: "+map.get("C++"));

        //getOrDefault() (avoid null checks)----------
        System.out.println("getOrDefault Operation-----------");
        // It returns the value for the key if present,
        System.out.println("Value of Spring: "+map.getOrDefault("Spring", 5)); //Spring-Boot (because 2 is present so its return the value)
        // otherwise it returns the default value you provide
        System.out.println("Value of C++: "+map.getOrDefault("C++", 10)); //JDBC (because 5 is not present so its return our passed defaultvalue not null value)
        map.put("Java", map.getOrDefault("Java", 0)+1);
        System.out.println(map);
        map.put("C++",map.getOrDefault("C++", 0)+1);
        System.out.println(map);


        //ContainsKey() Operation----------------------
        System.out.println("containsKey() Operation--------------");
        System.out.println("Java is Present: "+map.containsKey("Java"));
        System.out.println("C is Present: "+map.containsKey("C"));

        //containsValue() Operation--------------------
        System.out.println("containsValue() Operation--------------");
        System.out.println("Value Of 2 present: "+map.containsValue(2));
        System.out.println("Value Of 20 present: "+map.containsValue(20));


        //remove() Operation--------------------
        System.out.println("remove() Operation------------------");
        map.remove("C++");
        System.out.println(map);

        //size() Operation--------------------
        System.out.println("size() Operation-------------------");
        System.out.println("Size: "+map.size());

        //isEmpty() Operation------------------
        System.out.println("isEmpty() Operation------------------");
        System.out.println("HashMap is Empty: "+map.isEmpty());

        //Iteration using entrySet()-----------
        System.out.println("Iteration Using entrySet() Operation---------");
        for(Map.Entry<String,Integer> e: map.entrySet()){
            System.out.println(e.getKey()+" -> "+e.getValue());
        }

        //Iteration Using keySet()------------
        System.out.println("Iteration Using keySet()Operation---------");
        for(String k: map.keySet()){
            System.out.println(k+" -> "+map.get(k));
        }

        //Iteration Using values()----------------
        System.out.println("Iteration Using values() Operation----------");
        for(Integer val: map.values()){
            System.out.println(val);
        }

        //putIfAbsent() Operation-------------
        System.out.println("putIfAbsent() Operation--------------");
        map.putIfAbsent("Spring", 4); //Not put because Spring already present in Map
        System.out.println(map);
        map.putIfAbsent("C", 9); //Put because C is not present in Map
        System.out.println(map);

        //replace() Operation---------------------
        System.out.println("replace() Operation---------------");
        map.replace("Spring", 5); //Change Old value with 5 because Spring present in Map
        System.out.println(map);
        map.replace("C++", 9); //Not change because C++ not present in Map
        System.out.println(map);

        
        //clear() Operation(remove all entries)---------------
        System.out.println("clear() Operation--------------------");
        map.clear();
        System.out.println(map);
    }
}
