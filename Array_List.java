import java.util.Scanner;
import java.util.ArrayList;
public class Array_List {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Syntax of ArrayList
        ArrayList<Integer> list1 = new ArrayList<>(); //int type arraylist
        ArrayList<String> list2 = new ArrayList<>(); //String type arraylist
        ArrayList<Boolean> list3 = new ArrayList<>(); //Boolean type arraylist

        //---Operation on ArrayList
        //1) Adding element
        System.out.println("Adding Element:");
        list2.add("orange");
        list2.add("Apple");
        list2.add(0,"Grapes");
        System.out.println(list2);

        //2) Get Element
        System.out.println("Accessing Element:");
        String res = list2.get(1);
        System.out.println(res);

        //3) Remove Element
        System.out.println("Removing Element: ");
        list2.remove(1); //remove element through index numbe
        // list2.remove("Apple"); //remove element through element name
        System.out.println(list2);

        //4) Modifying Element
        System.out.println("Modifying Element: ");
        list2.set(1, "Banana");
        System.out.println(list2);

        //5)Checking for an Element
        System.out.println("Checking for an Element: ");
        System.out.println(list2.contains("Apple"));
        System.out.println(list2.contains("Banana"));
        
        //6)Size of ArrayList
        System.out.println("Size of ArrayList: ");
        int size = list2.size();
        System.out.println(size);

        //7)Clearing the ArrayList:-Remove all element in ArrayList
        System.out.println("Clearing all Element: ");
        list2.clear();
        System.out.println(list2);

        //8)Checking ArrayList is isEmpty or not
        System.out.println("Checking is isEmpty or not: ");
        System.out.println(list2.isEmpty());

        //---Iteration Over ArrayList---
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        System.out.println("Values in ArrayList: ");
        for(int i=0; i<list1.size(); i++){
            System.out.print(list1.get(i)+" ");
        }
        System.out.println();
        //---Multi-Dimensional ArrayList---
            //Create 2-D ArrayList
        ArrayList<ArrayList<Integer>> MainMatrix = new ArrayList<>();

        ArrayList<Integer> mat1 = new ArrayList<>();
        mat1.add(3);
        mat1.add(5);
        mat1.add(6);
        MainMatrix.add(mat1);

        ArrayList<Integer> mat2 = new ArrayList<>();
        mat2.add(7);
        mat2.add(8);
        mat2.add(10);
        MainMatrix.add(mat2);
        
        System.out.println("Multi-Dimensional ArrayList: ");
        for(int i=0; i<MainMatrix.size(); i++){
            ArrayList<Integer> currMat = MainMatrix.get(i);
            for(int j=0; j<currMat.size(); j++){
                System.out.print(currMat.get(j)+" ");
            }
            System.out.println();
        }
    }
}
