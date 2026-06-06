package Test;

public class Test1 {
    static int cnt;
    Test1(){
        System.out.println("Counter: "+cnt);
        cnt++;
    }

    public static void main(String[] args) {
        Test1 t1 = new Test1();
        Test1 t2 = new Test1();
        Test1 t3 = new Test1();
    }
}
