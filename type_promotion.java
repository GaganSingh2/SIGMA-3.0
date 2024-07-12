public class type_promotion {
    public static void main(String[] args) {
        // Rule of Type promotion
        // a)Java automatically promotes each byte, short, char operand to int 
        char ch = 'a';
        char ch1 = 'b';
        System.out.println((int)ch);
        System.out.println((int)ch1);
        System.out.println(ch1-ch);

        //b)if one operand is long, float or double the whole expression is promote to long, float and double respectively(jiska jada size hoga usme promote  hoga)
        int a = 15;
        float b = 15.56f;
        long c = 124;
        double d = 123.45;
        double ans = a + b + c + d;
        System.out.println("Your ans is "+ans);
    }
}
