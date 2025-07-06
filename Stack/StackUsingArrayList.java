import java.util.ArrayList;
import java.util.Stack;
class StackUsingArrayList {
    static class Stack{
        ArrayList<Integer> list = new ArrayList<>();
        //For Empty of Stack
        public boolean isEmpty(){
            return list.size() == 0;
        }

        //for Push in Stack
        public void push(int data){
            list.add(data);
        }

        //for pop in Stack
        public int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        //for peek in Stack
        public int peek(){
            if (isEmpty()) {
                return -1;
            }
            return list.get(list.size()-1);
        }
    }
    public static void main(String[] args) {
        Stack temp = new Stack();
        temp.push(10);
        temp.push(20);
        temp.push(30);
        temp.push(40);
        temp.push(50);
        
        while (!temp.isEmpty()) {
            System.out.println(temp.peek());
            temp.pop();
        }
        System.out.println("Stack is Empty: "+temp.peek());

    }
}
