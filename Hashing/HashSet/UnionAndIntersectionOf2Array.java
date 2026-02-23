package Hashing.HashSet;

import java.util.HashSet;
import java.util.Scanner;

public class UnionAndIntersectionOf2Array {

    //Intersection of 2 Array (means all common and unique element in both array)
    public static int intersectionOf2Array(int arr1[], int arr2[]){
        HashSet<Integer> common = new HashSet<>();
        // add all unique element from arr1
        for(int i=0; i<arr1.length; i++){
            common.add(arr1[i]);
        }
        int cnt = 0;
        //iterate over arr2
        for(int i=0; i<arr2.length; i++){
            //check if arr2[i] is exist in set
            if(common.contains(arr2[i])){
                System.out.print(arr2[i]+" ");
                //if exist increase count
                cnt++;
                //and remove the match value from set
                common.remove(arr2[i]);
            }
        }System.out.println();
        return cnt;
    }

    //Union of 2 Array (means all unique element in both array)
    public static int unionOf2Array(int arr1[], int arr2[]){
        HashSet<Integer> unique = new HashSet<>();
        for(int i=0; i<arr1.length; i++){
            unique.add(arr1[i]);
        }

        for(int i=0; i<arr2.length; i++){
            unique.add(arr2[i]);
        }

        System.out.println("Unique Element(Union): ");
        for(int v: unique){
            System.out.print(v+" ");
        }System.out.println();
        return unique.size();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of 1StArray and 2ndArray: ");
        int len1 = sc.nextInt();
        int len2 = sc.nextInt();

        int arr1[] = new int[len1];
        int arr2[] = new int[len2];

        System.out.println("Enter the value in 1stArray: ");
        for(int i=0; i<len1; i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the value in 2ndArray: ");
        for(int i=0; i<len2; i++){
            arr2[i] = sc.nextInt();
        }

        System.out.println("Value of 1stArray: ");
        for(int val: arr1){
            System.out.print(val+" ");
        }System.out.println();
        System.out.println("Value of 2ndArray: ");
        for(int val: arr2){
            System.out.print(val+" ");
        }System.out.println();

        int unique = unionOf2Array(arr1, arr2);
        System.out.println("Total Unique Element: "+unique);

        int common = intersectionOf2Array(arr1, arr2);
        System.out.println("Total Common Element: "+common);
    }
}
