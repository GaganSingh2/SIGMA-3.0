package InterviewPrepration.MediBuddy;

import java.util.Scanner;

public class SecondLargestElement {
    public static int secondLargestElement(int arr[]){
        int firstVal = Integer.MIN_VALUE;
        int secVal = firstVal;

        for(int i=0; i<arr.length; i++){
            if (firstVal < arr[i]) {
                secVal = firstVal;
                firstVal = arr[i];
            }
            else if(secVal < arr[i] && firstVal != arr[i]){
                secVal = arr[i];
            }
        }
        return secVal;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size: ");
        int len = sc.nextInt();
        int arr[] = new int[len];

        System.out.println("Enter Value: ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int secVal = secondLargestElement(arr);
        System.out.println("Second Largest: "+secVal);
    }
}
