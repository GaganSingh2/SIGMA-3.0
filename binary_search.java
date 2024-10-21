import java.util.Scanner;
public class binary_search {

    public static int binarySearch(int num[], int key){
        int start = 0;
        int end = num.length - 1;
        while (start<=end) {
            int mid = (start + end)/2;
            if (num[mid]==key) {
                return mid;
            }
            else if (num[mid]<key) {  //right
                start = mid + 1;
            }
            else{  //left
                end = mid - 1;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* BINARY SEARCH:-
        find mid (start+end)/2
        Compare mid and keyy
         mid==key  Found
         mid<key   Right
         mid>key   Left
        */

        System.out.println("Enter the length of Array: ");
        int len = sc.nextInt();

        int num[] = new int[len];

        System.out.println("Enter the value in Array: ");
        for(int i=0; i<len; i++){
            num[i] = sc.nextInt();
        }

        System.out.println("Enter the key value: ");
        int key = sc.nextInt();

        int index = binarySearch(num, key);
        if (index == -1) {
            System.out.println("NOT Found");
        }
        else{
            System.out.println("Index is "+index);
        }

        //Time Complexity: O(log n).
        
    }
}
