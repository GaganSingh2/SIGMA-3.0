public class Constructors {
    public static void main(String[] args) {
        /*Constructor:- it is special method which is called automatically at the time of object creation.  
         * Constructor have the same name as a class and structure.
         * Constructor don't have a return type(not even void).
         * Constructor are only called once,at object creation.
         * java create a Constructor of object creation time, when we don't create a constructor in our class.
         */
        Student std = new Student();
        //std.name = "Gagan Kumar"; //1st way
        Student std1 = new Student("Gagan Kumar"); //2nd way
        System.out.println("Name: "+std1.name);
        //std.rollNo = 18;
        Student std2 = new Student(18);
        System.out.println("Roll NO.: "+std2.rollNo);
        // Student std3 = new Student("Gagan",18);  //ye hame error show karega kyuki jab humne isse create kiye to aur name and roll pass kiya to ye Student class me jake aisa constructor search karega jisme do parameter pass ho but aisa nhi hai iss liye ye error show karega
    }
}

class Student{
    //Attributes
    String name;
    int rollNo;

    //Create a Constructor
    Student(){  // Non-Parameterized Constructor
        System.out.println("Constructer is called.....");
    }
    Student(String name){  //Parameterized Constructor
        this.name = name;
    }
    Student(int rollNo){
        this.rollNo = rollNo;
    }
}