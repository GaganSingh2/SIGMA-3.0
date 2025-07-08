import java.util.Scanner;

public class ShiftByOnePos {

    static void shiftByOnePos(int arr[]){
        int len = arr.length;
        int last = arr[len-1];
        for(int i=len-1; i>0; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = last;

        System.out.println("Array After Shifting: ");
        for(int i=0; i<len; i++){
            System.out.print(arr[i]+" ");
        }        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of Array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the value in Array: ");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Array Before Shifting: ");
        for(int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        shiftByOnePos(arr);
    }
}
