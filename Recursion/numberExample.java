package Recursion;

public class numberExample {
    
    public static void main(String[] args) {
        print1(1);
    }

    static void print1(int a){
        System.out.println(a);
        print2(2);
    }

    static void print2(int a){
        System.out.println(a);
        print3(3);
    }

    static void print3(int a){
        System.out.println(a);
        print4(4);
    }

    static void print4(int a){
        System.out.println(a);
        print5(5);
    }
    static void print5(int a){
        System.out.println(a);
        
    }
}
