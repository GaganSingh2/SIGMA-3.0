import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Qus_of_Array_List {
     public static void swap(ArrayList<Integer>list, int idx1,int idx2){

          int temp = list.get(idx1);
          list.set(idx1, list.get(idx2));
          list.set(idx2, temp);
     }

     public static int maxWater(ArrayList<Integer> height){
          int max_Water = 0;
          //Brute Force O(n)
          for(int i=0; i<height.size(); i++){
               for(int j=i+1; j<height.size(); j++){
                    int ht = Math.min(height.get(i),height.get(j));
                    int width = j-i;
                    int water = ht*width;
                    max_Water = Math.max(max_Water, water);
               }
          }
          return max_Water;
     }
     public static void main(String[] args) {
          ArrayList<Integer> list = new ArrayList<>();

          list.add(5);
          list.add(3);
          list.add(9);
          list.add(15);
          list.add(10);

          // Q1)Print the Reverse of the ArrayList
          // System.out.println("Reverse ArrayList: ");
          // for(int i=list.size()-1; i>=0; i--){
          //       System.out.print(list.get(i)+" ");
          // }
          // System.out.println();

          // Q2)Find the maximum element in ArrayList
          // int max = Integer.MIN_VALUE;
          // for(int i=0; i<list.size(); i++){

          //     if(max < list.get(i)){
          //          max = list.get(i);
          //     }
          //    max = Math.max(max, list.get(i));
          // }
          // System.out.println("Maximum Element: "+max);

          //Q3)Swap the values
          // int idx1=1, idx2=3;
          // System.out.println("Before Swapping: "+list);
          // swap(list, idx1, idx2);
          // System.out.println("After Swapping: "+list);

          //Q4)Sorting in ArrayList (Comparitor:-it is used to define the logic of Sorting)
          // System.out.println("Before Sorting in Ascending order: "+list);
          // Collections.sort(list);
          // System.out.println("After Sorting in Ascending order: "+list);

          // System.out.println("Before Sorting in Descending order: "+list);
          // Collections.sort(list,Collections.reverseOrder());
          // System.out.println("After Sorting in Dscending order: "+list);

          //Q5)Print the 2-D Matrix in table of 1,2,3
          // ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();

          // ArrayList<Integer> mat1 = new ArrayList<>();
          // ArrayList<Integer> mat2 = new ArrayList<>();
          // ArrayList<Integer> mat3 = new ArrayList<>();

          // for(int i=1; i<=5; i++){
          //      mat1.add(i*1);
          //      mat2.add(i*2);
          //      mat3.add(i*3);
          // }     
          // matrix.add(mat1);
          // matrix.add(mat2);     
          // matrix.add(mat3);
          
          // System.out.println("Matrix is: ");
          // for(int i=0; i<matrix.size(); i++){
          //      ArrayList<Integer> main_Matrix = matrix.get(i);
          //      for(int j=0; j<main_Matrix.size(); j++){
          //           System.out.print(main_Matrix.get(j)+" ");
          //      }
          //      System.out.println();
          // }


          //Q6)Container With Most Water(For given n lines on x-axis, use 2 lines to form a container, such  that it hold maximum water).
          ArrayList<Integer> height = new ArrayList<>();

          //heigth=[1,8,6,2,5,4,8,3,7]
          height.add(1);
          height.add(8);
          height.add(6);
          height.add(2);
          height.add(5);
          height.add(4);
          height.add(8);
          height.add(3);
          height.add(7);
          
          int res = maxWater(height);
          System.out.println("Maximum Water: "+res);
          

     }
}
