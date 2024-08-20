import java.util.Arrays;
import java.util.Scanner;

public class array_basic {
    public static void main(String[] args) {
        
        /*Syntax of Array:-
            dataType arrayName[] = new dataType[size]; 
        */
        
        //Creating of Array
        //int marks[] = new int[50];  //agr humne apne array ko define karke kuch v store nhi kiya hai to o by default sab me 0 store karega
       
        //int number[] = {1,2,3,4,5};

        //String fruits[] = {"Apple","Mango","Orange","Lichi"};


        //Input in Array
        int marks[] = new int[50];

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the marks of Physics: ");
        marks[0] = sc.nextInt();
        System.out.println("Enter the marks of Chemistry: ");
        marks[1] = sc.nextInt(); 
        System.out.println("Enter the marks of Maths: ");
        marks[2] = sc.nextInt();
        
        //Output the value in array
        System.out.println("Marks of Physics: "+marks[0]);
        System.out.println("Marks of Chemistry: "+marks[1]);
        System.out.println("Marks of Maths: "+marks[2]);

        //Update in pre-define array
        //marks[2] = 100;
        marks[2] += 2;
        System.out.println("Marks of Maths: "+marks[2]);


        //length of array
        System.out.println("Length of Array is "+marks.length);

        //Scanner sc = new Scanner(System.in);
        
        // input from the user in define array
        System.out.println("Entr the length of array: ");
        int len = sc.nextInt();
        int abs[] = new int[len];
        System.out.println("Enter the value in array: ");
        for(int i=0; i<len; i++){
            abs[i] = sc.nextInt();
        }
        System.out.println("Print the value in array");
        for(int i=0; i<len; i++){
            System.out.println(abs[i]);
        }
        int abc[] = new int[5];
        //int abcd = Arrays.fill(abc, 1);
    }
}
