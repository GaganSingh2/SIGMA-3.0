package TCSPractice;

import java.util.HashMap;
import java.util.Scanner;

public class ProblemStatment7 {
    public static void main(String[] args) {
        //Q)Find how many sunday come from starting of the month of given day.
        Scanner sc = new Scanner(System.in);
        String day = sc.next();
        int noOfDays = sc.nextInt();

        HashMap<String, Integer> gap = new HashMap<>();
        gap.put("mon", 6);
        gap.put("tue", 5);
        gap.put("wed", 4);
        gap.put("thu", 3);
        gap.put("fri", 2);
        gap.put("sat", 1);
        gap.put("sun", 0);
        
        int totalSunday = 0;
        if (noOfDays - gap.get(day) > 1) {
            totalSunday = 1 + (noOfDays - gap.get(day))/7;
           
        }
        System.out.println(totalSunday);
    }
}
