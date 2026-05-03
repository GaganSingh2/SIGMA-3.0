package TCSPractice;

import java.util.ArrayList;
import java.util.Scanner;

public class BracketInput {
    public static void main(String[] args) {
        // [1,2,3,4,5] or {1,2,3,4,5}
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        if((input.startsWith("[") && input.endsWith("]")) || (input.startsWith("{") && input.endsWith("}"))){
            input = input.substring(1,input.length()-1);
        }

        String[] str = input.split(",");
        ArrayList<Integer> arr = new ArrayList<>();

        for(String token: str){
            int num = Integer.parseInt(token);
            arr.add(num);
        }
        for(int i: arr){
            System.out.print(i+" ");
        }
    }
}
