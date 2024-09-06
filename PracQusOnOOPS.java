
public class PracQusOnOOPS {

    public static void main(String[] args) {
        //Q1)Find out the correct statement to assign name to object.
        Student s = new Student();
        s.name = "Gagan";
        System.out.println("Name: "+s.name);
    }
}

//Q1) 
class Student{
    String name;
    int marks;
}