import java.util.Scanner;
import java.util.Stack;
public class TrappingRainWater {
    public static int trappedRainWaterUsingArray(int height[]){
        int si = 0, ei = height.length-1;
        int lmax = 0, rmax = 0, trapWater = 0;

        while (si<ei) {
            lmax = Math.max(lmax, height[si]);
            rmax = Math.max(rmax, height[ei]);
            if(lmax<rmax){
                trapWater += lmax - height[si];
                si++;
            }
            else{
                trapWater += rmax - height[ei];
                ei--;
            }
        }
        return trapWater;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of height: ");
        int len = sc.nextInt();

        int height[] = new int[len];
        System.out.println("Enter the Height: ");
        for(int i=0; i<len; i++){
            height[i] = sc.nextInt();
        }
        System.out.println("Height: ");
        for(int ele: height){
            System.out.print(ele+" ");
        }
        int trapWater = trappedRainWaterUsingArray(height);
        System.out.println("Trapped Water: "+trapWater);
    }
}
