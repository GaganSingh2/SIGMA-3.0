import java.util.Scanner;

public class CodingNinza {
    public static int square(int num){
        int squ = 0;
        num = Math.abs(num);
        for(int i=0; i<num; i++){
            squ += num;
        }
        return squ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Q1)Given an integer ‘N’, you are supposed to return the square of the given integer without using multiplication (*), division (/) or power function (pow()).
        System.out.println("Enter the Number: ");
        int num = sc.nextInt();
        
        int res = square(num);
        System.out.println("Sqaure of "+num+" is: "+res);
    }
}
