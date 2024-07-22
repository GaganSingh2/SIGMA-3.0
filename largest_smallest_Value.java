import java.util.Scanner;

public class largest_smallest_Value {


    public static int getGreatestVal(int number[]){
        int greatest = Integer.MIN_VALUE; //yaha humne apne variable ko initialize kiya hai usme sabse chota integer value store kara ke taki o dusre value ko compare kare aur agr humra purana value chota ho naye value se to replace kare
        for(int i=0; i<number.length; i++){
            if (greatest < number[i]) {
                greatest = number[i];
            }

        }
        return greatest;
    }


    public static int getSmallestVal(int number[]){
        int smallest = Integer.MAX_VALUE; //yaha humne apne variable ko initialize kiya hai usme sabse bada integer value store kara ke taki o dusre value ko compare kare aur agr humra purana value bada ho naye value se to replace kare
        for(int i=0; i<number.length; i++){
            if (smallest > number[i]) {
                smallest = number[i];
            }
        }
        return smallest;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Find the largest value in given array
        // System.out.println("Enter the length of Array: ");
        // int len = sc.nextInt();

        // int number[] = new int[len];
        // System.out.println("Enter the value in Array: ");
        // for(int i=0; i<len; i++){
        //     number[i] = sc.nextInt();
        // }
        // int value = getGreatestVal(number);
        // System.out.println("Greatest value is "+value);


        //Find the Smallest value in given array
        System.out.println("Enter the length of Array: ");
        int len = sc.nextInt();

        int number[] = new int[len];
        System.out.println("Enter the value in Array: ");
        for(int i=0; i<len; i++){
            number[i] = sc.nextInt();
        }
        int value = getSmallestVal(number);
        System.out.println("Smallest value is "+value);
    }
}
