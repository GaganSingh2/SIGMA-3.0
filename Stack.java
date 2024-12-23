import java.util.Scanner;

public class Stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter the length: ");
        int len = sc.nextInt();
        int arr[] = new int[len];

        System.out.println("Enter Element: ");
        for(int i=0; i<len; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("ArraY: ");
        
    }
}
