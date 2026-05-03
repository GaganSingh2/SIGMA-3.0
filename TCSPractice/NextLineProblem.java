package TCSPractice;

import java.util.Scanner;

public class NextLineProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //if we take first input as String and after that any thing then here not occur any problem but,
        String str = sc.nextLine();
        int num = sc.nextInt();
        System.out.println(str+" "+num);

        //if we take int, double, float or long type input before the string input then here one problem will occur to avoid this problem we write one extra line
        int num2 = sc.nextInt();
        sc.nextLine(); //this line
        String str2 = sc.nextLine();
        System.out.println(num2+" "+str2);
    }
}
