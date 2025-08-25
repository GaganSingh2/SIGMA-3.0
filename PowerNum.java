import java.util.Scanner;
public class PowerNum {

    //For Find the value is Power of 2 or not
    static boolean isPowerOfTwo(int n){
        if(n==1) return true;
        if(n<1) return false;
        //Using Bit-Manipulation----------
        // if((n & (n-1))==0){
        //     return true;
        // }
        // return false;

        //Using Loop
        long temp = 1;
        while(temp<n){
            temp *= 2;
            if(temp == n){
                return true;
            }
        }
        return false;
    }

    //For Find the value is Power of 3 or not
    static boolean isPowerOfThree(int n){
        if(n==1) return true;
        if(n<1) return false;
        long temp = 1;
        while (temp<n) {
            temp *= 3;
            if(temp == n){
                return true;
            }
        }
        return false;
    }

    //For Find the value is Power of 4 or not
    static boolean isPowerOfFour(int n){
        if(n==1) return true;
        if(n<1) return false;
        //Using Bit-Manipulation-----
        // if((n & (n-2))==0 && (n%3==1)){
        //     return true;
        // }
        // return false;

        //Using Loop----------
        long temp = 1;
        while (temp<n) {
            temp *= 4;
            if(temp == n){
                return true;
            }
        }
        return false;
    }

    static boolean isPowerOfFive(int n){
        if(n==1) return true;
        if(n<1) return false;
        long temp = 1;
        while (temp<n) {
            temp *= 5;
            if(temp == n){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value: ");
        int val = sc.nextInt();

        System.out.println(val+" is power of 2: "+isPowerOfTwo(val));

        System.out.println(val+" is power of 3: "+isPowerOfThree(val));

        System.out.println(val+" is power of 4: "+isPowerOfFour(val));

        System.out.println(val+" is power of 5: "+isPowerOfFive(val));
    }
}
