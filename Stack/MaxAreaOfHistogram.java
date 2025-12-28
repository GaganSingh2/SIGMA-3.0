import java.util.Scanner;
import java.util.Stack;

public class MaxAreaOfHistogram {

    public static int maxAreaOfHistogram(int area[]){
        int len = area.length; 
        int nsl[] = new int[len];
        int nsr[] = new int[len];
        Stack<Integer> tmp = new Stack<>();

       
        for(int i=0; i<nsl.length; i++){
            while (!tmp.isEmpty() && area[i]<=area[tmp.peek()]) {
                tmp.pop();
            }
            if(tmp.isEmpty()){
                nsl[i] = -1;
            }
            else{
                nsl[i] = tmp.peek();
            }
            tmp.push(i);
        }
        for(int i=nsr.length-1; i>=0; i--){
            while (!tmp.isEmpty() && area[i]<=area[tmp.peek()]) {
                tmp.pop();
            }
            if(tmp.isEmpty()){
                nsr[i] = len;
            }
            else{
                nsr[i] = tmp.peek();
            }
            tmp.push(i);
        }
        int maxArea = 0;
        for(int i=0; i<area.length; i++){
            int width = nsr[i]-nsl[i]-1;
            int height = area[i];
            int currArea = height * width;
            maxArea = Math.max(maxArea, currArea);
        }
        return maxArea;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int len = sc.nextInt();
        int area[] = new int[len];
        System.out.println("Enter the Area: ");
        for(int i=0; i<len; i++){
            area[i] = sc.nextInt();
        }
        System.out.println("Area: ");
        for(int i=0; i<len; i++){
           System.out.print(area[i]+" ");
        }System.out.println();
        int maxArea = maxAreaOfHistogram(area);
        System.out.println("Max Area of Histogram: "+maxArea);
    }
}
