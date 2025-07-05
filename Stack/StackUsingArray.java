import java.util.Stack;
class StackUsingArray {
    static class Stack{
        int arr[];
        int top;
        Stack(int size){
            this.arr = new int[size];
            this.top = -1;
        }

        //For Empty of Stack
        public boolean isEmpty(){
            return top == -1;
        }

        //For push in Stack
        public void push(int data){
            if(top == arr.length-1){
                System.out.println("Stack OverFlow");
                return;
            }

            top++;
            arr[top] = data;
        }

        //for pop in stack
        public int pop(){
            if (isEmpty()) {
                System.out.println("Stack UnderFlow");
                return -1;
            }

            int topElement = arr[top];
            top--;
            return topElement;
        }

        //For peek in Stack
        public int peek(){
            if (isEmpty()) {
                System.out.println("Stack is Empty");
                return -1;
            }
            return arr[top];
        }
    }

    public static void main(String[] args) {
        Stack temp = new Stack(5);
        temp.push(10);
        temp.push(20);
        temp.push(30);
        temp.push(40);
        temp.push(50);
        temp.push(40);

        
        while (!temp.isEmpty()) {
            System.out.println(temp.peek());
            temp.pop();
        }
    }
}
