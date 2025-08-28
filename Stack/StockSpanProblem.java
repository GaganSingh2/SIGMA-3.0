import java.util.Stack;
public class StockSpanProblem {

    private static void isStockSpan(int stocks[],int span[]){
        Stack<Integer> stk = new Stack<>();
        span[0] = 1;
        stk.push(0);
        for(int i=1; i<stocks.length; i++){
            int currPrice = stocks[i];
            while(!stk.isEmpty() && currPrice>stocks[stk.peek()]){
                stk.pop();
            }
            if(stk.isEmpty()){
                span[i] = i+1;
            }else{
                int prevHigh = stk.peek();
                span[i] = i-prevHigh;
            }
            stk.push(i);
        }
    }
    public static void main(String[] args) {
        int stocks[] = {100,80,70,60,70,85,100};
        int span[] = new int[stocks.length];
        isStockSpan(stocks,span);
        for(int i=0; i<span.length; i++){
            System.out.println(span[i]+" ");
        }
    }
}
