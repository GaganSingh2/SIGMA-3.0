public class function_overloading {

    /*Function Overloading:- multiple function with the same name but defferent parameter
     * function overloading hum ak sse jada same name ka function bana skte hai but hum jo unme parameters pass karenege o different hoga sab se chahe o value me different ho ya fir data type alag ho
      
     * Method have the same name but differ in their parametr
     * different parameter list:-
     *      diff. number of parameter
     *      diff. data types of parameter
     *      any combination of the above
     */

    public static int multiply(int a,int b){
        int mul = a*b;
        return mul;
    }
    public static float multiply(float a, int b, float c){
        float mul = a*b*c;
        return mul;
    }
    public static void main(String[] args) {
        float num1 = 5.5f;
        int num2 = 10;
        float num3 = 5.5f;
        float multi = multiply(num1,num2,num3);
        System.out.println("Multiply is "+multi);
    }
}
