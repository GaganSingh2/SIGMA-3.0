public class type_conversion {
    public static void main(String[] args) {
        // -----TYPE CONVERSION-----
        /*its happen when:-
           a) type compatible(small to large size)
           b) destination type > source type

           Order of Type Conversion
           byte->short->int->float->long->double
           it is also called Implicit conversion and Widening conversion
        */
        int a = 14;
        long b = a;
        System.out.println(b+"long can be contain the intege type value because size of long data type is more than int");
        // long c = 14;
        // int d = c;
        System.out.println("Give the error! because int can not be contain the long type value because size of int data type is less than for long");


    }
}
