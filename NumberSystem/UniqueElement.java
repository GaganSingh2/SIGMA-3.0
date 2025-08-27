package NumberSystem;

import java.util.*;
public class UniqueElement {
    public static int uniqueElement(int arr[]){
        int unique = 0;
        for(int ele: arr){
            unique ^= ele;
        }
        return unique;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the value: ");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array: ");
        for (int i : arr) {
            System.out.print(i+" ");
        }System.out.println();

        System.out.println("Unique Element: "+uniqueElement(arr));
    }

}
