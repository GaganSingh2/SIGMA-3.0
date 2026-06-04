package SameerSirDSA;

import java.util.Scanner;

public class StackCreationUsingArray {

    static class Stack {
        int size;
        int stack[];
        int top;

        Stack(int size) {
            this.size = size;
            this.stack = new int[size];
            this.top = -1;
        }

        public boolean isFull() {
            return top == stack.length - 1;
        }

        public boolean isEmpty() {
            return top == -1;
        }

        public void push(int data) {
            if (isFull()) {
                System.out.println("Stack Overflow");
                return;
            }
            stack[++top] = data;
            System.out.println(data + " Had been inserted in Stack");
        }

        public void pop() {
            if (isEmpty()) {
                System.out.println("Stack Underflow!");
                return;
            }
            System.out.println(stack[top] + " Had been deleted in Stack");
            top--;

        }

        public void peek() {
            if (isEmpty()) {
                System.out.println("Stack Underflow!");
                return;
            }
            System.out.println(stack[top] + "  Top Value In Stack!");
        }

        public void display() {
            if (isEmpty()) {
                System.out.println("Stack Underflow!");
                return;
            }

            System.out.println("Data Display: ");
            for (int i = top; i >= 0; i--) {
                System.out.println("Value: " + stack[i]);
            }
        }

        public void clear() {
            top = -1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size: ");
        int size = sc.nextInt();
        Stack st = new Stack(size);
        System.out.println("Stack is Created!");
        while (true) {
            System.out.println("\n===== STACK MENU =====");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. IsEmpty");
            System.out.println("6. IsFull");
            System.out.println("7. Clear");
            System.out.println("8. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Element: ");
                    int data = sc.nextInt();
                    st.push(data);
                    break;

                case 2:
                    st.pop();
                    break;

                case 3:
                    st.peek();
                    break;

                case 4:
                    st.display();
                    break;

                case 5:
                    System.out.println("Is Empty: " + st.isEmpty());
                    break;

                case 6:
                    System.out.println("Is Full: " + st.isFull());
                    break;

                case 7:
                    st.clear();
                    break;

                case 8:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}