import java.util.Scanner;

public class QusOfRecursion {
    public static void printDec(int num){
        if (num==1) {
            System.out.print(num);
            return;
        }
        System.out.print(num+" ");
        printDec(num-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Q1) Print numbers from n to 1 (Decreasing order).
        System.out.println("Enter Max value: ");
        int num = sc.nextInt();
        printDec(num);
    }
}
