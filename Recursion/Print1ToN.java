package Recursion;

public class Print1ToN {
    public static void main(String[] args) {
        // Print 1,2,3,4,5,...........
        print(1);
    }

    static void print(int n){
        if(n==5){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        print(n+1);
    }
}
