import java.util.Scanner;

public class pattern_2 {

    public static void hollow_rectangle(int totrows, int totcols){
        // outer loop for total lines to print
        for(int i=1; i<=totrows; i++){
            // inner loop  for column
            for(int j=1; j<=totcols; j++){
                //condition true then print star
                if(i==1 || i==totrows || j==1 || j==totcols){
                    System.out.print("x");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner( System.in);
        
        //Q1)Print the hollow rectangle
        System.out.println("Enter the total rows: ");
        int totrows = sc.nextInt();
        System.out.println("Enter the total column: ");
        int totcols = sc.nextInt();

        hollow_rectangle(totrows, totcols);

    }
}
