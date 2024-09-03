public class Abstraction {
    public static void main(String[] args) {
        //-----ABSTRACTION:-Hiding the unnecessary details and show the important data.
        //----ABSTRACT CLASS:-Abstract class can be created through abstract keyword. hum abstract class ka object create nhi kr skte hai. any class that contain one or more abstract method with the help of abstract keyword. agr hum apne method ko abstract method banate hai to hume uss method ko subclass ke andar redefine karna hoga.
        
        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);
        
        Chicken c = new Chicken();
        c.walk();
        
        Mustang myHorse = new Mustang();
        //Constructor called:- Animal->Horse->Mustang

        //Animal a = new Animal();//yaha error show hoga kyuki hum Animal ka object create nhi kar skte hai kyuki ye ak abstract class hai
    }
}

abstract class Animal{
    String color;
    Animal(){ //hum apne abstract class ke andar constructor bana skte hai 
        System.out.println("Animal constructor called");
    }
    void eat(){
        System.out.println("Animal eats."); // Non-abstract method
    }
    abstract void walk();//abstract method(yaha hume only method define karna hota hai usme initialization hum subclass me karenge)
}
class Horse extends Animal{//iss class ke andar hume walk method ko redefine karna hoga warna ye hume error dega
    Horse(){
        System.out.println("Horse constructor called");
    }
    void changecolor(){//iss method ko jab hum call karenge tab sabse pahle humare parent class ka constructor create hoga.
        color = "White";
    }
    void walk(){
        System.out.println("Walk on 4 legs");
    }
}
class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor called");
    }
}
class Chicken extends Animal{
    void changecolor(){
        color = "Yellow";
    }
    void walk(){
        System.out.println("Walk on 2 legs.");
    }
}