public class mathclass {
    public static void main(String[] args) {
        // Q4)READ AND CODE EXERCISE
        /*
         * Search about(google) and use the following method of the math class in java:
         * Math.min()
         * Math.max()
         * Math.sqrt()
         * Math.pow()
         * Math.avg()
         * Math.abs()
         */

        // Math.abs():-The absolute value represent the non-negative version of
        // integer(its contain only positive,its convert negative to positive)
        int a = 78;
        int b = -48;
        System.out.println("Absolute value of a is " + Math.abs(a));
        System.out.println("Absolute value of b is " + Math.abs(b));

        // Math.max():-its return the maximum value from the given two argument
        int c = 78;
        int d = 50;
        System.out.println("Maximum value is " + Math.max(c, d));

        // Math.min():- its return the minimum value from the given two argument
        int e = 23;
        int f = 22;
        System.out.println("MInimum value is " + Math.min(e, f));

        // Math.sqrt():-its contain the square root of the given number
        double g = 81.0;
        System.out.println("Square root is " + Math.sqrt(g));

        // Math.pow():-its return the value of the first value raiser to the power to
        // second value
        double h = 2;
        double i = 4;
        System.out.println("Valuee is " + Math.pow(h, i));

        // Math.avg():-its return the average of the given two argument

        // Math.ceil():-ye smallest integer ko contain karta hai jo humare given value
        // se bada hota hai. 3.2->4.0 dega
        double j = 31.1;
        System.out.println("Ceil value is " + Math.ceil(j));

        // Math.floor():- ye largest integer ko contain karta hai jo humare given value
        // se chota hota hai. 3.7->3.0
        double k = 18.2344;
        System.out.println("Floor value is " + Math.floor(k));

        // Math.signum():- its return the sign of given value if value is positive then
        // return 1 otherwise -1.
        double l = 34.43;
        System.out.println("Sign is " + Math.signum(l));

        // Math.cbrt():- its return the cube root of a number
        double m = 8;
        System.out.println("number is " + Math.cbrt(m));

        // Math.round():- it is used to return the decimal numbers to the nearest
        // value.ex=> 5.4->5 and 5.6->6
        double n = 5.9;
        System.out.println("Value is " + Math.round(n));

    }
}
