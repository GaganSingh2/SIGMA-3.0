import java.util.HashSet;

public class Test9 {
    public static boolean isUnique(String s){
        HashSet<Character> hs = new HashSet<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(hs.contains(ch)){
                return false;
            }
            else{
                hs.add(ch);
            }
        }
        return true;
    }

    public static boolean isPrime(int val){
        // int cnt = 1;
        for(int i=2; i<=Math.sqrt(val); i++){
            if(val % i==0){
                return false;
            }
        }
        return true;
    }
    public static void printAllPrime(int n){
        int val = 0, place = 1;
        while (n>0) {
            int tmp = n;
            int dig = n % 10;
            if (isPrime(dig) && dig!=1) {
                System.out.println("Prime: "+dig);
            }
            while (tmp>0) {
                int di = tmp % 10;
                // val = 
            }
            
            n /= 10;
        }
    }
    // 12343
    public static void main(String[] args) {
        //Longest Unique substring
        String str = "Scanner";
        String longs = "";
        
        // for(int i=0; i<=str.length()-1; i++){
        //     for(int j=i; j<=str.length(); j++){
        //         String sub = str.substring(i,j);
        //         boolean res = isUnique(sub);
        //         if (res) {
                    
        //             if(sub.length()>longs.length()){
        //                 longs = "";
        //                 longs = sub;
        //             }
        //         }
        //     }
        // }
        // System.out.println(longs);

        printAllPrime(15432);
    }
}
