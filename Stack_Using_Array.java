import java.util.Stack;
class Stack_Using_Array{
    static class Stack{
        static int arr[] = new int[5];
        static int top = -1;
        public static boolean isEmpty(){
            return top == -1;
        }
        
        public static void push(int data){
            if(top == arr.length){
                System.out.println("Stack is Full");
                return;
            }
            arr[++top] = data;
        }

        public static int pop(){
            if(top == -1){
                System.out.println("Stack is Empty");
                return -1;
            }
            return arr[top--];
        }

        public static int peek(){
            if(top == -1){
                System.out.println("Stack is Empty");
                return -1;
            }
            int res = arr[top];
            
            return res;
        }

    }
    public static void main(String[] args) {
        Stack sb = new Stack();

        sb.push(1);
        sb.push(2);
        sb.push(3);
        sb.push(4);
        sb.push(5);
        // sb.push(6);
        
        while (!sb.isEmpty()) {
            System.out.println(sb.peek());
            sb.pop();
            
        }
    }
}