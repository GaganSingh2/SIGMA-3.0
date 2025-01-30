import java.util.ArrayList;

public class Stack_using_ArrayList {
    static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty(){
            return list.size() == 0;
        }
        
        //For Push
        public static void push(int data){
            list.add(data);
        }

        //for Pop
        public static int pop(){
            if (isEmpty()){
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        //for Peek
        public static int peek(){
            if (isEmpty()) {
                return -1;
            }
            return list.get(list.size()-1);
        }
    }
    public static void main(String[] args) {
        Stack sb = new Stack();
        sb.push(4);
        sb.push(1);
        sb.push(2);
        sb.push(3);
        sb.push(5);
        
        while (!sb.isEmpty()) {
            System.out.println(sb.peek());
            sb.pop();
        }
    }
}
