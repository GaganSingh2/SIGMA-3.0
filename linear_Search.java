import java.util.Scanner;

public class linear_Search {

    public static int linearSearch(int number[],int key){

        for(int i=0; i<number.length; i++){
            if (number[i]==key) {
                return i;
            }
        }
        return -1;
    }


    public static int fastFood(String menu[], String key){
           for(int i=0; i<menu.length; i++){
                if (menu[i]==key) {
                    return i;
                }
           }
           return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // int number[] = {2,3,5,7,8,24,54,65};

        // System.out.println("Enter the key value: ");
        // int key = sc.nextInt();
        // int index = linearSearch(number, key);
        // if (index == -1) {
        //     System.out.println("NOT Found");
        // }
        // else{
        //     System.out.println("Key is at index: "+index);
        // }

        //Time Complexity: O(n).
        //Space Complexity:
        

    String menu[] = {"Dosa","Samosa","Pasta","Burger","Sting"};
    System.out.println("enter the value: ");
    String key = sc.nextLine();
    int index = fastFood(menu, key);
    if (index== -1) {
        System.out.println("Not found");
    }
    else{
        System.out.println(index);
    }
     

    }
}
