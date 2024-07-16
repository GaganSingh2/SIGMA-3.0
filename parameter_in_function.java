import java.util.Scanner;

public class parameter_in_function {

    /*Syntax of Parameter:
     *    returnType name(parameters with data type){
     *               //body
     *               return statement;           
     *    }
     * parameter work as a input in function.
     * hum parameter pass karte hai unke name aur unke data type ke sath 
     * aur hum jab apne function ko call karke usme argument pass karte hai to hum jo value pass karte hai o humare parameter ke datatype ke jaisa hi hota hai
     */

     //------1st way to print the calculate of sum-----
    
    // public static void calculateSum(int num1, int num2){
        
    //     int sum = num1 + num2;

    //     System.out.println("Sum is "+sum);
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter 1st number: ");
    //     int a = sc.nextInt();
    //     System.out.println("Enter 2nd number: ");
    //     int b = sc.nextInt();
    //     calculateSum(a,b);
    // }


    //------2nd Way to print the calculate of sum------
    public static int calculateSum(int num1, int num2){ //num1,num2 is a Parameters and formal parameters
        int sum = num1 + num2;
        return sum;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int b = sc.nextInt();
        
        int sum = calculateSum(a, b);  //a,b is a arguments or actual parameters
        System.out.println("Sum is "+sum);
    }
}
