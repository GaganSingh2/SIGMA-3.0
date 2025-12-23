import java.util.ArrayList;
import java.util.Stack;
class StackUsingArrayList {
    static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();

        //Empty
        public boolean isEmpty(){
            return list.size()==0;
        }
        
        //Push the value
        public void push(int val){
            list.add(val);
        }

        //Pop the value
        public int pop(){
            if(list.isEmpty()){
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        //Peek the value
        public int peek(){
            if(list.isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
        }
    }
    public static void main(String[] args) {
        Stack stk = new Stack();
        stk.push(3);
        stk.push(43);
        stk.push(23);
        stk.push(2);
        System.out.println("Top Value: "+stk.peek());
        while (!stk.isEmpty()) {
            System.out.println("Top Value: "+stk.peek());
            stk.pop();
        }
        System.out.println("Top Value: "+stk.peek());
    }
}
