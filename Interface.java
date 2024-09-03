public class Interface {
    public static void main(String[] args) {
        //create a interface objects
        Queen q = new Queen();
        q.moves();
        Rook r = new Rook();
        r.moves();
        King k = new King();
        k.moves();
    
        //Multiple inheritance ke liye object create 
        FullStack fs = new FullStack();
        fs.userSide();
        fs.backSide();
    }
}

/*--------INTERFACE---------- 
 * With the help of Interface keyword create a interface in java.
 * Interface iin java is a blueprint of a class that contain abstract method and constant.
 * All method are public, abstract and without implementation.
 * It is execute Multiple Inheritance.
 */
interface ChessPlayer{
    void moves();//abstract method
}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("Up, Down, Left, Right, Diagonal(in all 4 direction)");
    }
}

class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("Up, Down, Left, Right");
    }
}

class King implements ChessPlayer{
    public void moves(){
        System.out.println("Up, Down, Left, Right, Diagonal(by 1 step)");
    }
}

/*-------MULTIPLE INHERITANCE-------
 * A class can implement multiple interfaces, allowing it to inherit behavior from multiple sources.
 * Jab 1 child class 2 ya 2se jada parent class ko inherit karta hai to usee Multiple Inheritance kahte hai.
 */
//Create 1st interface, i.e. 1st parent class
interface FrontEnd{
    void userSide();
}
//Create 2nd interface, i.e. 2nd parent class
interface BackEnd{
    void backSide();
}

//Create child class ko both interface ko inherit karega
class FullStack implements FrontEnd, BackEnd{
    public void userSide(){
        System.out.println("Display on the user screen");
    }
    public void backSide(){
        System.out.println("Work on back side of user screen.");
    }
}