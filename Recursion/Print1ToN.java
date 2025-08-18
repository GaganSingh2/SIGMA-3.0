package Recursion;

public class Print1ToN {
    public static void main(String[] args) {
        // Print 1,2,3,4,5,...........
        print(5);
    }

    static void print(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
       

        //This is called Tail Recursion Because this is the last Call Function.
        print(n-1);
         System.out.println(n);
    }
}
