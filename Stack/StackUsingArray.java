import java.util.Stack;
class StackUsingArray {
    static class Stack {
    
        int arr[];
        int top;

        Stack(int size){
            this.arr = new int[size];
            top = -1;
        }

        //Empty
        public boolean isEmpty(){
            return top==-1;
        }

        //PUsh
        public void push(int val){
            if(top==arr.length){
                System.out.println("Overflow!!!!");
                return;
            }
            top++;
            arr[top]= val;
        }

        //pop
        public int pop(){
            if(top==-1){
                System.out.println("Underflow!!!!");
                return -1;
            }
            
            return arr[top--];
        }

        //peek
        public int peek(){
            if(top==-1){
                System.out.println("Underflow!!!!");
                return -1;
            }
            
            return arr[top];
        }
    }

    public static void main(String[] args) {
        Stack stk = new Stack(5);
        System.out.println(stk.isEmpty());
        stk.push(4);
        stk.push(5);
        stk.push(3);

        while (!stk.isEmpty()) {
            System.out.println("Top Value: "+stk.peek());
            stk.pop();
        }
        System.out.println(stk.peek());
    }
}

