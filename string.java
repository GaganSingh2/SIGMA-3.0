import java.util.Scanner;

public class string {
    public static void printLatters(String str){
        //Yaha hum apne pure word ko loop aur .chatAt() function ke help se print karayenge
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //---------STRING----------
        
        char arr[] = {'a','b','c','d'};
        System.out.print("CHarcter is: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ,");
        }
        System.out.println();
        //Hum string ko 2way se store kara sakte hai 
        //1st Way
        String str = "abcd";
        System.out.println("String is: "+str);

        //2nd Way
        String str2 = new String("abcd");
        System.out.println("String is: "+str2);
          
        //Strings are IMMUTABLE

        //.length()Function: iska use hum length count karne ke liye karate hai
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Name: "+name);
        System.out.println("Length of name is: "+name.length()); //hum isme length() function ke help se string ka length find karte hai

        //Concatenation
        System.out.print("ENter First Name: ");
        String firstName = sc.nextLine();
        System.out.print("Enter the Last Name: "); 
        String lastName = sc.nextLine();
        String fullName = firstName+" "+lastName;
        System.out.println("Full Name: "+fullName);

        //.charAt() function:- iska use hum index pe present letter ko print karane ke liye karte hai
        System.out.println("Letter is: "+fullName.charAt(0));

        printLatters(fullName);
    }
}