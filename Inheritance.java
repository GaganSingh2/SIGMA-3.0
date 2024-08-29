public class Inheritance {
    public static void main(String[] args) {
        /*INHERITANCE:- Inheritance is when properties and method of base class are passed on to a derived class. It is allow you to create a new classes(Derived class) based on existing class(Base class).*/
        Fish shark = new Fish();
        shark.eat();
        shark.breath();
        shark.swim();

        //(2)MultiLevel Inheritance ex ka object hai ye
        Nano neo = new Nano();
        neo.run();
        neo.space();
        neo.wheel();
    }
}

//Structure of Inheritance
//Base class (Parent Class or Super class)
class Animal{
    String color;

    void eat(){
        System.out.println("Eats");
    }
    void breath(){
        System.out.println("Breath");
    }
}

//Derived Class (Child class or Sub class)
class Fish extends Animal{
    void swim(){
        System.out.println("Swim");
    }
}

//Types of Inheritance
//(1)Single Inheritance:- A subclass inherits from only one superclass. example is the same as Inheritance

//(2)Multilevel Inheritance:- A subclass inherits from another subclass, forming a chain of inherits.
//Base CLass
class Car{
    String color;

    void run(){
        System.out.println("Fast");
    }
    void space(){
        System.out.println("Big");
    }
}
//Subclass1 inherit from base class
class BMW extends Car{
    void wheel(){
        System.out.println("Four");
    }
}
//Subclass2 inherit from subclass1
class Nano extends BMW{
    void size(){
        System.out.println("Small");
    }
}