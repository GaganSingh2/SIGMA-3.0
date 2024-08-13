import java.util.Scanner;

public class array_2_D {

    public static boolean searchKey(int arr[][],int key){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if (arr[i][j]==key) {
                    System.out.println("Found at cell ("+i +","+j+")");
                    return true;
                }
            }
        }
        System.out.println("key not found");
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of Row of Array: ");
        int row = sc.nextInt();

        System.out.println("ENter the length of Column of Array: ");
        int col = sc.nextInt();

        int arr[][] = new int[row][col];
        //jab v hume agr row ka length find krna ho to hum arr.length ka use karenge
        //aur jab hume column ka length find karna ho to hum arr[0].length ka use karenge

        System.out.println("ENter the value in Array: ");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        
        //for print the 2-D array
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        //Q1)Find the key in 2-D array
        System.out.println("Enter the key: ");
        int key = sc.nextInt();

        searchKey(arr, key);
    }
}