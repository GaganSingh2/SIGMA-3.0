import java.util.*;
public class Hash_Map {
    public static void main(String[] args) {
        //-------HASH MAP-----
        //Create a HashMap
        HashMap<String,Integer> hm = new HashMap<>();

        //Insert the value with key using put function
        hm.put("India", 110);
        hm.put("China", 150);
        hm.put("US", 50);
        hm.put("India", 130);

        System.out.println(hm);

        //Get()function can be used to return the value of depened on key
        int population = hm.get("India");
        System.out.println("Population of India: "+population);

        System.out.println("Population of Indonesia: "+hm.get("Indonesia"));//give the null value because Indonesia cann't be define in HashMap

        //containsKey()Function can be used to check the given key is available in HashMap or not.
        boolean res = hm.containsKey("India");
        System.out.println("India is defined: "+res);
        boolean res2 = hm.containsKey("Indonesia");
        System.out.println("Indonesia is defined:  "+res2);

        //Remove()Function  can be used to remove or delete the key-value pair in HashMap
        System.out.println("Before Remove: "+hm);
        int remove = hm.remove("China");
        System.out.println("Removed Population: "+remove);
        System.out.println("After Remove: "+hm);

        //Size()Function can be used to find the length or size of the key-value in HashMap
        int size = hm.size();
        System.out.println("Size is: "+size);

        //isEmpty()Function can be used to check the HashMap is Empty or not.
        boolean empty = hm.isEmpty();
        System.out.println("Map is Empty: "+empty);

        //clear()function can be used to delete the all key-values in HashMap
        hm.clear();
        boolean empty1 = hm.isEmpty();
        System.out.println("Map is Empty: "+empty1);

        //Iteration on HashMap
        hm.put("India", 110);
        hm.put("China", 150);
        hm.put("US", 50);
        hm.put("Indonesia", 35);
        hm.put("Nepal", 40);
        hm.put("Bhootan", 30);

        
        Set<String> keys = hm.keySet();
        System.out.println("Keys: "+keys);

        for (String k : keys) {
            System.out.println("Key = "+k+" ,Value = "+hm.get(k));
        }

    }
}
