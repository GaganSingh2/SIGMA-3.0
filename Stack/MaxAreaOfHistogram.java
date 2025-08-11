import java.util.Scanner;
import java.util.Stack;

public class MaxAreaOfHistogram {
    private static void maxAreaOfHistogram(int height[]){
        Stack<Integer> temp = new Stack<>();
        int len = height.length;
        int nSL[] = new int[len]; //Next Smaller Left
        int nSR[] = new int[len]; //Next Smaller Right

        //For Next Smaller Right
        for(int i=len-1; i>=0; i--){
            while(!temp.isEmpty() && height[temp.peek()]>=height[i]){
                temp.pop();
            }
            if(temp.isEmpty()){
                nSR[i] = height.length;
            }
            else{
                nSR[i] = temp.peek();
            }
            temp.push(i);
        }

        //For Next Smaller left
        for(int i=0; i<height.length; i++){
            while (!temp.isEmpty() && height[temp.peek()]>=height[i]) {
                temp.pop();
            }
            if(temp.isEmpty()){
                nSL[i] = -1;
            }
            else{
                nSL[i] = temp.peek();
            }
            temp.push(i);
        }

        //For Finding Maximum Area
        int maxArea = Integer.MIN_VALUE;
        for(int i=0; i<height.length; i++){
            int hei = height[i];
            int Width = nSR[i]-nSL[i]-1;
            int area = hei * Width;
            maxArea = Math.max(maxArea, area);
        }
        System.out.println(maxArea);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size: ");
        int size = sc.nextInt();
        int height[] = new int[size];
        System.out.println("Enter the Heights: ");
        for(int i=0; i<height.length; i++){
            height[i] = sc.nextInt();
        }
        System.out.println("Height: ");
        for(int i=0; i<height.length; i++){
            System.out.print(height[i]+" ");
        }System.out.println();
        maxAreaOfHistogram(height);
    }
}
