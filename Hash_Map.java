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
        System.out.println("Population is: "+population);

        int population1 = hm.get("Indonesia");
        System.out.println("Population is: "+population1);//give the null value because Indonesia cann't be define in HashMap
    }
}
