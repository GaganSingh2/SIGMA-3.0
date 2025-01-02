import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        System.out.println("-----INPUT IN JAVA WITH USER-----");
        Scanner sc = new Scanner(System.in);
        
        // System.out.print("Enter the number: ");
        // int num = sc.nextInt();
        // System.out.println("Your number is "+num);

        // System.out.print("Enter your name: ");
        // String name = sc.nextLine();
        // System.out.println("Your name is "+name);

        System.out.println("Enter your choice: ");
        boolean bool=false;
        int num = sc.nextInt();
        if (num==1) {
            bool = true;
        }
        
        System.out.println("Your choice is "+bool);

        System.out.println("Enter the len: ");
        int len = sc.nextInt();
        
        int arr[] = new int[len];

        System.out.println("Enter the value: ");
        for(int i=0; i<len; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array: ");
        for(int i=0; i<len; i++){
            System.out.print(arr[i]+" ");
        }

        //time complexity:
        //SPace COmplexity:
    }
}
