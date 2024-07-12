public class unary_operator {
    public static void main(String[] args) {
        //UNARY OPERATOR
        /*a)Increment:- PreIncrement(++a) PostIncerement(a++)
         PreIncrement:- first value change and then use
         PostIncrement:- first value can be use and then change
         * b)Decrement:- PreDecrement(--a) PostDecrement(a--)
             PreDecrement:- first value change and then use
             PostDecrement:- first value can be use and then change
         */
        int a = 5;
        int b = ++a;//(PreIncrement)
        System.out.println(a);
        System.out.println(b);

        int c = 5;
        int d = c++;//(PostIncrement)
        System.out.println(c);
        System.out.println(d);

        int e = 5;
        int f = --e;//(PreDecrement)
        System.out.println(e);
        System.out.println(f);
        
        int g = 5;
        int h = g--;//(PostDecrement)
        System.out.println(g);
        System.out.println(h);
    }
}
