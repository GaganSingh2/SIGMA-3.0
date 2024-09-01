public class Polymorphism {
    public static void main(String[] args) {
        //--------METHOD OVERLOADING--------
        Calculator calc = new Calculator();
        System.out.println("Sum: "+calc.sum(4, 5));
        System.out.println("Sum: "+calc.sum((float)4.5, (float)5.5));
        System.out.println("Sum: "+calc.sum(4, 5, 10));
    }
}

class Calculator{
    int sum(int a, int b){
        return a+b;
    } 
    float sum(float a, float b){
        return a+b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }
}
