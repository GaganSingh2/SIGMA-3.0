public class Constructors {
    public static void main(String[] args) {
        /*Constructor:- it is special method which is called automatically at the time of object creation.  
         * Constructor have the same name as a class and structure.
         * Constructor don't have a return type(not even void).
         * Constructor are only called once,at object creation.
         * java create a Constructor of object creation time, when we don't create a constructor in our class.
         */
        // Student std = new Student();
        // //std.name = "Gagan Kumar"; //1st way
        // Student std1 = new Student("Gagan Kumar"); //2nd way
        // System.out.println("Name: "+std1.name);
        // //std.rollNo = 18;
        // Student std2 = new Student(18);
        // System.out.println("Roll NO.: "+std2.rollNo);
        // Student std3 = new Student("Gagan",18);  //ye hame error show karega kyuki jab humne isse create kiye to aur name and roll pass kiya to ye Student class me jake aisa constructor search karega jisme do parameter pass ho but aisa nhi hai iss liye ye error show karega

        //i create this objects for the copy constructor
        Student s1 = new Student();
        s1.name = "Gagan";
        s1.rollNo = 18;
        s1.password = "abc";
        s1.marks[0] = 80;
        s1.marks[1] = 90;
        s1.marks[2] = 100;
        

        Student s2 = new Student(s1);
        s2.password = "xyz";
        s1.marks[0] = 100;
        
        for(int i=0; i<3; i++){
            System.out.println(s2.marks[i]);
        }
    }
}

class Student{
    //Attributes
    String name;
    int rollNo;
    String password;
    int marks[];

    //Create a Constructor
    Student(){  //(1)Non-Parameterized Constructor
        marks = new int[3];
        System.out.println("Constructer is called.....");
    }
    Student(String name){  //(2)Parameterized Constructor
        this.name = name;
        marks = new int[3];
    }
    Student(int rollNo){
        this.rollNo = rollNo;
        marks = new int[3];
    }

    //(3)Copy Constructor
    Student(Student s1){
        this.name = s1.name;
        this.rollNo = s1.rollNo;
        marks = new int[3];
        this.marks = s1.marks;
    }
}