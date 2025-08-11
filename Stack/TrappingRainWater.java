import java.util.Scanner;
import java.util.Stack;
public class TrappingRainWater {
    private static int maxWater(int height[]){
        int maxWat = 0;
        Stack<Integer> te = new Stack<>();
        int len = height.length;
        for(int i=0; i<len; i++){
            while (!te.isEmpty() && height[te.peek()]<height[i]) {
                int pop_height = height[te.peek()];
                te.pop();
                if(te.isEmpty()){
                    break;
                }
                int distance = i-te.peek()-1;
                int min_height = Math.min(height[te.peek()],height[i])-pop_height;

                maxWat += distance * min_height;
            }
            te.push(i);
        }
        return maxWat;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        int height[] = new int[size];
        System.out.println("Enter the Heights: ");
        for(int i=0; i<size; i++){
            height[i] = sc.nextInt();
        }
        System.out.println("Heights: ");
        for(int i=0; i<size; i++){
            System.out.print(height[i]+" ");
        }System.out.println();

        int res = maxWater(height);
        System.out.println(res);
    }
}
