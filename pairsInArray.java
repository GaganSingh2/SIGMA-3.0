import java.util.Scanner;

public class pairsInArray {

    public static void pairsOfArray(int num[]){
        int tp = 0;
        for(int i=0; i<num.length; i++){
            int curr = num[i];  
            for(int j=i+1; j<num.length; j++){  //for pair the next number
                System.out.print("("+curr+","+num[j]+")");
                tp++;
            }
            System.out.println();
        }

        System.out.println("TOtal Pair is "+tp);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Find the Pairs in given Array
        System.out.println("Enter the length of Array: ");
        int len = sc.nextInt();

        int num[] = new int[len];

        System.out.println("Enter the value in Array: ");
        for(int i=0; i<len; i++){
            num[i] = sc.nextInt();
        }
        pairsOfArray(num);

        //The Time Complexity of this code is O(n^2)
        
    }
}
