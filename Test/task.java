package Test;
class task{
    public static boolean isPrime(int n){
        if (n<2) {
            return false;
        }
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
  
    public static void solve(int val){
        while (val>0) {
            // int d = val % 10;
            // if (isPrime(d)) {
                 int tmp = val;
                 int num = 0;
                while (tmp>0) {
                    int digit = tmp % 10;
                    num = num * 10 + digit;
                    if(isPrime(num)){
                        System.out.println(num);
                    }
                    tmp /= 10;
                }
            // }
           
            val /= 10;
        }
    }
    public static void main(String[] args) {
        int v = 351679;
        solve(v);
    }
}