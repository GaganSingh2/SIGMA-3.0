public class Constructors {
    public static void main(String[] args) {
        Student std = new Student();
        std.name = "Gagan Kumar";
        System.out.println("Name: "+std.name);
        //std.rollNo = 18;
        Student std1 = new Student(18);
        System.out.println("Roll NO.: "+std1.rollNo);
    }
}

class Student{
    //Attributes
    String name;
    int rollNo;

    //Create a Constructor
    Student(){
        System.out.println("Constructer is called.....");
    }
    Student(String name){
        this.name = name;
    }
    Student(int rollNo){
        this.rollNo = rollNo;
    }
}