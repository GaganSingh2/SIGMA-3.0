import java.util.Scanner;
public class conditional_statement {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        //--------IF-ELSE STATEMENT-------
        
        // System.out.print("Enter your Age: ");
        // int age = sc.nextInt();

        // if (age >= 18) {
        //     System.out.println("You are a adult person");
        // }
        // else{
        //     System.out.println("You are not a adult person");
        // }

        //Q) Find the given number is odd or even
        // System.out.println("Enter your number: ");
        // int num = sc.nextInt();

        // if (num%2==0) {
        //     System.out.println(num+" is Even.");
        // }
        // else{
        //     System.out.println(num+" is Odd.");
        // }

        //-----------ELSE-IF STATEMENT-------

        // System.out.println("Enter your Age: ");
        // int age = sc.nextInt();

        // if (age>=18) {
        //     System.out.println("You are a adult");
        // }
        // else if (age>=13 && age<18) {
        //     System.out.println("You are a teeneger");
        // }
        // else{
        //     System.out.println("You are a child");
        // }

        //Q) Find the income tax of various incomes i.e. 
        /*income < 5L tax is 0%
         * income between 5-10L tax is 20%
         * income > 10L tax is 30%
        */

        //  System.out.println("ENter your income: ");
        //  int income = sc.nextInt();
        //  int tax;

        //  if (income < 500000) {
        //     tax = 0;
        //  }
        //  else if (income >= 500000 && income < 1000000) {
        //     tax = (int)((1000000-500000) * 0.2);
        //  }
        //  else{
        //     tax = (int)((1000000-500000) * 0.2 + (income-1000000) * 0.3);
        //  }
        //  System.out.println("Your tax is "+tax);

        //Q) find the largest number in 3 given numbers

        // System.out.print("Enter your the value of first number: ");
        // int first = sc.nextInt();

        // System.out.print("Enter your the value of second number: ");
        // int second = sc.nextInt();

        // System.out.print("Enter your the value of third number: ");
        // int third = sc.nextInt();

        // if (first>second && first>third) {
        //     System.out.println("First number is largest number");
        // }
        // else if (second>first && second>third) {
        //     System.out.println("Second number is largest number");
        // }
        // else{
        //     System.out.println("THird number is largest number");
        // }


        //----------TERNARY OPERATOR--------

        //Syntax:- variable = condition? statement1(execute if true): statement2(execute if false);

        // System.out.println("Enter your number: ");
        // int num = sc.nextInt();

        // String type = ((num%2)==0)? "Even":"Odd";
        // System.out.println("Your number is "+type);

        //---------SWITCH STATEMENT------
        
        System.out.print("Enter the number of day: ");
        int num = sc.nextInt();

        switch (num) {
            case 1:
                System.out.println("Today is Monday");
                break;
            case 2:
                System.out.println("Today is Tuesday");
                break;
            case 3:
                System.out.println("Today is Wednesday");
                break;
            case 4:
                System.out.println("Today is Thursday");
                break;
            case 5:
                System.out.println("Today is Friday");
                break;
            case 6:
                System.out.println("Today is Saturday");
                break;
            case 7:
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }
}

//
