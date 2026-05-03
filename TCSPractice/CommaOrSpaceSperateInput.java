package TCSPractice;
import java.util.ArrayList;
import java.util.Scanner;

public class CommaOrSpaceSperateInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine(); //take input in string

        //convert in string type array by spliting
        // String[] str = input.split(" "); //Space Separate Input
        String[] str = input.split(","); //Comma Separated Input

        //create arraylist in Integer
        ArrayList<Integer> arr = new ArrayList<>();
        //take each string one by one from string array and convert in integer and add in arraylist
        for(String token: str){
            int num = Integer.parseInt(token);
            arr.add(num);
        }

        for(int a: arr){
            System.out.print(a+" ");
        }
    }
}
