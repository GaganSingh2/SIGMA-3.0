import java.util.Scanner;
import java.util.Stack;
public class StockSpanProblem {

    public static void stockSpan(int stock[]){
        int span[] = new int[stock.length];
        Stack<Integer> list = new Stack<>();

        span[0] = 1;
        list.push(0);
        for(int i=1; i<stock.length; i++){
            int currPrice = stock[i];
            while (!list.isEmpty() && currPrice>=stock[list.peek()]) {
                list.pop();
            }
            if (list.isEmpty()) {
                span[i] = i+1;
            }
            else{
                int prevHigh = list.peek();
                span[i] = i-prevHigh;
            }
            list.push(i);
        }
        System.out.println("Span: ");
        for(int i=0; i<span.length; i++){
            System.out.print(span[i]+" ");
        }System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Days: ");
        int day = sc.nextInt();
        int stock[] = new int[day];

        System.out.println("Enter the Price Of Stack: ");
        for(int i=0; i<stock.length; i++){
            stock[i] = sc.nextInt();
        }
        System.out.println("Stack: ");
        for(int i=0; i<stock.length; i++){
            System.out.print(stock[i]+" ");
        }System.out.println();
        stockSpan(stock);
    }
}
