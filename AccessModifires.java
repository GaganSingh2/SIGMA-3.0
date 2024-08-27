public class AccessModifires {
    public static void main(String[] args) {
        
        //--------ACCESS MODIFIRES-------
        /*There are 4 types of Access Modifires
         * 1) Public:- Accessible from anywhere in the program. Used for classes, methods, and variables that need to be accessed      from outside the package.Access:- a) Within class[Yes] (b)Within package[Yes] (c)Outside package by subclass only[Yes] (d)outside package[Yes].
         * 2) private:- Accessible only within the same class.Used for methods and variables that should not be accessed from outside the class. Access:- a) Within class[Yes] (b)Within package[No] (c)Outside package by subclass only[No] (d)outside package[No].
         * 3) protected:- Accessible within the same package or in any subclass of the class.Used for methods and variables that need to be accessible to subclasses but not to other classes outside the package.Access:- a) Within class[Yes] (b)Within package[Yes] (c)Outside package by subclass only[Yes] (d)outside package[No].
         * 4) Defualt:- Accessible only within the same package.Used for classes, methods, and variables that should be accessible only within the package.Access:- a) Within class[Yes] (b)Within package[Yes] (c)Outside package by subclass only[No] (d)outside package[No].
         */

         BankAccount myAcc = new BankAccount();
         myAcc.userName = "Gagan";
         System.out.println("User Name: "+myAcc.userName);
        // myAcc.password = 1234; //show error because the password is private and cannot be access outside the class 
         myAcc.setPassword("abc");
         myAcc.balance = 1234;
         System.out.println("Balance: "+myAcc.balance);
         
    }
}

class BankAccount{
    
    //Attribute
    public String userName;
    private String password;

    protected int balance;
    public void setPassword(String pwd){
        pwd = password;
        
    }
   
    
    
}
