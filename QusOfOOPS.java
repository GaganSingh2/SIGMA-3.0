import java.util.*;

public class QusOfOOPS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Q1) Print the sum, diffrence and product of two complex numbers by creating a classs named 'Complex' with separate method for each operation whose real and imaginary parts are entered by user.
        // System.out.println("Real: ");
        // int r = sc.nextInt();
        // System.out.println("Imaginary: ");
        // int i = sc.nextInt();
        // Complex c = new Complex(r, i);

        // System.out.println("Real: ");
        // int re = sc.nextInt();
        // System.out.println("Imaginary: ");
        // int im = sc.nextInt();
        // Complex d = new Complex(re, im);

        // Complex e = Complex.add(c, d);
        // Complex f = Complex.diff(c, d);
        // Complex g = Complex.prod(c, d);
        // e.printComplex();
        // f.printComplex();
        // g.printComplex();


        //Q2)What is the output of the following program?
        // final Ecar car = new ElectricCar();
        // System.out.println(car.drive());

        //Q3)What is the output of the following program?
       new BlueCar();
        

    }
}

//Q1)
class Complex{
    int real; 
    int imag;
    public Complex(int r, int i){
        real = r;
        imag = i;
    }
    //For Add
    public static Complex add(Complex a, Complex b){
        return new Complex((a.real + b.real), (a.imag + b.imag));
    }
    //For Subtraction(Difference)
    public static Complex diff(Complex a, Complex b){
        return new Complex((a.real-b.real), (a.imag-b.imag));
    }
    //For Multiply (Product)
    public static Complex prod(Complex a, Complex b){
        return new Complex(((a.real*b.real)-(a.imag*b.imag)),((a.real*b.imag)+(a.imag*b.real)));
    }
    public void printComplex(){
        if (real==0 && imag!=0) {
            System.out.println(imag+"i");
        }
        else if (imag==0 && real!=0) {
            System.out.println(real);
        }
        else{
            System.out.println(real+"+"+imag+"i");
        }
    }
}

//Q2)
class Automobile{
    private String drive(){
        return "Driving vehicle";
    }
}
class Ecar extends Automobile{
    protected String drive(){
        return "Driving car";
    }
}
class ElectricCar extends Ecar{
    @Override
    public final String drive(){
        return "Driving electric car";
    }
    
}

//Q3)
abstract class Car{
    static {
        System.out.print("1");
        
    }
    public Car(String name){
         super();
         System.out.print("2");
    }    
    {
        System.out.print("3");
    }
}
class BlueCar extends Car{
    {
        System.out.print("4");
    }
    public BlueCar(){
        super("blue");
        System.out.print("5");
    }
    
}