package Array;

public class BuyAndSellProblem {
    public static int maximumProfit(int price[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0; i<price.length; i++){
            if (buyPrice<price[i]) {
                int currProfit = price[i] - buyPrice;
                maxProfit = Math.max(maxProfit, currProfit);
            }
            else{
                buyPrice = price[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int price[] = TakeInput.takeInput();
        int res = maximumProfit(price);
        System.out.println("Maximum Profit: "+res);
    }
}
