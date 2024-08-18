import java.util.Scanner;

public class string {
    public static void printLatters(String str){
        //Yaha hum apne pure word ko loop aur .chatAt() function ke help se print karayenge
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }


    public static String printSubString(String str, int si, int ei){
        String subString = "";
        for(int i=si; i<ei; i++){
            subString += str.charAt(i);
        }
        return subString;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //---------STRING----------
        
        // char arr[] = {'a','b','c','d'};
        // System.out.print("CHarcter is: ");
        // for(int i=0; i<arr.length; i++){
        //     System.out.print(arr[i]+" ,");
        // }
        // System.out.println();

        //Hum string ko 2way se store kara sakte hai 
        //1st Way
        // String str = "abcd";
        // System.out.println("String is: "+str);

        //2nd Way
        // String str2 = new String("abcd");
        // System.out.println("String is: "+str2);
          
        //Strings are IMMUTABLE

        //.length()Function: iska use hum length count karne ke liye karate hai
        // System.out.print("Enter your name: ");
        // String name = sc.nextLine();
        // System.out.println("Name: "+name);
        // System.out.println("Length of name is: "+name.length()); //hum isme length() function ke help se string ka length find karte hai

        //Concatenation
        // System.out.print("ENter First Name: ");
        // String firstName = sc.nextLine();
        // System.out.print("Enter the Last Name: "); 
        // String lastName = sc.nextLine();
        // String fullName = firstName+" "+lastName;
        // System.out.println("Full Name: "+fullName);

        //.charAt() function:- iska use hum index pe present letter ko print karane ke liye karte hai
        //System.out.println("Letter is: "+fullName.charAt(0));

        //printLatters(fullName); //yaha hum apne fuction ke help se pure name ke letters print kara rahe hai
        
        //Equality check:- String name1.equals(String name2) ke help se hum String ke andar present word ko comparre karte hai ki ye equal hai ya nahi
        // String s1 = "Gogo";
        // String s2 = "Gogo";
        // String s3 = new String("Gogo");
        // if (s1==s2) {
        //     System.out.println("Strings are equals"); //yaha pe ye wali line iss liye print ho rhi hai kyuki java me Interning naam ka ak function hoota hai jab hum ak gogo naam ak string banaye and then ak aur gogo naam ka string banaye to usne pichle string ko hi indicate kiya 
        // }
        // else{
        //     System.out.println("Strings are not equals");
        // }
        // if (s1==s3) {//yaha pe false iss liye aa rha hai kyuki yaha new keyword ke help se ak naya space create kiya hai 
        //     System.out.println("Strings are equals");
        // }
        // else{
        //     System.out.println("Strings are not equals");
        // }

        // string name1.equals(String name2):
        //if (s1.equals(s3)) { //yaha iss function ke help se hum dono string me present word ko compare karta hai
        //     System.out.println("String are equals");
        // }
        // else{
        //     System.out.println("Strings are not equals");
        // }


        //Substring: isse banane ke liye hum ak stating index aur ak ending index dete hai jaha ending index print nahi hota hai usse ak kam tak hota hai
        // System.out.println("Enter the String: ");
        // String str = sc.nextLine();
        // System.out.println("Enter the Starting index: ");
        // int si = sc.nextInt();
        // System.out.println("Enter the Last index: ");
        // int ei = sc.nextInt();

        // String res = printSubString(str, si, ei);
        // System.out.println("SubString is: "+res);

        //System.out.println("Sub String is: "+str.substring(0,7));//substring nikalne ka easy way

        
        //compareTo:-iska use hum apne string me ak ak letter ko compare kareke largest string find karte hai
        //compareTo function capital A aur small a ko alag alag manata hai isliye iss chij ko khtm karne ke liye hum compareToIgnoreCase use karte hai
        // String fruit[] = {"apple","mango","banana"};
        // String largest = fruit[0];
        // for(int i=1; i<fruit.length; i++){
        //     if (largest.compareTo(fruit[i])<0) { 
        //         largest = fruit[i];
        //     }
        // }
        // System.out.println("Largest String is: "+largest);

        //String Builder: StringBuilder is a class in Java that represents a mutable sequence of characters.: You can change the contents of a StringBuilder object without creating a new object.
        StringBuilder sb = new StringBuilder("");
        for(char ch='a'; ch<='z'; ch++){
            sb.append(ch);
        } 
        System.out.println(sb);
        System.out.println(sb.length());
        //Time Complexity = O(26)
    }
}