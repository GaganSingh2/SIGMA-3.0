public class StaticKeyword {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolName = "AIET";
        Student s2 = new Student();
        System.out.println("School Name: "+s2.schoolName);

        Student s3 = new Student();
        s3.schoolName="ACE";//yaha se sare objects me ACE data share ho jayega jo ki static keyword ke help se hua hai
        System.out.println("School Name: "+s1.schoolName);
        System.out.println("School Name: "+s2.schoolName);
    }
}

/*-------STATIC KEYWORD:-
 * Static keyword in java is used to share the same variable or method of a given class.
 * The static keyword in Java is used to modify the behavior of classes, methods, and variables.
 * Static keyword ke help se hum sare objects me same data ko share kar skte hai, jab hum class ko object ke through static variable ko call karenge or usme koi value pass karenge and then hum koi dusra object create karenge or static method ko call karenge to hume o purana wala value hi milega.
 */
class Student{
    String name;
    int rollno;

    static String schoolName;

    void setName(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }
}