import java.util.*;

public class QusOfOOPS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Q1) Print the sum, diffrence and product of two complex numbers by creating a classs named 'Complex' with separate method for each operation whose real and imaginary parts are entered by user.
        Complex c = new Complex(4, 5);
        Complex d = new Complex(9, 4);

        Complex e = Complex.add(c, d);
        Complex f = Complex.diff(c, d);
        Complex g = Complex.prod(c, d);
        e.printComplex();
        f.printComplex();
        g.printComplex();
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
    public static Complex add(Complex a, Complex b){
        return new Complex((a.real + b.real), (a.imag + b.imag));
    }
    public static Complex diff(Complex a, Complex b){
        return new Complex((a.real-b.real), (a.imag-b.imag));
    }
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