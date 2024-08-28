import java.util.Scanner;

public class OOPS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //-----------CLASSES AND OBJECTS--------
        /*
         * Class:- A class is a blueprint or template for creating objects. we create many class in one java file.
         * Object:- It represnt a real-world entity. Object create with the help of 'new' keyword.
         * Attribute:- It is also called Instance Variable.Inside the class, declare variables to represent the data that objects of this class will store.
         * Method:- It is also called Behavior.Methods define the actions that objects of the class can perform.
         */
 
        //  Pen p1 = new Pen(); //Created a pen object called p1
        //  p1.setColor("Red");
        //  System.out.println("New Color: "+p1.color);
        //  p1.setTip(8);
        //  System.out.println("New Tip: "+p1.tip);
        //  p1.setColor("Black");
        //  System.out.println("New Color: "+p1.color);
        //  p1.color = "Blue";
        //  System.out.println("New Color: "+p1.color);


        //------GETTERS AND SETTERS-------
        //inka use hum private data ko apne main class ke andar update and print karane ke liye karte hai
        Bank myAcc = new Bank(); //Created a bank object called myAcc
        myAcc.setPinNo(1818);
        System.out.println("Pin Number: "+myAcc.getPinNo());
        myAcc.setName("Gagan");
        System.out.println("Name: "+myAcc.getName());
        myAcc.setName("Gagan Kumar");
        System.out.println("Name: "+myAcc.getName());

    }
}
//-----Create a new Class----
class Pen{

    //Attribute (Instance Variable)
    String color;
    int tip;

    //Method(Behaviors)
    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
        tip = newTip;
    }

}

class Bank{

    //Attribute
    private int pinNo;
    private String name;

    //Method(Behaviors)
    //Setters for Modify the data
    void setPinNo(int newNo){
        this.pinNo = newNo; //this keyword ka use hum tab karte hai jab humne apne attribute aur parameter ka name same rakha ho. this keyword hume ye batata hai ke ye variable humara main attribute hai jisme hum apne parameter ko assign karenge.
    }
    void setName(String newName){
        this.name = newName;
    }

    //Getters for return the data
    int getPinNo(){
        return this.pinNo;
    }
    String getName(){
        return this.name;
    }
}
