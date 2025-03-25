import java.util.Deque;
import java.util.LinkedList;
public class Double_Ended_Queue {
    public static void main(String[] args) {
        Deque<Integer> list = new LinkedList<>();

        list.addFirst(1);
        list.addFirst(2);
        list.addLast(3);
        list.addLast(4);
        System.out.println("List: "+list);
        list.removeFirst();
        System.out.println("After the First Value Remove: "+list);
        list.removeLast();
        System.out.println("After the Last Value Remove: "+list);

        list.addFirst(5);
        list.addLast(8);
        System.out.println("List: "+list);
        System.out.println("First Element: "+list.getFirst());
        System.out.println("Last Elment: "+list.getLast());
    }
}
