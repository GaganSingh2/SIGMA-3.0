import java.util.Scanner;
import java.util.Stack;
class PushAtBottom {

    public static void pushAtBottom(Stack<Integer> temp, int data){
        if(temp.isEmpty()){
            temp.push(data);
            return;
        }
        int top = temp.pop();
        pushAtBottom(temp, data);
        temp.push(top);
    }    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack<Integer> temp = new Stack<>();
        temp.push(1);
        temp.push(2);
        temp.push(3);

        System.out.println("Enter the data who goes into Bottom: ");
        int data = sc.nextInt();

        pushAtBottom(temp, data);
        System.out.println("After the Pushing the new value at Bottom: ");
        while (!temp.isEmpty()) {
            System.out.println("Value: "+temp.peek());
            temp.pop();
        }
    }
}
