package workSpace.src.slidingWindow;

public class BuySellStockII {

    private int maxProfit(int[] prices) {
        int profit = 0;
        for (int dayOne = 0, dayTwo = 1; dayOne < prices.length - 1 && dayTwo < prices.length; ) {
            if(prices[dayOne] < prices[dayTwo]) {
                profit += prices[dayTwo] - prices[dayOne];
            }
            dayTwo++; dayOne++;
        }

        return profit;
    }
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int profit = new BuySellStockII().maxProfit(prices);
        System.out.println(profit);
    }
}
