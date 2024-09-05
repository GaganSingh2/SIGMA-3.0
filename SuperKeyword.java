public class SuperKeyword {
    public static void main(String[] args) {
        Horse h = new Horse();
        System.out.println("Color: "+h.color);
        h.color = "White";
        System.out.println("Color: "+h.color);
    }
}

/*--------SUPER KEYWORD-------
 * Super keyword is used to refers immediate parent class object.
 * Super keyword is used to refer to the superclass of the current object.
 * Super keyword must be used within a subclass.
 * You cannot use super to access private member of the superclass.
 */
class Animal{
    String color;
    Animal(){
        System.out.println("Animal constructor is called");
    }
}

class Horse extends Animal{
    
    Horse(){
        super.color="Brown";
        System.out.println("Horsse constructor is called");
    }
}
