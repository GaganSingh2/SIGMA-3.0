public class call_by_value {
    /*Call by Value:-
     * jab hum call by value ka use kaarte hai to usme jo hum argument pass karte hai usme uski orgininal value ki copy ban kar jati hai na ki orginial value 
     * function ke bahar jab hum apne value ko print karayenge to hume original value or purani value hi milegi jo humne argument me pass kiya tha
     */
    //Call by Reference me function ke pass orginal value bheje jate hai

    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("value of a and b after swaping inside of method....");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
    public static void main(String[] args) {
        int a = 5; 
        int b = 10;
        swap(a, b);

        System.out.println("After the method call....");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
}
