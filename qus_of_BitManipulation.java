import java.util.Scanner;

public class qus_of_BitManipulation {

    public static void evenOrOdd(int n){
        int bitMask = 1;
        if ((n & bitMask)==0) {
            System.out.println(n+" is Even Number.");
        }
        else{
            System.out.println(n+" is Odd Number.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Q1)Find tthe given number is Even or Odd.
        System.out.println("Enter the value of N: "); 
        int n = sc.nextInt();
        evenOrOdd(n);
    }
}
