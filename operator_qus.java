public class operator_qus {
    public static void main(String[] args) {
        
        //-----OPERATOR QUESTION------
        // Q1) whatt will be the output of the following program
        //a)
        int x = 2, y = 5;
        int exp1 = (x * y / x);
        int exp2 = (x * (y / x));

        System.out.println("Value of Exp1 is "+exp1);
        System.out.println("Value of Exp2 is "+exp2);

        //b)
        int a = 200, b = 50, c = 100;
        if (a>b && b>c) {
            System.out.println("Hello");
        }
        if (c>b && c<a) {
            System.out.println("Java");
        }
        if ((b+200)<a && (b+150)<c) {
            System.out.println("Hello Java");
        }

        //c)
        int m,n,p;
        m=n=p=2;
        m += n;
        n -= p;
        p /= (m + n);
        System.out.println(m+" " +n+" "+p); 

        //d) 
        int q = 9, r = 12;
        int s = 2, t = 4, u = 6;

        int exp = 4/3*(q+34)+9*(s+t*u)+(3+r*(2+s))/(s+t*r);
        System.out.println("your value is "+exp);

        //e)
        int w=10, v=5;
        int exp3 = (v*(w/v+w/v));
        int exp4 = (v*w/v+v*w/v);

        System.out.println("value is "+exp3);
        System.out.println("value is "+exp4);
 
    }
}
