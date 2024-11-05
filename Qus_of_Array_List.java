import java.util.ArrayList;

public class Qus_of_Array_List {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(3);
        list.add(9);
        list.add(15);
        list.add(10);

       //Q1)Print the Reverse of the ArrayList
       System.out.println("Reverse ArrayList: ");
       for(int i=list.size()-1; i>=0; i--){
            System.out.print(list.get(i)+" ");
       }
       System.out.println();

       //Q2)Find the maximum element in ArrayList
       int max = Integer.MIN_VALUE;
       for(int i=0; i<list.size(); i++){

            // if(max < list.get(i)){
            //     max = list.get(i);
            // }
            max = Math.max(max, list.get(i));
       }
       System.out.println("Maximum Element: "+max);
    }
}
