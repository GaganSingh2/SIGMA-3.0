package Hashing.HashMap;

import java.util.*;
public class LinkedHashMapOperation {
    
    public static void main(String[] args) {
        Map<Integer,String> lhm = new LinkedHashMap<>();

        //Put Operation
        lhm.put(1, "Core Java");
        lhm.put(2, "Spring");
        lhm.put(3, "Hibernate");
        lhm.put(4, "Servlet");
        System.out.println(lhm);
    }
}
