package TCSPractice;

import java.util.Arrays;
import java.util.Scanner;

public class ProblemStatement5 {
    public static void swap(int items[], int si, int ei){
        int temp = items[si];
        items[si] = items[ei];
        items[ei] = temp;
    }
    public static void sortBasedOnRisk(int items[]){
        //1st Approach
        // int cntZero = 0, cntOne = 0, cntTwo = 0;
        // for(int i=0; i<items.length; i++){
        //     if(items[i]==0){
        //         cntZero++;
        //     }
        //     else if(items[i]==1){
        //         cntOne++;
        //     }
        //     else{
        //         cntTwo++;
        //     }
        // }
        // for(int i=0; i<items.length; i++){
        //     if(cntZero != 0){
        //         items[i] = 0;
        //         cntZero--;
        //     }
        //     else if(cntOne != 0){
        //         items[i] = 1;
        //         cntOne--;
        //     }
        //     else if(cntTwo != 0){
        //         items[i] = 2;
        //         cntTwo--;
        //     }
        // }

        


        //2nd Approach
        int low = 0, mid = 0, high = items.length-1;
        while (mid<=high) {
            if(items[mid]==0){
                swap(items,mid,low);
                mid++;
                low++;
            }
            else if(items[mid]==1){
                mid++;
            }
            else{
                swap(items,mid,high);
                high--;
            }
        }
        for(int i=0; i<items.length; i++){
            System.out.print(items[i]+" ");
        }System.out.println();
    }
    public static void main(String[] args) {
        // Q)Sort the 0,1 and 2
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int items[] = new int[n];

        for(int i=0; i<n; i++){
            items[i] = sc.nextInt();
        }

        for(int i=0; i<n; i++){
            System.out.print(items[i]+" ");
        }System.out.println();
        sortBasedOnRisk(items);
        
    }
}

/*
3 Pointer Rules------
1)low
2)mid
3)high

1)0 to low-1 -> 0
2)low to mid-1 -> 1
3)high+1 to n-1 -> 2
 */
