package Recursion;

public class PrintNameWithoutUsingSemicolon {
    public static void main(String[] args) {
        //Using if Statement
        // System.out.printf() returns a PrintStream object (not null), so the if condition is valid.
        // The if block is empty, so no semicolon is required for the statement itself.
        if(System.out.printf("Gagan") != null){} //if printf take some value means he have not null so if condtion will be true.
        
        System.out.println();
        //Using for-Loop
        for(int i=0; i<5 && System.out.printf("Gagan")==null; i++){} 
        //here print the value during the checking the condition after checking (i<5 && false)(false because printf have some value or we try to compare the null value so he give false) so loop will not into body
    }
}
