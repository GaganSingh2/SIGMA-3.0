public class Inheritance {
    public static void main(String[] args) {
        /*INHERITANCE:- Inheritance is when properties and method of base class are passed on to a derived class. It is allow you to create a new classes(Derived class) based on existing class(Base class).*/
        Fish shark = new Fish();
        shark.eat();
        shark.breath();
        shark.swim();
    }
}

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