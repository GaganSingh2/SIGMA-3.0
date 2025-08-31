import java.util.LinkedList;

public class LinkedListUsing_Framework {
    
    public static void main(String[] args) {
        //Create a Linked List
        LinkedList<Integer> link = new LinkedList<>();

        //Add the node 
        link.addFirst(1);
        link.addFirst(2);
        link.addLast(5);
        System.out.println("LinkedList: "+link);
        //remove the Node
        link.removeFirst();
        link.removeLast();

        //print
        System.out.println("After Deletion: "+link);

    }
}
