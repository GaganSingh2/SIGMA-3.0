import java.util.* ;
import java.io.*; 
public class challenge_prob_7{ 

    public static int concatLargestDigit(int a, int b, int c)
    {
        //    Write your code here.
        String sa = Integer.toString(a);
        String sb = Integer.toString(b);
        String sc = Integer.toString(c);
        
        //for a
        a = (a>9)?Integer.MIN_VALUE:a;
        for(int i=0; i < sa.length(); i++){
            a = Math.max(a, Integer.parseInt(String.valueOf(sa.charAt(i))));
        }

        //for b
        b = (b>9)?Integer.MIN_VALUE:a;
        for(int j=0; j < sb.length(); j++){
            b = Math.max(b, Integer.parseInt(String.valueOf(sb.charAt(j))));
        }

        //for c
        c = (c>9)?Integer.MIN_VALUE:a;
        for(int k=0; k < sc.length(); k++){
            c = Math.max(c, Integer.parseInt(String.valueOf(sc.charAt(k))));
        }

        //add
        a *= 100;
        b *= 10;
        a = a+b+c;
        return a;
        
    }



    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        //Q1) take the input three intergers and find the greatest in each number and then add the three greatest numbr in one variable
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int res = concatLargestDigit(a, b, c);
        System.out.println(res);
    }
}