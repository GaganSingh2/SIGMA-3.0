public class Interface {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
        Rook r = new Rook();
        r.moves();
        King k = new King();
        k.moves();
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