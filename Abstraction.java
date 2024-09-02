public class Abstraction {
    public static void main(String[] args) {
        //-----ABSTRACTION:-Hiding the unnecessary details and show the important data.
        //----ABSTRACT CLASS:-Abstract class can be created through abstract keyword. hum abstract class ka object create nhi kr skte hai. any class that contain one or more abstract method with the help of abstract keyword. agr hum apne method ko abstract method banate hai to hume uss method ko subclass ke andar redefine karna hoga.
        
        Horse h = new Horse();
        h.eat();
        h.walk();
        Chicken c = new Chicken();
        c.walk();
    }
}

abstract class Animal{
    void eat(){
        System.out.println("Animal eats."); // Non-abstract method
    }
    abstract void walk();//abstract method(yaha hume only method define karna hota hai usme initialization hum subclass me karenge)
}
class Horse extends Animal{//iss class ke andar hume walk method ko redefine karna hoga warna ye hume error dega
    void walk(){
        System.out.println("Walk on 4 legs");
    }
}
class Chicken extends Animal{
    void walk(){
        System.out.println("Walk on 2 legs.");
    }
}