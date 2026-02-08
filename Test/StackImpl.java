package Test;

import java.util.Scanner;

public class StackImpl {
    static class Stack{
        int arr[];
        int top;
        int size;

        Stack(int size){
            this.size = size;
            this.arr = new int[size];
            top = -1;
        }

        //Overflow
        public boolean isFull(){
            // System.out.println("Stack Overflow!");
            return top == arr.length-1;
        }

        //UnderFlow
        public boolean isEmpty(){
            // System.out.println("Stack UnderFlow!");
            return top == -1;
        }

        //Push
        public void push(int data){
            if(isFull()){
                System.out.println("Stack Overflow!");
            }
            else{
                arr[++top] = data;
                System.out.println(data+" Had been inserted in Stack");
            }
        }

        //Pop
        public void pop(){
            if(isEmpty()){
                System.out.println("Stack Underflow!");
            }
            else{
                System.out.println(arr[top]+" deleted from Stack!");
                top--;
            }
        }

        //Peek
        public void peek(){
            if(isEmpty()){
                System.out.println("Stack Underflow!");
            }
            else{
                System.out.println(arr[top]+" Top Value In Stack!");
            }
        }

        //Dislplay
        public void display(){
            if(isEmpty()){
                System.out.println("Stack Underflow!");
            }
            else{
                System.out.println("Data Display: ");
                for(int i=top; i>=0; i--){
                    System.out.println("Value: "+arr[i]);
                }
            }
        }

        //Clear
        public void clear(){
            top = -1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        Stack st = new Stack(size);
        st.push(2);
        st.push(3);
        st.push(32);
        st.push(29);
        st.push(35);
        st.push(20);
        st.display();
        st.pop();
        st.display();
        st.peek();
        st.clear();
        st.display();
    }
}
