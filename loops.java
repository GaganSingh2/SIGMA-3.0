import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //---------WHILE LOOPS--------

        // int counter = 1;
        // while (counter<=10) {
        //     System.out.println("Jai Shree Ram");
        //     counter++;
        // }
        // System.out.println("Loop is over.");

        //Q) Print the number ffrom 1 to 10 using while loop

        // int num = 1;
        // while (num<=10) {
        //     System.out.println(num);
        //     num++;
            
        // }

        //Q)Print the number from 1 to n using while loop
        
        // System.out.println("Enter your range: ");
        // int range = sc.nextInt();

        // int counter=1;
        // while (counter<=range) {
        //     System.out.println(counter+ " ");
        //     counter++;
        // }

        //Q)Print sum of first n natural numbers using while loop

        // System.out.println("Enter your range: ");
        // int range = sc.nextInt();
        // int sum = 0;
        // int counter = 1;

        // while (counter<=range) {
        //     sum = sum + counter;
        //     counter++;
        // }
        // System.out.println(sum);


        //--------FOR LOOP-------

        //  for(int counter=1; counter<=10; counter++){
        //     System.out.println("Radhe Radhe");
        //  }
        //  System.out.println("Your loop is over");

         //Q)Print a square pattern using  for loop
        //  for(int line=1; line<=4; line++)
        //  {
        //     System.out.println("* * * *");
         //}


         //Q) print the reverse of the given number
        //  System.out.println("Enter the number: ");
        //  int num = sc.nextInt();

        //  while (num>0) {
        //     int lastdigit = num % 10; //agr hume apne given number me se last digit find karna hot to hum (%)modulo ka use karte hai
        //     System.out.println(lastdigit+ " ");
        //     num = num / 10; // aur agr last digit remove karna ho to to divide ka use karte hai 
        //}
        
        //Q)REverse the given number
        // System.out.print("Enter your number: ");
        // int num = sc.nextInt();
        // int rev = 0;

        // while (num>0) {
        //     int lastdigit = num % 10;
        //     rev = (rev*10)+lastdigit;
        //     num = num/10;
            
        // }
        // System.out.print("Reverse of given number is: "+rev);

        //---------DO-WHILE LOOP------

        System.out.println("Enter your times: ");
        int times = sc.nextInt();
        int counter = 1;

        do {
            System.out.println("Har Har mahadev");
            counter++;
        } while (counter<=times);
        System.out.println("Your loop is out");
    }
}
