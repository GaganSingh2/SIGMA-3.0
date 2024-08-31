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

        //(3)Hierarchical Inheritance ex. ka object hai ye
        Mukesh frd = new Mukesh();
        frd.eat();
        frd.legs();
        //frd.study(); // ye hume error dega kyuki humne Gagan ko Mukesh class ke andar inherit nhi kiya hai kewal Boy ko kiya hai

        //(4)Hybrid Inheritance ex. ka object hai ye
        Java ja = new Java();
        ja.run();
        ja.learn();
        ja.run();
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

//(3)Hierarchical Inheritance:-Multiple subclasses inherit from the same superclass.
//Base class
class Boy{
    void eat(){
        System.out.println("Eats");
    }
    void legs(){
        System.out.println("Two");
    }
}
//Subclass1 inherits from Base class
class Gagan extends Boy{
    void study(){
        System.out.println("Engineering");
    }
}
//Subclass2 inherits from Base class
class Mukesh extends Boy{
    void learn(){
        System.out.println("Mediciens");
    }
}

//(4)Hybrid Inheritance:- A combination of multiple and multilevel inheritance.Not directly supported in Java, but can be achieved using interface.
//Base class
class Language{
    void run(){
        System.out.println("Easy");
    }
    void write(){
        System.out.println("Normal");
    }
}
//Subclass1 inherits from base class
class C extends Language{
    void understand(){
        System.out.println("Difficult");
    }
}
//Subclass2 inherits from base class
class Python extends Language{
    void learn(){
        System.out.println("Very easy");
    }
}
//Subclass3 Inherits from subclass2
class Java extends Python{
    void security(){
        System.out.println("Very High");
    }
}
