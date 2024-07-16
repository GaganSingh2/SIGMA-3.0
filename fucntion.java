public class fucntion {

    /*Syntax Of Fuction:-
     *           returnType name(){
     *                   body
     *                   return statement; 
     *           }
     * It is also called Method in java
     * hum ak class ke andar bahut sare function ko create v kar skte hai aur call v kar skte hai
     */


    //  public static void printHello(){
    //     System.out.println("Hello World");
    //     return;  //humne yaha simple return likha hai kyuki void empty value return karta hai
    //  }
    public static int printHello(){
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        return 3;  //humne yaha retrun ke sath 3 likha hai kyuki humne apne function me returntype int liya hai jo kuch na kuch value return karayega
    }
    public static void main(String[] args) {
        System.out.println("Radhe Radhe");
        printHello();  //function call
    }
}
