import java.util.Scanner;

public class pattern_2 {

    public static void hollow_rectangle(int totrows, int totcols) {
        // outer loop for total lines to print
        for (int i = 1; i <= totrows; i++) {
            // inner loop for column
            for (int j = 1; j <= totcols; j++) {
                // condition true then print star
                if (i == 1 || i == totrows || j == 1 || j == totcols) {
                    System.out.print("x");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }


    public static void inverted_rotated_half_pyramid(int num) {
        // for row or line
        for (int i = 1; i <= num; i++) {

            // for space
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("x");
            }
            System.out.println();
        }
        return;

    }


    public static void inverted_half_pyramid_withNumber(int num){
        // for line or rows
        for(int i=1; i<=num; i++){

            // for print numbers
            for(int j=1; j<=num-i+1; j++){
                System.out.print(j+" ");
            }
            for(int j=1; j<=i-1; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
        return;
    }


    public static void floyd_triangle(int num){
        int count=1;
        // for line or rows
        for(int i=1; i<=num; i++){
            
            // for print numbers
            for(int j=1; j<=i; j++){
               
                System.out.print(count+" ");
                count++;
               
            }
            System.out.println();
          
        }
        return;
    }


    public static void triangle_of_zero_one(int num){
        // for line and rows
        for(int i=1; i<=num; i++){

            //for print 0 and 1
            for(int j=1; j<=i; j++){
                if ((i+j)%2==0) {
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
                
            }
            System.out.println();
        }
        return;
    }


    public static void butterfly_pattern(int num){
        //1st half

        //for line and rows
        for(int i=1; i<=num; i++){

            //Star - i
            for(int j=1; j<=i; j++){
                System.out.print("x");
            }

            //Space - 2*(num-i)
            for(int j=1; j<=2*(num-i); j++){
                System.out.print(" ");
            }

            //Star - i
            for(int j=1; j<=i; j++){
                System.out.print("x");
            }
            System.out.println();
        }

        //2nd half

        //for line and rows
        for(int i=num; i>=1; i--){

             //Star - i
             for(int j=1; j<=i; j++){
                System.out.print("x");
            }

            //Space - 2*(num-i)
            for(int j=1; j<=2*(num-i); j++){
                System.out.print(" ");
            }

            //Star - i
            for(int j=1; j<=i; j++){
                System.out.print("x");
            }
            System.out.println();
        }
        
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Q1)Print the hollow rectangle
        // System.out.println("Enter the total rows: ");
        // int totrows = sc.nextInt();
        // System.out.println("Enter the total column: ");
        // int totcols = sc.nextInt();
        // hollow_rectangle(totrows, totcols);


        // Q2)print the inverted and rotated half pyramid
        // System.out.println("Enter the line num: ");
        // int num = sc.nextInt();
        // inverted_rotated_half_pyramid(num);


        //Q3) print the inverted half pyramid with numbers
        // System.out.println("Enter the number of line: ");
        // int num = sc.nextInt();
        // inverted_half_pyramid_withNumber(num);


        //Q4) print the Floyd triangle with numbers
        // System.out.println("ENter the number: ");
        // int num = sc.nextInt();
        // floyd_triangle(num);

       
        //Q5) print the the 0-1 triangle
        // System.out.println("ENter the number of line: ");
        // int num = sc.nextInt();
        // triangle_of_zero_one(num);


        //Q6) print the butterfly pattern
        System.out.println("ENter the number of line: ");
        int num = sc.nextInt();
        butterfly_pattern(num);

    }
}
