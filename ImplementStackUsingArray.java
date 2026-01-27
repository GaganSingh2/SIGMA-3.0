import java.util.Scanner;

public class ImplementStackUsingArray {
    static class Stack{
        int arr[];
        int size;
        int top;

        Stack(int size){
            this.size = size;
            this.arr = new int[size];
            this.top = -1;
            System.out.println("Stack Created With Size "+size);
        }

        //FOr Empty
        public boolean isEmpty(){
            return top == -1;
        }

        //For Full
        public boolean isFull(){
            return top == size-1;
        }

        //For Push
        public void push(int data){
            if(isFull()){
                System.out.println("Overflow!!");
                // return;
            }
            else{
                arr[++top] = data;
                System.out.println(data+" inserted in Stack!!");
            }
        }

        //For Pop
        public int pop(){
            if(isEmpty()){
                System.out.println("Stack is Empty!!");
                return -1;
            }
            else{
                int val = arr[top--];
                System.out.println(val+" Deleted from Stack!!");
                return val;
            }
        }

        //For Peek
        public int peek(){
            if (isEmpty()) {
                System.out.println("Underflow");
                return -1;
            }
            else{
                System.out.println("Top Value of Stack: "+arr[top]);
            }
            return arr[top];
        }

        //For Clear
        public void clear(){
           top = -1;
        }

        //For Display
        public void display(){
            if(isEmpty()){
                System.out.println("Stack is Empty!!");
            }
            else{
                System.out.println("Data Display==");
                for(int i=top; i>=0; i--){
                    System.out.println("Data: "+arr[i]);
                }
            }
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("====Welcome To Stack DS====");
        System.out.println("Enter the Size of Stack: ");
        int size = sc.nextInt();
        Stack stk = new Stack(size);

        while (true) {
            // System.out.println("====Enter Your Option====");
            
            
            while (true) {
                System.out.println("1.Push\n2.Pop\n3.Display\n4.Clear");
                System.out.println("5.Peek\n6.isEmpty\n7.isFull\n8.Exit");
                System.out.println("Enter Your Option: ");
                int opt = sc.nextInt();
                switch (opt) {
                    case 1:
                        System.out.println("Enter the Element: ");
                        int val = sc.nextInt();
                        stk.push(val);
                        break;
                    case 2:
                        stk.pop();
                        break;
                    case 3:
                        stk.display();
                        break;
                
                    case 4:
                        stk.clear();
                        System.out.println("All Data Deleted from Stack!!");
                        break;
                    
                    case 5:
                        stk.peek();
                        break;
                    
                    case 6:
                        boolean empty= stk.isEmpty();
                        if (empty) System.out.println("Stack is Empty!!");
                        else System.out.println("Stack is Not Empty");       
                        break;

                    case 7:
                        boolean full= stk.isFull();
                        if (full) System.out.println("Stack is full!!");
                        else System.out.println("Stack is Not full");       
                        break;

                    case 8:
                        System.out.println("Thank You Fou Using!!");
                        System.exit(0);
                    default:
                        break;
                }
            }
        }
    }
}
