import java.util.Scanner;

public class area_of_circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your value of radious: ");
        float radius = sc.nextFloat();

        float area = 3.14f * radius *  radius;
        System.out.println("Area of circle is "+area);
    }
}
