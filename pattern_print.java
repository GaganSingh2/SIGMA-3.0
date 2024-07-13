import java.util.Scanner;
public class pattern_print {
    public static void main(String[] args) {
        
        //-------PATTERNS PRINTING-------

        //Q1)Print Star pattern
        // for(int line=1; line<=4; line++){
        //     for(int star=1; star<=line; star++){
        //         System.out.print("x");
        //     }
        //     System.out.println();
        // }

        //Q2)Print Inverted-star pattern
        // int n = 4;
        // for(int line=1; line<=n; line++){
        //     //for(int star=4; star>=line; star--){
        //     for(int star=1; star<=(n-line+1); star++){
        //         System.out.print("x");
        //     }
        //     System.out.println();
        // }


        //Q3)Print the half-pyramid pattern
     
        // int n = 4;
        // for(int line=1; line<=n; line++){
        //     for(int num=1; num<=line; num++){
                
        //         System.out.print(num);
        //     }
        //     System.out.println();
        // }


        //Q4)Print the character pattern
        int n = 4; 
        char ch = 'A';
        for(int line=1; line<=n; line++){
            for(int chars=1; chars<=line; chars++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
