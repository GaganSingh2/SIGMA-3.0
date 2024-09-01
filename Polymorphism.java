public class Polymorphism {
    public static void main(String[] args) {
        //--------METHOD OVERLOADING--------
        Calculator calc = new Calculator();
        System.out.println("Sum: "+calc.sum(4, 5));
        System.out.println("Sum: "+calc.sum((float)4.5, (float)5.5));
        System.out.println("Sum: "+calc.sum(4, 5, 10));

        //------METHOD OVERRIDING------
        Deer d = new Deer();
        d.eat();
        Cat c = new Cat();
        c.eat();
    }
}

//--Method Overloading:-Multiple function with the same name but differnce parameter
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

//---Method Overriding:-Parent and child class both contain the samme function with a diff. definition.
class Animal{
    void eat(){
        System.out.println("Eats Everything.");
    }
}
class Deer extends Animal{
    void eat(){
        System.out.println("Eat grass.");
    }
}
class Cat extends Deer{
    void eat(){
        System.out.println("Eats Chicken.");
    }
}
