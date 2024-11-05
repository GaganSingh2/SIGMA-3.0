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
    }
}
