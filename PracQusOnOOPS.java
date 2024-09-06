
public class PracQusOnOOPS {

    public static void main(String[] args) {
        //Q1)Find out the correct statement to assign name to object.
        // Student s = new Student();
        // s.name = "Gagan";
        // System.out.println("Name: "+s.name);

        //Q2) Which variables can the class person access in the following code?
        
        // Person p = new Person();
        // p.name="Gagan";
        // p.weight=48;
        // // p.rollNumber=1; //give error because person class me rollnumber define nhi hai 
        // System.out.println("Name: "+p.name);
        // System.out.println("Weight: "+p.weight);

        //Q3) Which of the following is a correct statement(both classes in same package).
        // Car c = new Car();
        // Vehical v = new Vehical();
        // Vehical v1 = new Car();
        // //Car c1 = new Vehical();//yaha hume ye error dega kyuki hum aise object create nhi kar skte hai

        //Q5) What will be output of this code(both classes in same package)
        // Teacher obj1 = new Ladka();
        // obj1.print();
        // Teacher obj2 = new Teacher();
        // obj2.print();

        //Q8) WHat will be output of this code?
        //State obj1 = new City();
        // //obj1.print1(); //Given Error
        // State obj2 = new State();
        // obj2.print();


        //Q7) What will be the output of this code
        // System.out.println("Count of Book: "+Book.count);
        // Book b1 = new Book(150);
        // Book b2 = new Book(250);
        // System.out.println("Count of Book: "+Book.count);


        //Q9) Which line has errror?
        // Test t = new Test();
        // t.set_marks(80);
        // System.out.println("Marks: "+Test.marks);

        //Q10)What would be the output of the following code.
        Test1 t1 = new Test1();
        t1.changeB();
        System.out.println(Test1.a+Test1.b);
    }
}

//Q1) 
class Student{
    String name;
    int marks;
}

//Q2)
class Person{
    String name;
    int weight;
}
class Boy extends Person{
    int rollNumber;
    String schoolName;
}

//Q3)
class Vehical{
    String color;
}
class Car extends Vehical{
    int tyreNo;
}

//Q5)
class Teacher{
    void print(){
        System.out.println("Base class(Teacher)");
    }
}
class Ladka extends Teacher{
    void print(){
        System.out.println("Derived class(Ladka)");
    }
}

//Q6)
class State{
    void print(){
        System.out.println("Base class(State)");
    }
}
class City extends State{
    void print1(){
        System.out.println("Derived class(City)");
    }
}

//Q8)
class Book{
    int price;
    static int count;

    public Book(int price){
        this.price = price;
        count++;
    }
}

//Q9)
class Test{
    static int marks;
    void set_marks(int marks){
        this.marks = marks;
    }
}

//Q10)
class Test1{
    static int a = 10;
    static int b;
    static void changeB(){
        b = a*3;
    }
}