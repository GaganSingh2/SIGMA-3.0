package Hashing.HashMap;

import java.util.*;

public class FindItinararyForTicket {
    
    public static void findItinararyForTicket(List<List<String>> tickets){
        //Create a 1st HashMap from with to
        HashMap<String, String> fromTo = new HashMap<>();
        for(int i=0; i<tickets.size(); i++){
            String from = tickets.get(i).get(0);
            String to = tickets.get(i).get(1);
            fromTo.put(from, to);
        }

        //Create a 2nd HashMap to with from
        HashMap<String, String> toFrom = new HashMap<>();
        for(String key: fromTo.keySet()){
            toFrom.put(fromTo.get(key), key);
        }

        //FInd the Starting Point
        String startPoint = "";
        for(String key: fromTo.keySet()){
            //if 2nd HashMap don't contain the key of the 1st HashMap key
            if(!toFrom.containsKey(key)){
                startPoint = key;
                break;
            }
        }

        //Traverse on 1st HashMap
        System.out.print(startPoint);
        for(String key: fromTo.keySet()){
            System.out.print(" -> "+fromTo.get(startPoint));
            //reassign the startPoint each time with value of the startPoint(key)
            startPoint = fromTo.get(startPoint);
        }System.out.println();

    }
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows: ");
        int rows = sc.nextInt();
        sc.nextLine(); //consume leftover newline
        List<List<String>> tickets = new ArrayList<>();
        System.out.println("Enter the Ticket (From -> TO): ");
        for(int i=0; i<rows; i++){
            List<String> innerList = new ArrayList<>();
            for(int j=0; j<=1; j++){
                innerList.add(sc.nextLine());
            }
            tickets.add(innerList);
        }

        System.out.println("Ticket: ");
        System.out.println(tickets);

        findItinararyForTicket(tickets);
        
    }
}
